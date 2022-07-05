package com.example.client.controller;

import com.example.api.grpc.userInfo.UserInfoServiceGrpc;
import com.example.api.grpc.userInfo.UserStr;
import com.google.common.util.concurrent.ListenableFuture;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * @author xiegaobing
 * @description:
 * @date 2022/7/54:24 下午
 */
@RestController
@RequestMapping("/userInfo")
public class UserInfoController {

    @GrpcClient("grpc-server")
    UserInfoServiceGrpc.UserInfoServiceFutureStub userInfoServiceFutureStub;

    private volatile String str;

    private static Executor executor = Executors.newSingleThreadExecutor();

    @RequestMapping(value = "/{str}")
    public String setStr(@PathVariable String str) {
        this.str = str;
        return "success";
    }

    @RequestMapping(value = "/query/{id}")
    public String queryUser(@PathVariable Integer id) {
        String userResp = null;
        try {
            String str = "msg : success";
            userResp = "";
            while (!userResp.equals(str)) {
                ListenableFuture<UserStr> userStrListenableFuture = userInfoServiceFutureStub.queryUserInfo3(UserStr.newBuilder().setStr(str).build());
                userStrListenableFuture.addListener(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            userStrListenableFuture.get();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        } catch (ExecutionException e) {
                            e.printStackTrace();
                        }
                        System.out.println("123");
                    }
                }, executor);
                UserStr userStr = userStrListenableFuture.get();
                userResp = userStr.getStr();
            }
//            UserInfoResponse userInfoResponse2 = userInfoServiceFutureStub.queryUserInfo2(UserInfoReq.newBuilder().setName(str).setId(1).build()).get();
//            UserInfoResponse userInfoResponse = userInfoServiceFutureStub.queryUserInfo(UserInfoReq.newBuilder().setName(str).setId(2).build()).get();
            return userResp;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return userResp;
    }

}
