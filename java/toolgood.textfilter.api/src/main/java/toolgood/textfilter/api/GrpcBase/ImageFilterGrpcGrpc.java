package toolgood.textfilter.api.GrpcBase;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: imageFilter.proto")
public final class ImageFilterGrpcGrpc {

  private ImageFilterGrpcGrpc() {}

  public static final String SERVICE_NAME = "toolgood.textfilter.api.GrpcBase.ImageFilterGrpc";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<toolgood.textfilter.api.GrpcBase.ImageFilter.ImageLocalGrpcRequest,
      toolgood.textfilter.api.GrpcBase.ImageFilter.ImageFilterGrpcReply> getImageLocalFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ImageLocalFilter",
      requestType = toolgood.textfilter.api.GrpcBase.ImageFilter.ImageLocalGrpcRequest.class,
      responseType = toolgood.textfilter.api.GrpcBase.ImageFilter.ImageFilterGrpcReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<toolgood.textfilter.api.GrpcBase.ImageFilter.ImageLocalGrpcRequest,
      toolgood.textfilter.api.GrpcBase.ImageFilter.ImageFilterGrpcReply> getImageLocalFilterMethod() {
    io.grpc.MethodDescriptor<toolgood.textfilter.api.GrpcBase.ImageFilter.ImageLocalGrpcRequest, toolgood.textfilter.api.GrpcBase.ImageFilter.ImageFilterGrpcReply> getImageLocalFilterMethod;
    if ((getImageLocalFilterMethod = ImageFilterGrpcGrpc.getImageLocalFilterMethod) == null) {
      synchronized (ImageFilterGrpcGrpc.class) {
        if ((getImageLocalFilterMethod = ImageFilterGrpcGrpc.getImageLocalFilterMethod) == null) {
          ImageFilterGrpcGrpc.getImageLocalFilterMethod = getImageLocalFilterMethod =
              io.grpc.MethodDescriptor.<toolgood.textfilter.api.GrpcBase.ImageFilter.ImageLocalGrpcRequest, toolgood.textfilter.api.GrpcBase.ImageFilter.ImageFilterGrpcReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ImageLocalFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  toolgood.textfilter.api.GrpcBase.ImageFilter.ImageLocalGrpcRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  toolgood.textfilter.api.GrpcBase.ImageFilter.ImageFilterGrpcReply.getDefaultInstance()))
              .setSchemaDescriptor(new ImageFilterGrpcMethodDescriptorSupplier("ImageLocalFilter"))
              .build();
        }
      }
    }
    return getImageLocalFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<toolgood.textfilter.api.GrpcBase.ImageFilter.ImageUploadGrpcRequest,
      toolgood.textfilter.api.GrpcBase.ImageFilter.ImageFilterGrpcReply> getImageUploadFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ImageUploadFilter",
      requestType = toolgood.textfilter.api.GrpcBase.ImageFilter.ImageUploadGrpcRequest.class,
      responseType = toolgood.textfilter.api.GrpcBase.ImageFilter.ImageFilterGrpcReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<toolgood.textfilter.api.GrpcBase.ImageFilter.ImageUploadGrpcRequest,
      toolgood.textfilter.api.GrpcBase.ImageFilter.ImageFilterGrpcReply> getImageUploadFilterMethod() {
    io.grpc.MethodDescriptor<toolgood.textfilter.api.GrpcBase.ImageFilter.ImageUploadGrpcRequest, toolgood.textfilter.api.GrpcBase.ImageFilter.ImageFilterGrpcReply> getImageUploadFilterMethod;
    if ((getImageUploadFilterMethod = ImageFilterGrpcGrpc.getImageUploadFilterMethod) == null) {
      synchronized (ImageFilterGrpcGrpc.class) {
        if ((getImageUploadFilterMethod = ImageFilterGrpcGrpc.getImageUploadFilterMethod) == null) {
          ImageFilterGrpcGrpc.getImageUploadFilterMethod = getImageUploadFilterMethod =
              io.grpc.MethodDescriptor.<toolgood.textfilter.api.GrpcBase.ImageFilter.ImageUploadGrpcRequest, toolgood.textfilter.api.GrpcBase.ImageFilter.ImageFilterGrpcReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ImageUploadFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  toolgood.textfilter.api.GrpcBase.ImageFilter.ImageUploadGrpcRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  toolgood.textfilter.api.GrpcBase.ImageFilter.ImageFilterGrpcReply.getDefaultInstance()))
              .setSchemaDescriptor(new ImageFilterGrpcMethodDescriptorSupplier("ImageUploadFilter"))
              .build();
        }
      }
    }
    return getImageUploadFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<toolgood.textfilter.api.GrpcBase.ImageFilter.ImageLocalAsyncGrpcRequest,
      toolgood.textfilter.api.GrpcBase.ImageFilter.ImageRequestIdGrpcReply> getImageLocalFilterAsyncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ImageLocalFilterAsync",
      requestType = toolgood.textfilter.api.GrpcBase.ImageFilter.ImageLocalAsyncGrpcRequest.class,
      responseType = toolgood.textfilter.api.GrpcBase.ImageFilter.ImageRequestIdGrpcReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<toolgood.textfilter.api.GrpcBase.ImageFilter.ImageLocalAsyncGrpcRequest,
      toolgood.textfilter.api.GrpcBase.ImageFilter.ImageRequestIdGrpcReply> getImageLocalFilterAsyncMethod() {
    io.grpc.MethodDescriptor<toolgood.textfilter.api.GrpcBase.ImageFilter.ImageLocalAsyncGrpcRequest, toolgood.textfilter.api.GrpcBase.ImageFilter.ImageRequestIdGrpcReply> getImageLocalFilterAsyncMethod;
    if ((getImageLocalFilterAsyncMethod = ImageFilterGrpcGrpc.getImageLocalFilterAsyncMethod) == null) {
      synchronized (ImageFilterGrpcGrpc.class) {
        if ((getImageLocalFilterAsyncMethod = ImageFilterGrpcGrpc.getImageLocalFilterAsyncMethod) == null) {
          ImageFilterGrpcGrpc.getImageLocalFilterAsyncMethod = getImageLocalFilterAsyncMethod =
              io.grpc.MethodDescriptor.<toolgood.textfilter.api.GrpcBase.ImageFilter.ImageLocalAsyncGrpcRequest, toolgood.textfilter.api.GrpcBase.ImageFilter.ImageRequestIdGrpcReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ImageLocalFilterAsync"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  toolgood.textfilter.api.GrpcBase.ImageFilter.ImageLocalAsyncGrpcRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  toolgood.textfilter.api.GrpcBase.ImageFilter.ImageRequestIdGrpcReply.getDefaultInstance()))
              .setSchemaDescriptor(new ImageFilterGrpcMethodDescriptorSupplier("ImageLocalFilterAsync"))
              .build();
        }
      }
    }
    return getImageLocalFilterAsyncMethod;
  }

  private static volatile io.grpc.MethodDescriptor<toolgood.textfilter.api.GrpcBase.ImageFilter.ImageUploadAsyncGrpcRequest,
      toolgood.textfilter.api.GrpcBase.ImageFilter.ImageRequestIdGrpcReply> getImageUploadFilterAsyncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ImageUploadFilterAsync",
      requestType = toolgood.textfilter.api.GrpcBase.ImageFilter.ImageUploadAsyncGrpcRequest.class,
      responseType = toolgood.textfilter.api.GrpcBase.ImageFilter.ImageRequestIdGrpcReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<toolgood.textfilter.api.GrpcBase.ImageFilter.ImageUploadAsyncGrpcRequest,
      toolgood.textfilter.api.GrpcBase.ImageFilter.ImageRequestIdGrpcReply> getImageUploadFilterAsyncMethod() {
    io.grpc.MethodDescriptor<toolgood.textfilter.api.GrpcBase.ImageFilter.ImageUploadAsyncGrpcRequest, toolgood.textfilter.api.GrpcBase.ImageFilter.ImageRequestIdGrpcReply> getImageUploadFilterAsyncMethod;
    if ((getImageUploadFilterAsyncMethod = ImageFilterGrpcGrpc.getImageUploadFilterAsyncMethod) == null) {
      synchronized (ImageFilterGrpcGrpc.class) {
        if ((getImageUploadFilterAsyncMethod = ImageFilterGrpcGrpc.getImageUploadFilterAsyncMethod) == null) {
          ImageFilterGrpcGrpc.getImageUploadFilterAsyncMethod = getImageUploadFilterAsyncMethod =
              io.grpc.MethodDescriptor.<toolgood.textfilter.api.GrpcBase.ImageFilter.ImageUploadAsyncGrpcRequest, toolgood.textfilter.api.GrpcBase.ImageFilter.ImageRequestIdGrpcReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ImageUploadFilterAsync"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  toolgood.textfilter.api.GrpcBase.ImageFilter.ImageUploadAsyncGrpcRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  toolgood.textfilter.api.GrpcBase.ImageFilter.ImageRequestIdGrpcReply.getDefaultInstance()))
              .setSchemaDescriptor(new ImageFilterGrpcMethodDescriptorSupplier("ImageUploadFilterAsync"))
              .build();
        }
      }
    }
    return getImageUploadFilterAsyncMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ImageFilterGrpcStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ImageFilterGrpcStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ImageFilterGrpcStub>() {
        @java.lang.Override
        public ImageFilterGrpcStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ImageFilterGrpcStub(channel, callOptions);
        }
      };
    return ImageFilterGrpcStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ImageFilterGrpcBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ImageFilterGrpcBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ImageFilterGrpcBlockingStub>() {
        @java.lang.Override
        public ImageFilterGrpcBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ImageFilterGrpcBlockingStub(channel, callOptions);
        }
      };
    return ImageFilterGrpcBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ImageFilterGrpcFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ImageFilterGrpcFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ImageFilterGrpcFutureStub>() {
        @java.lang.Override
        public ImageFilterGrpcFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ImageFilterGrpcFutureStub(channel, callOptions);
        }
      };
    return ImageFilterGrpcFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class ImageFilterGrpcImplBase implements io.grpc.BindableService {

    /**
     */
    public void imageLocalFilter(toolgood.textfilter.api.GrpcBase.ImageFilter.ImageLocalGrpcRequest request,
        io.grpc.stub.StreamObserver<toolgood.textfilter.api.GrpcBase.ImageFilter.ImageFilterGrpcReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getImageLocalFilterMethod(), responseObserver);
    }

    /**
     */
    public void imageUploadFilter(toolgood.textfilter.api.GrpcBase.ImageFilter.ImageUploadGrpcRequest request,
        io.grpc.stub.StreamObserver<toolgood.textfilter.api.GrpcBase.ImageFilter.ImageFilterGrpcReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getImageUploadFilterMethod(), responseObserver);
    }

    /**
     */
    public void imageLocalFilterAsync(toolgood.textfilter.api.GrpcBase.ImageFilter.ImageLocalAsyncGrpcRequest request,
        io.grpc.stub.StreamObserver<toolgood.textfilter.api.GrpcBase.ImageFilter.ImageRequestIdGrpcReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getImageLocalFilterAsyncMethod(), responseObserver);
    }

    /**
     */
    public void imageUploadFilterAsync(toolgood.textfilter.api.GrpcBase.ImageFilter.ImageUploadAsyncGrpcRequest request,
        io.grpc.stub.StreamObserver<toolgood.textfilter.api.GrpcBase.ImageFilter.ImageRequestIdGrpcReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getImageUploadFilterAsyncMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getImageLocalFilterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                toolgood.textfilter.api.GrpcBase.ImageFilter.ImageLocalGrpcRequest,
                toolgood.textfilter.api.GrpcBase.ImageFilter.ImageFilterGrpcReply>(
                  this, METHODID_IMAGE_LOCAL_FILTER)))
          .addMethod(
            getImageUploadFilterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                toolgood.textfilter.api.GrpcBase.ImageFilter.ImageUploadGrpcRequest,
                toolgood.textfilter.api.GrpcBase.ImageFilter.ImageFilterGrpcReply>(
                  this, METHODID_IMAGE_UPLOAD_FILTER)))
          .addMethod(
            getImageLocalFilterAsyncMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                toolgood.textfilter.api.GrpcBase.ImageFilter.ImageLocalAsyncGrpcRequest,
                toolgood.textfilter.api.GrpcBase.ImageFilter.ImageRequestIdGrpcReply>(
                  this, METHODID_IMAGE_LOCAL_FILTER_ASYNC)))
          .addMethod(
            getImageUploadFilterAsyncMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                toolgood.textfilter.api.GrpcBase.ImageFilter.ImageUploadAsyncGrpcRequest,
                toolgood.textfilter.api.GrpcBase.ImageFilter.ImageRequestIdGrpcReply>(
                  this, METHODID_IMAGE_UPLOAD_FILTER_ASYNC)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class ImageFilterGrpcStub extends io.grpc.stub.AbstractAsyncStub<ImageFilterGrpcStub> {
    private ImageFilterGrpcStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImageFilterGrpcStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ImageFilterGrpcStub(channel, callOptions);
    }

    /**
     */
    public void imageLocalFilter(toolgood.textfilter.api.GrpcBase.ImageFilter.ImageLocalGrpcRequest request,
        io.grpc.stub.StreamObserver<toolgood.textfilter.api.GrpcBase.ImageFilter.ImageFilterGrpcReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getImageLocalFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void imageUploadFilter(toolgood.textfilter.api.GrpcBase.ImageFilter.ImageUploadGrpcRequest request,
        io.grpc.stub.StreamObserver<toolgood.textfilter.api.GrpcBase.ImageFilter.ImageFilterGrpcReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getImageUploadFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void imageLocalFilterAsync(toolgood.textfilter.api.GrpcBase.ImageFilter.ImageLocalAsyncGrpcRequest request,
        io.grpc.stub.StreamObserver<toolgood.textfilter.api.GrpcBase.ImageFilter.ImageRequestIdGrpcReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getImageLocalFilterAsyncMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void imageUploadFilterAsync(toolgood.textfilter.api.GrpcBase.ImageFilter.ImageUploadAsyncGrpcRequest request,
        io.grpc.stub.StreamObserver<toolgood.textfilter.api.GrpcBase.ImageFilter.ImageRequestIdGrpcReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getImageUploadFilterAsyncMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class ImageFilterGrpcBlockingStub extends io.grpc.stub.AbstractBlockingStub<ImageFilterGrpcBlockingStub> {
    private ImageFilterGrpcBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImageFilterGrpcBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ImageFilterGrpcBlockingStub(channel, callOptions);
    }

    /**
     */
    public toolgood.textfilter.api.GrpcBase.ImageFilter.ImageFilterGrpcReply imageLocalFilter(toolgood.textfilter.api.GrpcBase.ImageFilter.ImageLocalGrpcRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getImageLocalFilterMethod(), getCallOptions(), request);
    }

    /**
     */
    public toolgood.textfilter.api.GrpcBase.ImageFilter.ImageFilterGrpcReply imageUploadFilter(toolgood.textfilter.api.GrpcBase.ImageFilter.ImageUploadGrpcRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getImageUploadFilterMethod(), getCallOptions(), request);
    }

    /**
     */
    public toolgood.textfilter.api.GrpcBase.ImageFilter.ImageRequestIdGrpcReply imageLocalFilterAsync(toolgood.textfilter.api.GrpcBase.ImageFilter.ImageLocalAsyncGrpcRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getImageLocalFilterAsyncMethod(), getCallOptions(), request);
    }

    /**
     */
    public toolgood.textfilter.api.GrpcBase.ImageFilter.ImageRequestIdGrpcReply imageUploadFilterAsync(toolgood.textfilter.api.GrpcBase.ImageFilter.ImageUploadAsyncGrpcRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getImageUploadFilterAsyncMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class ImageFilterGrpcFutureStub extends io.grpc.stub.AbstractFutureStub<ImageFilterGrpcFutureStub> {
    private ImageFilterGrpcFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImageFilterGrpcFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ImageFilterGrpcFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<toolgood.textfilter.api.GrpcBase.ImageFilter.ImageFilterGrpcReply> imageLocalFilter(
        toolgood.textfilter.api.GrpcBase.ImageFilter.ImageLocalGrpcRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getImageLocalFilterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<toolgood.textfilter.api.GrpcBase.ImageFilter.ImageFilterGrpcReply> imageUploadFilter(
        toolgood.textfilter.api.GrpcBase.ImageFilter.ImageUploadGrpcRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getImageUploadFilterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<toolgood.textfilter.api.GrpcBase.ImageFilter.ImageRequestIdGrpcReply> imageLocalFilterAsync(
        toolgood.textfilter.api.GrpcBase.ImageFilter.ImageLocalAsyncGrpcRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getImageLocalFilterAsyncMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<toolgood.textfilter.api.GrpcBase.ImageFilter.ImageRequestIdGrpcReply> imageUploadFilterAsync(
        toolgood.textfilter.api.GrpcBase.ImageFilter.ImageUploadAsyncGrpcRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getImageUploadFilterAsyncMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_IMAGE_LOCAL_FILTER = 0;
  private static final int METHODID_IMAGE_UPLOAD_FILTER = 1;
  private static final int METHODID_IMAGE_LOCAL_FILTER_ASYNC = 2;
  private static final int METHODID_IMAGE_UPLOAD_FILTER_ASYNC = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ImageFilterGrpcImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ImageFilterGrpcImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_IMAGE_LOCAL_FILTER:
          serviceImpl.imageLocalFilter((toolgood.textfilter.api.GrpcBase.ImageFilter.ImageLocalGrpcRequest) request,
              (io.grpc.stub.StreamObserver<toolgood.textfilter.api.GrpcBase.ImageFilter.ImageFilterGrpcReply>) responseObserver);
          break;
        case METHODID_IMAGE_UPLOAD_FILTER:
          serviceImpl.imageUploadFilter((toolgood.textfilter.api.GrpcBase.ImageFilter.ImageUploadGrpcRequest) request,
              (io.grpc.stub.StreamObserver<toolgood.textfilter.api.GrpcBase.ImageFilter.ImageFilterGrpcReply>) responseObserver);
          break;
        case METHODID_IMAGE_LOCAL_FILTER_ASYNC:
          serviceImpl.imageLocalFilterAsync((toolgood.textfilter.api.GrpcBase.ImageFilter.ImageLocalAsyncGrpcRequest) request,
              (io.grpc.stub.StreamObserver<toolgood.textfilter.api.GrpcBase.ImageFilter.ImageRequestIdGrpcReply>) responseObserver);
          break;
        case METHODID_IMAGE_UPLOAD_FILTER_ASYNC:
          serviceImpl.imageUploadFilterAsync((toolgood.textfilter.api.GrpcBase.ImageFilter.ImageUploadAsyncGrpcRequest) request,
              (io.grpc.stub.StreamObserver<toolgood.textfilter.api.GrpcBase.ImageFilter.ImageRequestIdGrpcReply>) responseObserver);
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

  private static abstract class ImageFilterGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ImageFilterGrpcBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return toolgood.textfilter.api.GrpcBase.ImageFilter.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ImageFilterGrpc");
    }
  }

  private static final class ImageFilterGrpcFileDescriptorSupplier
      extends ImageFilterGrpcBaseDescriptorSupplier {
    ImageFilterGrpcFileDescriptorSupplier() {}
  }

  private static final class ImageFilterGrpcMethodDescriptorSupplier
      extends ImageFilterGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ImageFilterGrpcMethodDescriptorSupplier(String methodName) {
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
      synchronized (ImageFilterGrpcGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ImageFilterGrpcFileDescriptorSupplier())
              .addMethod(getImageLocalFilterMethod())
              .addMethod(getImageUploadFilterMethod())
              .addMethod(getImageLocalFilterAsyncMethod())
              .addMethod(getImageUploadFilterAsyncMethod())
              .build();
        }
      }
    }
    return result;
  }
}
