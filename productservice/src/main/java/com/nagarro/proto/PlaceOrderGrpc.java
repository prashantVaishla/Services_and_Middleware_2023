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
public final class PlaceOrderGrpc {

  private PlaceOrderGrpc() {}

  public static final String SERVICE_NAME = "PlaceOrder";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.nagarro.proto.OrderService.OrderRequest,
      com.nagarro.proto.OrderService.OrderReply> getPlaceOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "placeOrder",
      requestType = com.nagarro.proto.OrderService.OrderRequest.class,
      responseType = com.nagarro.proto.OrderService.OrderReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.nagarro.proto.OrderService.OrderRequest,
      com.nagarro.proto.OrderService.OrderReply> getPlaceOrderMethod() {
    io.grpc.MethodDescriptor<com.nagarro.proto.OrderService.OrderRequest, com.nagarro.proto.OrderService.OrderReply> getPlaceOrderMethod;
    if ((getPlaceOrderMethod = PlaceOrderGrpc.getPlaceOrderMethod) == null) {
      synchronized (PlaceOrderGrpc.class) {
        if ((getPlaceOrderMethod = PlaceOrderGrpc.getPlaceOrderMethod) == null) {
          PlaceOrderGrpc.getPlaceOrderMethod = getPlaceOrderMethod = 
              io.grpc.MethodDescriptor.<com.nagarro.proto.OrderService.OrderRequest, com.nagarro.proto.OrderService.OrderReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PlaceOrder", "placeOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nagarro.proto.OrderService.OrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nagarro.proto.OrderService.OrderReply.getDefaultInstance()))
                  .setSchemaDescriptor(new PlaceOrderMethodDescriptorSupplier("placeOrder"))
                  .build();
          }
        }
     }
     return getPlaceOrderMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PlaceOrderStub newStub(io.grpc.Channel channel) {
    return new PlaceOrderStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PlaceOrderBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PlaceOrderBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PlaceOrderFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PlaceOrderFutureStub(channel);
  }

  /**
   */
  public static abstract class PlaceOrderImplBase implements io.grpc.BindableService {

    /**
     */
    public void placeOrder(com.nagarro.proto.OrderService.OrderRequest request,
        io.grpc.stub.StreamObserver<com.nagarro.proto.OrderService.OrderReply> responseObserver) {
      asyncUnimplementedUnaryCall(getPlaceOrderMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPlaceOrderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.nagarro.proto.OrderService.OrderRequest,
                com.nagarro.proto.OrderService.OrderReply>(
                  this, METHODID_PLACE_ORDER)))
          .build();
    }
  }

  /**
   */
  public static final class PlaceOrderStub extends io.grpc.stub.AbstractStub<PlaceOrderStub> {
    private PlaceOrderStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PlaceOrderStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlaceOrderStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PlaceOrderStub(channel, callOptions);
    }

    /**
     */
    public void placeOrder(com.nagarro.proto.OrderService.OrderRequest request,
        io.grpc.stub.StreamObserver<com.nagarro.proto.OrderService.OrderReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPlaceOrderMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PlaceOrderBlockingStub extends io.grpc.stub.AbstractStub<PlaceOrderBlockingStub> {
    private PlaceOrderBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PlaceOrderBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlaceOrderBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PlaceOrderBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.nagarro.proto.OrderService.OrderReply placeOrder(com.nagarro.proto.OrderService.OrderRequest request) {
      return blockingUnaryCall(
          getChannel(), getPlaceOrderMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PlaceOrderFutureStub extends io.grpc.stub.AbstractStub<PlaceOrderFutureStub> {
    private PlaceOrderFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PlaceOrderFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlaceOrderFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PlaceOrderFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.nagarro.proto.OrderService.OrderReply> placeOrder(
        com.nagarro.proto.OrderService.OrderRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPlaceOrderMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PLACE_ORDER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PlaceOrderImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PlaceOrderImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PLACE_ORDER:
          serviceImpl.placeOrder((com.nagarro.proto.OrderService.OrderRequest) request,
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

  private static abstract class PlaceOrderBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PlaceOrderBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.nagarro.proto.OrderService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PlaceOrder");
    }
  }

  private static final class PlaceOrderFileDescriptorSupplier
      extends PlaceOrderBaseDescriptorSupplier {
    PlaceOrderFileDescriptorSupplier() {}
  }

  private static final class PlaceOrderMethodDescriptorSupplier
      extends PlaceOrderBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PlaceOrderMethodDescriptorSupplier(String methodName) {
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
      synchronized (PlaceOrderGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PlaceOrderFileDescriptorSupplier())
              .addMethod(getPlaceOrderMethod())
              .build();
        }
      }
    }
    return result;
  }
}
