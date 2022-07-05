package com.example.server.service;

import com.example.api.grpc.userInfo.*;
import io.grpc.stub.StreamObserver;
import javafx.beans.binding.When;
import net.devh.boot.grpc.server.service.GrpcService;

/**
 * @author xiegaobing
 * @description:
 * @date 2022/7/53:43 下午
 */
@GrpcService
public class UserInfoServiceGrpcImpl extends UserInfoServiceGrpc.UserInfoServiceImplBase {
    @Override
    public void queryUserInfo(UserInfoReq request, StreamObserver<UserInfoResponse> responseObserver) {
        UserInfoResponse.Builder userInfoResp = UserInfoResponse.newBuilder();
        userInfoResp.setCode(0).setMsg("success").setSuccess(true);
        UserInfo.Builder userInfo = UserInfo.newBuilder();
        userInfo.setId(request.getId());
        userInfo.setName(request.getName());

        userInfoResp.setData(UserInfoResponse.Data.newBuilder().setUserInfo(userInfo));
        responseObserver.onNext(userInfoResp.build());
        responseObserver.onCompleted();
    }

    @Override
    public void queryUserInfo2(UserInfoReq request, StreamObserver<UserInfoResponse> responseObserver) {
        super.queryUserInfo2(request, responseObserver);
    }

    @Override
    public void queryUserInfo3(UserStr request, StreamObserver<UserStr> responseObserver) {
        System.out.println("queryUserInfo3 =======> " + request.getStr());
        responseObserver.onNext(UserStr.newBuilder().setStr("msg : success").build());
        while ("end".equals(request.getStr())) {
            responseObserver.onCompleted();
        }
    }
}
