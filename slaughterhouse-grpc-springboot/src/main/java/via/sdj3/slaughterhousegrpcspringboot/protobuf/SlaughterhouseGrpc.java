package via.sdj3.slaughterhousegrpcspringboot.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: Slaughterhouse.proto")
public final class SlaughterhouseGrpc {

  private SlaughterhouseGrpc() {}

  public static final String SERVICE_NAME = "Slaughterhouse";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.sdj3.slaughterhousegrpcspringboot.protobuf.ProductPacks,
      via.sdj3.slaughterhousegrpcspringboot.protobuf.Animals> getGetAllAnimalRegNrInProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllAnimalRegNrInProduct",
      requestType = via.sdj3.slaughterhousegrpcspringboot.protobuf.ProductPacks.class,
      responseType = via.sdj3.slaughterhousegrpcspringboot.protobuf.Animals.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.slaughterhousegrpcspringboot.protobuf.ProductPacks,
      via.sdj3.slaughterhousegrpcspringboot.protobuf.Animals> getGetAllAnimalRegNrInProductMethod() {
    io.grpc.MethodDescriptor<via.sdj3.slaughterhousegrpcspringboot.protobuf.ProductPacks, via.sdj3.slaughterhousegrpcspringboot.protobuf.Animals> getGetAllAnimalRegNrInProductMethod;
    if ((getGetAllAnimalRegNrInProductMethod = SlaughterhouseGrpc.getGetAllAnimalRegNrInProductMethod) == null) {
      synchronized (SlaughterhouseGrpc.class) {
        if ((getGetAllAnimalRegNrInProductMethod = SlaughterhouseGrpc.getGetAllAnimalRegNrInProductMethod) == null) {
          SlaughterhouseGrpc.getGetAllAnimalRegNrInProductMethod = getGetAllAnimalRegNrInProductMethod =
              io.grpc.MethodDescriptor.<via.sdj3.slaughterhousegrpcspringboot.protobuf.ProductPacks, via.sdj3.slaughterhousegrpcspringboot.protobuf.Animals>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllAnimalRegNrInProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.slaughterhousegrpcspringboot.protobuf.ProductPacks.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.slaughterhousegrpcspringboot.protobuf.Animals.getDefaultInstance()))
              .setSchemaDescriptor(new SlaughterhouseMethodDescriptorSupplier("getAllAnimalRegNrInProduct"))
              .build();
        }
      }
    }
    return getGetAllAnimalRegNrInProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.slaughterhousegrpcspringboot.protobuf.Animal,
      via.sdj3.slaughterhousegrpcspringboot.protobuf.ProductPacks> getGetAllProductFromAnimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllProductFromAnimal",
      requestType = via.sdj3.slaughterhousegrpcspringboot.protobuf.Animal.class,
      responseType = via.sdj3.slaughterhousegrpcspringboot.protobuf.ProductPacks.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<via.sdj3.slaughterhousegrpcspringboot.protobuf.Animal,
      via.sdj3.slaughterhousegrpcspringboot.protobuf.ProductPacks> getGetAllProductFromAnimalMethod() {
    io.grpc.MethodDescriptor<via.sdj3.slaughterhousegrpcspringboot.protobuf.Animal, via.sdj3.slaughterhousegrpcspringboot.protobuf.ProductPacks> getGetAllProductFromAnimalMethod;
    if ((getGetAllProductFromAnimalMethod = SlaughterhouseGrpc.getGetAllProductFromAnimalMethod) == null) {
      synchronized (SlaughterhouseGrpc.class) {
        if ((getGetAllProductFromAnimalMethod = SlaughterhouseGrpc.getGetAllProductFromAnimalMethod) == null) {
          SlaughterhouseGrpc.getGetAllProductFromAnimalMethod = getGetAllProductFromAnimalMethod =
              io.grpc.MethodDescriptor.<via.sdj3.slaughterhousegrpcspringboot.protobuf.Animal, via.sdj3.slaughterhousegrpcspringboot.protobuf.ProductPacks>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllProductFromAnimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.slaughterhousegrpcspringboot.protobuf.Animal.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.slaughterhousegrpcspringboot.protobuf.ProductPacks.getDefaultInstance()))
              .setSchemaDescriptor(new SlaughterhouseMethodDescriptorSupplier("getAllProductFromAnimal"))
              .build();
        }
      }
    }
    return getGetAllProductFromAnimalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.slaughterhousegrpcspringboot.protobuf.Empty,
      via.sdj3.slaughterhousegrpcspringboot.protobuf.AliveResponse> getGetAliveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAlive",
      requestType = via.sdj3.slaughterhousegrpcspringboot.protobuf.Empty.class,
      responseType = via.sdj3.slaughterhousegrpcspringboot.protobuf.AliveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.slaughterhousegrpcspringboot.protobuf.Empty,
      via.sdj3.slaughterhousegrpcspringboot.protobuf.AliveResponse> getGetAliveMethod() {
    io.grpc.MethodDescriptor<via.sdj3.slaughterhousegrpcspringboot.protobuf.Empty, via.sdj3.slaughterhousegrpcspringboot.protobuf.AliveResponse> getGetAliveMethod;
    if ((getGetAliveMethod = SlaughterhouseGrpc.getGetAliveMethod) == null) {
      synchronized (SlaughterhouseGrpc.class) {
        if ((getGetAliveMethod = SlaughterhouseGrpc.getGetAliveMethod) == null) {
          SlaughterhouseGrpc.getGetAliveMethod = getGetAliveMethod =
              io.grpc.MethodDescriptor.<via.sdj3.slaughterhousegrpcspringboot.protobuf.Empty, via.sdj3.slaughterhousegrpcspringboot.protobuf.AliveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAlive"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.slaughterhousegrpcspringboot.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.slaughterhousegrpcspringboot.protobuf.AliveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SlaughterhouseMethodDescriptorSupplier("getAlive"))
              .build();
        }
      }
    }
    return getGetAliveMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SlaughterhouseStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SlaughterhouseStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SlaughterhouseStub>() {
        @java.lang.Override
        public SlaughterhouseStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SlaughterhouseStub(channel, callOptions);
        }
      };
    return SlaughterhouseStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SlaughterhouseBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SlaughterhouseBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SlaughterhouseBlockingStub>() {
        @java.lang.Override
        public SlaughterhouseBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SlaughterhouseBlockingStub(channel, callOptions);
        }
      };
    return SlaughterhouseBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SlaughterhouseFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SlaughterhouseFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SlaughterhouseFutureStub>() {
        @java.lang.Override
        public SlaughterhouseFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SlaughterhouseFutureStub(channel, callOptions);
        }
      };
    return SlaughterhouseFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SlaughterhouseImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAllAnimalRegNrInProduct(via.sdj3.slaughterhousegrpcspringboot.protobuf.ProductPacks request,
        io.grpc.stub.StreamObserver<via.sdj3.slaughterhousegrpcspringboot.protobuf.Animals> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllAnimalRegNrInProductMethod(), responseObserver);
    }

    /**
     */
    public void getAllProductFromAnimal(via.sdj3.slaughterhousegrpcspringboot.protobuf.Animal request,
        io.grpc.stub.StreamObserver<via.sdj3.slaughterhousegrpcspringboot.protobuf.ProductPacks> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllProductFromAnimalMethod(), responseObserver);
    }

    /**
     */
    public void getAlive(via.sdj3.slaughterhousegrpcspringboot.protobuf.Empty request,
        io.grpc.stub.StreamObserver<via.sdj3.slaughterhousegrpcspringboot.protobuf.AliveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAliveMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllAnimalRegNrInProductMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.slaughterhousegrpcspringboot.protobuf.ProductPacks,
                via.sdj3.slaughterhousegrpcspringboot.protobuf.Animals>(
                  this, METHODID_GET_ALL_ANIMAL_REG_NR_IN_PRODUCT)))
          .addMethod(
            getGetAllProductFromAnimalMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                via.sdj3.slaughterhousegrpcspringboot.protobuf.Animal,
                via.sdj3.slaughterhousegrpcspringboot.protobuf.ProductPacks>(
                  this, METHODID_GET_ALL_PRODUCT_FROM_ANIMAL)))
          .addMethod(
            getGetAliveMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.slaughterhousegrpcspringboot.protobuf.Empty,
                via.sdj3.slaughterhousegrpcspringboot.protobuf.AliveResponse>(
                  this, METHODID_GET_ALIVE)))
          .build();
    }
  }

  /**
   */
  public static final class SlaughterhouseStub extends io.grpc.stub.AbstractAsyncStub<SlaughterhouseStub> {
    private SlaughterhouseStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SlaughterhouseStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SlaughterhouseStub(channel, callOptions);
    }

    /**
     */
    public void getAllAnimalRegNrInProduct(via.sdj3.slaughterhousegrpcspringboot.protobuf.ProductPacks request,
        io.grpc.stub.StreamObserver<via.sdj3.slaughterhousegrpcspringboot.protobuf.Animals> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllAnimalRegNrInProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllProductFromAnimal(via.sdj3.slaughterhousegrpcspringboot.protobuf.Animal request,
        io.grpc.stub.StreamObserver<via.sdj3.slaughterhousegrpcspringboot.protobuf.ProductPacks> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetAllProductFromAnimalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAlive(via.sdj3.slaughterhousegrpcspringboot.protobuf.Empty request,
        io.grpc.stub.StreamObserver<via.sdj3.slaughterhousegrpcspringboot.protobuf.AliveResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAliveMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SlaughterhouseBlockingStub extends io.grpc.stub.AbstractBlockingStub<SlaughterhouseBlockingStub> {
    private SlaughterhouseBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SlaughterhouseBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SlaughterhouseBlockingStub(channel, callOptions);
    }

    /**
     */
    public via.sdj3.slaughterhousegrpcspringboot.protobuf.Animals getAllAnimalRegNrInProduct(via.sdj3.slaughterhousegrpcspringboot.protobuf.ProductPacks request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllAnimalRegNrInProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<via.sdj3.slaughterhousegrpcspringboot.protobuf.ProductPacks> getAllProductFromAnimal(
        via.sdj3.slaughterhousegrpcspringboot.protobuf.Animal request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetAllProductFromAnimalMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.slaughterhousegrpcspringboot.protobuf.AliveResponse getAlive(via.sdj3.slaughterhousegrpcspringboot.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAliveMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SlaughterhouseFutureStub extends io.grpc.stub.AbstractFutureStub<SlaughterhouseFutureStub> {
    private SlaughterhouseFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SlaughterhouseFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SlaughterhouseFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.slaughterhousegrpcspringboot.protobuf.Animals> getAllAnimalRegNrInProduct(
        via.sdj3.slaughterhousegrpcspringboot.protobuf.ProductPacks request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllAnimalRegNrInProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.slaughterhousegrpcspringboot.protobuf.AliveResponse> getAlive(
        via.sdj3.slaughterhousegrpcspringboot.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAliveMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_ANIMAL_REG_NR_IN_PRODUCT = 0;
  private static final int METHODID_GET_ALL_PRODUCT_FROM_ANIMAL = 1;
  private static final int METHODID_GET_ALIVE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SlaughterhouseImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SlaughterhouseImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_ANIMAL_REG_NR_IN_PRODUCT:
          serviceImpl.getAllAnimalRegNrInProduct((via.sdj3.slaughterhousegrpcspringboot.protobuf.ProductPacks) request,
              (io.grpc.stub.StreamObserver<via.sdj3.slaughterhousegrpcspringboot.protobuf.Animals>) responseObserver);
          break;
        case METHODID_GET_ALL_PRODUCT_FROM_ANIMAL:
          serviceImpl.getAllProductFromAnimal((via.sdj3.slaughterhousegrpcspringboot.protobuf.Animal) request,
              (io.grpc.stub.StreamObserver<via.sdj3.slaughterhousegrpcspringboot.protobuf.ProductPacks>) responseObserver);
          break;
        case METHODID_GET_ALIVE:
          serviceImpl.getAlive((via.sdj3.slaughterhousegrpcspringboot.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<via.sdj3.slaughterhousegrpcspringboot.protobuf.AliveResponse>) responseObserver);
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

  private static abstract class SlaughterhouseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SlaughterhouseBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.sdj3.slaughterhousegrpcspringboot.protobuf.SlaughterhouseOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Slaughterhouse");
    }
  }

  private static final class SlaughterhouseFileDescriptorSupplier
      extends SlaughterhouseBaseDescriptorSupplier {
    SlaughterhouseFileDescriptorSupplier() {}
  }

  private static final class SlaughterhouseMethodDescriptorSupplier
      extends SlaughterhouseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SlaughterhouseMethodDescriptorSupplier(String methodName) {
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
      synchronized (SlaughterhouseGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SlaughterhouseFileDescriptorSupplier())
              .addMethod(getGetAllAnimalRegNrInProductMethod())
              .addMethod(getGetAllProductFromAnimalMethod())
              .addMethod(getGetAliveMethod())
              .build();
        }
      }
    }
    return result;
  }
}
