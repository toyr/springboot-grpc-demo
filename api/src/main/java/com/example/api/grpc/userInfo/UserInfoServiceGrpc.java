package com.example.api.grpc.userInfo;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.34.1)",
    comments = "Source: userInfo.proto")
public final class UserInfoServiceGrpc {

  private UserInfoServiceGrpc() {}

  public static final String SERVICE_NAME = "UserInfoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.api.grpc.userInfo.UserInfoReq,
      com.example.api.grpc.userInfo.UserInfoResponse> getQueryUserInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "queryUserInfo",
      requestType = com.example.api.grpc.userInfo.UserInfoReq.class,
      responseType = com.example.api.grpc.userInfo.UserInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.api.grpc.userInfo.UserInfoReq,
      com.example.api.grpc.userInfo.UserInfoResponse> getQueryUserInfoMethod() {
    io.grpc.MethodDescriptor<com.example.api.grpc.userInfo.UserInfoReq, com.example.api.grpc.userInfo.UserInfoResponse> getQueryUserInfoMethod;
    if ((getQueryUserInfoMethod = UserInfoServiceGrpc.getQueryUserInfoMethod) == null) {
      synchronized (UserInfoServiceGrpc.class) {
        if ((getQueryUserInfoMethod = UserInfoServiceGrpc.getQueryUserInfoMethod) == null) {
          UserInfoServiceGrpc.getQueryUserInfoMethod = getQueryUserInfoMethod =
              io.grpc.MethodDescriptor.<com.example.api.grpc.userInfo.UserInfoReq, com.example.api.grpc.userInfo.UserInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "queryUserInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.api.grpc.userInfo.UserInfoReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.api.grpc.userInfo.UserInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserInfoServiceMethodDescriptorSupplier("queryUserInfo"))
              .build();
        }
      }
    }
    return getQueryUserInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.api.grpc.userInfo.UserInfoReq,
      com.example.api.grpc.userInfo.UserInfoResponse> getQueryUserInfo2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "queryUserInfo2",
      requestType = com.example.api.grpc.userInfo.UserInfoReq.class,
      responseType = com.example.api.grpc.userInfo.UserInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.api.grpc.userInfo.UserInfoReq,
      com.example.api.grpc.userInfo.UserInfoResponse> getQueryUserInfo2Method() {
    io.grpc.MethodDescriptor<com.example.api.grpc.userInfo.UserInfoReq, com.example.api.grpc.userInfo.UserInfoResponse> getQueryUserInfo2Method;
    if ((getQueryUserInfo2Method = UserInfoServiceGrpc.getQueryUserInfo2Method) == null) {
      synchronized (UserInfoServiceGrpc.class) {
        if ((getQueryUserInfo2Method = UserInfoServiceGrpc.getQueryUserInfo2Method) == null) {
          UserInfoServiceGrpc.getQueryUserInfo2Method = getQueryUserInfo2Method =
              io.grpc.MethodDescriptor.<com.example.api.grpc.userInfo.UserInfoReq, com.example.api.grpc.userInfo.UserInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "queryUserInfo2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.api.grpc.userInfo.UserInfoReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.api.grpc.userInfo.UserInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserInfoServiceMethodDescriptorSupplier("queryUserInfo2"))
              .build();
        }
      }
    }
    return getQueryUserInfo2Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.api.grpc.userInfo.UserStr,
      com.example.api.grpc.userInfo.UserStr> getQueryUserInfo3Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "queryUserInfo3",
      requestType = com.example.api.grpc.userInfo.UserStr.class,
      responseType = com.example.api.grpc.userInfo.UserStr.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.api.grpc.userInfo.UserStr,
      com.example.api.grpc.userInfo.UserStr> getQueryUserInfo3Method() {
    io.grpc.MethodDescriptor<com.example.api.grpc.userInfo.UserStr, com.example.api.grpc.userInfo.UserStr> getQueryUserInfo3Method;
    if ((getQueryUserInfo3Method = UserInfoServiceGrpc.getQueryUserInfo3Method) == null) {
      synchronized (UserInfoServiceGrpc.class) {
        if ((getQueryUserInfo3Method = UserInfoServiceGrpc.getQueryUserInfo3Method) == null) {
          UserInfoServiceGrpc.getQueryUserInfo3Method = getQueryUserInfo3Method =
              io.grpc.MethodDescriptor.<com.example.api.grpc.userInfo.UserStr, com.example.api.grpc.userInfo.UserStr>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "queryUserInfo3"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.api.grpc.userInfo.UserStr.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.api.grpc.userInfo.UserStr.getDefaultInstance()))
              .setSchemaDescriptor(new UserInfoServiceMethodDescriptorSupplier("queryUserInfo3"))
              .build();
        }
      }
    }
    return getQueryUserInfo3Method;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserInfoServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserInfoServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserInfoServiceStub>() {
        @java.lang.Override
        public UserInfoServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserInfoServiceStub(channel, callOptions);
        }
      };
    return UserInfoServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserInfoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserInfoServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserInfoServiceBlockingStub>() {
        @java.lang.Override
        public UserInfoServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserInfoServiceBlockingStub(channel, callOptions);
        }
      };
    return UserInfoServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserInfoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserInfoServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserInfoServiceFutureStub>() {
        @java.lang.Override
        public UserInfoServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserInfoServiceFutureStub(channel, callOptions);
        }
      };
    return UserInfoServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UserInfoServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void queryUserInfo(com.example.api.grpc.userInfo.UserInfoReq request,
        io.grpc.stub.StreamObserver<com.example.api.grpc.userInfo.UserInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryUserInfoMethod(), responseObserver);
    }

    /**
     */
    public void queryUserInfo2(com.example.api.grpc.userInfo.UserInfoReq request,
        io.grpc.stub.StreamObserver<com.example.api.grpc.userInfo.UserInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryUserInfo2Method(), responseObserver);
    }

    /**
     */
    public void queryUserInfo3(com.example.api.grpc.userInfo.UserStr request,
        io.grpc.stub.StreamObserver<com.example.api.grpc.userInfo.UserStr> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryUserInfo3Method(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getQueryUserInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.api.grpc.userInfo.UserInfoReq,
                com.example.api.grpc.userInfo.UserInfoResponse>(
                  this, METHODID_QUERY_USER_INFO)))
          .addMethod(
            getQueryUserInfo2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.api.grpc.userInfo.UserInfoReq,
                com.example.api.grpc.userInfo.UserInfoResponse>(
                  this, METHODID_QUERY_USER_INFO2)))
          .addMethod(
            getQueryUserInfo3Method(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.api.grpc.userInfo.UserStr,
                com.example.api.grpc.userInfo.UserStr>(
                  this, METHODID_QUERY_USER_INFO3)))
          .build();
    }
  }

  /**
   */
  public static final class UserInfoServiceStub extends io.grpc.stub.AbstractAsyncStub<UserInfoServiceStub> {
    private UserInfoServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserInfoServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserInfoServiceStub(channel, callOptions);
    }

    /**
     */
    public void queryUserInfo(com.example.api.grpc.userInfo.UserInfoReq request,
        io.grpc.stub.StreamObserver<com.example.api.grpc.userInfo.UserInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryUserInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryUserInfo2(com.example.api.grpc.userInfo.UserInfoReq request,
        io.grpc.stub.StreamObserver<com.example.api.grpc.userInfo.UserInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryUserInfo2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryUserInfo3(com.example.api.grpc.userInfo.UserStr request,
        io.grpc.stub.StreamObserver<com.example.api.grpc.userInfo.UserStr> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryUserInfo3Method(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserInfoServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<UserInfoServiceBlockingStub> {
    private UserInfoServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserInfoServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserInfoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.api.grpc.userInfo.UserInfoResponse queryUserInfo(com.example.api.grpc.userInfo.UserInfoReq request) {
      return blockingUnaryCall(
          getChannel(), getQueryUserInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.api.grpc.userInfo.UserInfoResponse queryUserInfo2(com.example.api.grpc.userInfo.UserInfoReq request) {
      return blockingUnaryCall(
          getChannel(), getQueryUserInfo2Method(), getCallOptions(), request);
    }

    /**
     */
    public com.example.api.grpc.userInfo.UserStr queryUserInfo3(com.example.api.grpc.userInfo.UserStr request) {
      return blockingUnaryCall(
          getChannel(), getQueryUserInfo3Method(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserInfoServiceFutureStub extends io.grpc.stub.AbstractFutureStub<UserInfoServiceFutureStub> {
    private UserInfoServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserInfoServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserInfoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.api.grpc.userInfo.UserInfoResponse> queryUserInfo(
        com.example.api.grpc.userInfo.UserInfoReq request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryUserInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.api.grpc.userInfo.UserInfoResponse> queryUserInfo2(
        com.example.api.grpc.userInfo.UserInfoReq request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryUserInfo2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.api.grpc.userInfo.UserStr> queryUserInfo3(
        com.example.api.grpc.userInfo.UserStr request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryUserInfo3Method(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QUERY_USER_INFO = 0;
  private static final int METHODID_QUERY_USER_INFO2 = 1;
  private static final int METHODID_QUERY_USER_INFO3 = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserInfoServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserInfoServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_QUERY_USER_INFO:
          serviceImpl.queryUserInfo((com.example.api.grpc.userInfo.UserInfoReq) request,
              (io.grpc.stub.StreamObserver<com.example.api.grpc.userInfo.UserInfoResponse>) responseObserver);
          break;
        case METHODID_QUERY_USER_INFO2:
          serviceImpl.queryUserInfo2((com.example.api.grpc.userInfo.UserInfoReq) request,
              (io.grpc.stub.StreamObserver<com.example.api.grpc.userInfo.UserInfoResponse>) responseObserver);
          break;
        case METHODID_QUERY_USER_INFO3:
          serviceImpl.queryUserInfo3((com.example.api.grpc.userInfo.UserStr) request,
              (io.grpc.stub.StreamObserver<com.example.api.grpc.userInfo.UserStr>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class UserInfoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserInfoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.api.grpc.userInfo.UserInfoOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserInfoService");
    }
  }

  private static final class UserInfoServiceFileDescriptorSupplier
      extends UserInfoServiceBaseDescriptorSupplier {
    UserInfoServiceFileDescriptorSupplier() {}
  }

  private static final class UserInfoServiceMethodDescriptorSupplier
      extends UserInfoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserInfoServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UserInfoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserInfoServiceFileDescriptorSupplier())
              .addMethod(getQueryUserInfoMethod())
              .addMethod(getQueryUserInfo2Method())
              .addMethod(getQueryUserInfo3Method())
              .build();
        }
      }
    }
    return result;
  }
}
