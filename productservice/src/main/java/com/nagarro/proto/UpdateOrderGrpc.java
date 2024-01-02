package com.nagarro.proto;

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
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: OrderService.proto")
public final class UpdateOrderGrpc {

  private UpdateOrderGrpc() {}

  public static final String SERVICE_NAME = "UpdateOrder";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.nagarro.proto.OrderService.OrderRequest,
      com.nagarro.proto.OrderService.OrderReply> getUpdateOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateOrder",
      requestType = com.nagarro.proto.OrderService.OrderRequest.class,
      responseType = com.nagarro.proto.OrderService.OrderReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.nagarro.proto.OrderService.OrderRequest,
      com.nagarro.proto.OrderService.OrderReply> getUpdateOrderMethod() {
    io.grpc.MethodDescriptor<com.nagarro.proto.OrderService.OrderRequest, com.nagarro.proto.OrderService.OrderReply> getUpdateOrderMethod;
    if ((getUpdateOrderMethod = UpdateOrderGrpc.getUpdateOrderMethod) == null) {
      synchronized (UpdateOrderGrpc.class) {
        if ((getUpdateOrderMethod = UpdateOrderGrpc.getUpdateOrderMethod) == null) {
          UpdateOrderGrpc.getUpdateOrderMethod = getUpdateOrderMethod = 
              io.grpc.MethodDescriptor.<com.nagarro.proto.OrderService.OrderRequest, com.nagarro.proto.OrderService.OrderReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UpdateOrder", "updateOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nagarro.proto.OrderService.OrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nagarro.proto.OrderService.OrderReply.getDefaultInstance()))
                  .setSchemaDescriptor(new UpdateOrderMethodDescriptorSupplier("updateOrder"))
                  .build();
          }
        }
     }
     return getUpdateOrderMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UpdateOrderStub newStub(io.grpc.Channel channel) {
    return new UpdateOrderStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UpdateOrderBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UpdateOrderBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UpdateOrderFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UpdateOrderFutureStub(channel);
  }

  /**
   */
  public static abstract class UpdateOrderImplBase implements io.grpc.BindableService {

    /**
     */
    public void updateOrder(com.nagarro.proto.OrderService.OrderRequest request,
        io.grpc.stub.StreamObserver<com.nagarro.proto.OrderService.OrderReply> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateOrderMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUpdateOrderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.nagarro.proto.OrderService.OrderRequest,
                com.nagarro.proto.OrderService.OrderReply>(
                  this, METHODID_UPDATE_ORDER)))
          .build();
    }
  }

  /**
   */
  public static final class UpdateOrderStub extends io.grpc.stub.AbstractStub<UpdateOrderStub> {
    private UpdateOrderStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UpdateOrderStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UpdateOrderStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UpdateOrderStub(channel, callOptions);
    }

    /**
     */
    public void updateOrder(com.nagarro.proto.OrderService.OrderRequest request,
        io.grpc.stub.StreamObserver<com.nagarro.proto.OrderService.OrderReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateOrderMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UpdateOrderBlockingStub extends io.grpc.stub.AbstractStub<UpdateOrderBlockingStub> {
    private UpdateOrderBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UpdateOrderBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UpdateOrderBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UpdateOrderBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.nagarro.proto.OrderService.OrderReply updateOrder(com.nagarro.proto.OrderService.OrderRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateOrderMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UpdateOrderFutureStub extends io.grpc.stub.AbstractStub<UpdateOrderFutureStub> {
    private UpdateOrderFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UpdateOrderFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UpdateOrderFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UpdateOrderFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.nagarro.proto.OrderService.OrderReply> updateOrder(
        com.nagarro.proto.OrderService.OrderRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateOrderMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPDATE_ORDER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UpdateOrderImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UpdateOrderImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPDATE_ORDER:
          serviceImpl.updateOrder((com.nagarro.proto.OrderService.OrderRequest) request,
              (io.grpc.stub.StreamObserver<com.nagarro.proto.OrderService.OrderReply>) responseObserver);
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

  private static abstract class UpdateOrderBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UpdateOrderBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.nagarro.proto.OrderService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UpdateOrder");
    }
  }

  private static final class UpdateOrderFileDescriptorSupplier
      extends UpdateOrderBaseDescriptorSupplier {
    UpdateOrderFileDescriptorSupplier() {}
  }

  private static final class UpdateOrderMethodDescriptorSupplier
      extends UpdateOrderBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UpdateOrderMethodDescriptorSupplier(String methodName) {
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
      synchronized (UpdateOrderGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UpdateOrderFileDescriptorSupplier())
              .addMethod(getUpdateOrderMethod())
              .build();
        }
      }
    }
    return result;
  }
}
