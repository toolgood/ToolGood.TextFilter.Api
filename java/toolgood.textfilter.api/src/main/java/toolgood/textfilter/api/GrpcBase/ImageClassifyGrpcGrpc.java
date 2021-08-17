package toolgood.textfilter.api.GrpcBase;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: imageClassify.proto")
public final class ImageClassifyGrpcGrpc {

  private ImageClassifyGrpcGrpc() {}

  public static final String SERVICE_NAME = "toolgood.textfilter.api.GrpcBase.ImageClassifyGrpc";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<toolgood.textfilter.api.GrpcBase.ImageClassify.ImageLocalGrpcRequest2,
      toolgood.textfilter.api.GrpcBase.ImageClassify.ImageClassifyGrpcReply2> getImageLocalClassifyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ImageLocalClassify",
      requestType = toolgood.textfilter.api.GrpcBase.ImageClassify.ImageLocalGrpcRequest2.class,
      responseType = toolgood.textfilter.api.GrpcBase.ImageClassify.ImageClassifyGrpcReply2.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<toolgood.textfilter.api.GrpcBase.ImageClassify.ImageLocalGrpcRequest2,
      toolgood.textfilter.api.GrpcBase.ImageClassify.ImageClassifyGrpcReply2> getImageLocalClassifyMethod() {
    io.grpc.MethodDescriptor<toolgood.textfilter.api.GrpcBase.ImageClassify.ImageLocalGrpcRequest2, toolgood.textfilter.api.GrpcBase.ImageClassify.ImageClassifyGrpcReply2> getImageLocalClassifyMethod;
    if ((getImageLocalClassifyMethod = ImageClassifyGrpcGrpc.getImageLocalClassifyMethod) == null) {
      synchronized (ImageClassifyGrpcGrpc.class) {
        if ((getImageLocalClassifyMethod = ImageClassifyGrpcGrpc.getImageLocalClassifyMethod) == null) {
          ImageClassifyGrpcGrpc.getImageLocalClassifyMethod = getImageLocalClassifyMethod =
              io.grpc.MethodDescriptor.<toolgood.textfilter.api.GrpcBase.ImageClassify.ImageLocalGrpcRequest2, toolgood.textfilter.api.GrpcBase.ImageClassify.ImageClassifyGrpcReply2>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ImageLocalClassify"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  toolgood.textfilter.api.GrpcBase.ImageClassify.ImageLocalGrpcRequest2.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  toolgood.textfilter.api.GrpcBase.ImageClassify.ImageClassifyGrpcReply2.getDefaultInstance()))
              .setSchemaDescriptor(new ImageClassifyGrpcMethodDescriptorSupplier("ImageLocalClassify"))
              .build();
        }
      }
    }
    return getImageLocalClassifyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<toolgood.textfilter.api.GrpcBase.ImageClassify.ImageUploadGrpcRequest2,
      toolgood.textfilter.api.GrpcBase.ImageClassify.ImageClassifyGrpcReply2> getImageUploadClassifyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ImageUploadClassify",
      requestType = toolgood.textfilter.api.GrpcBase.ImageClassify.ImageUploadGrpcRequest2.class,
      responseType = toolgood.textfilter.api.GrpcBase.ImageClassify.ImageClassifyGrpcReply2.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<toolgood.textfilter.api.GrpcBase.ImageClassify.ImageUploadGrpcRequest2,
      toolgood.textfilter.api.GrpcBase.ImageClassify.ImageClassifyGrpcReply2> getImageUploadClassifyMethod() {
    io.grpc.MethodDescriptor<toolgood.textfilter.api.GrpcBase.ImageClassify.ImageUploadGrpcRequest2, toolgood.textfilter.api.GrpcBase.ImageClassify.ImageClassifyGrpcReply2> getImageUploadClassifyMethod;
    if ((getImageUploadClassifyMethod = ImageClassifyGrpcGrpc.getImageUploadClassifyMethod) == null) {
      synchronized (ImageClassifyGrpcGrpc.class) {
        if ((getImageUploadClassifyMethod = ImageClassifyGrpcGrpc.getImageUploadClassifyMethod) == null) {
          ImageClassifyGrpcGrpc.getImageUploadClassifyMethod = getImageUploadClassifyMethod =
              io.grpc.MethodDescriptor.<toolgood.textfilter.api.GrpcBase.ImageClassify.ImageUploadGrpcRequest2, toolgood.textfilter.api.GrpcBase.ImageClassify.ImageClassifyGrpcReply2>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ImageUploadClassify"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  toolgood.textfilter.api.GrpcBase.ImageClassify.ImageUploadGrpcRequest2.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  toolgood.textfilter.api.GrpcBase.ImageClassify.ImageClassifyGrpcReply2.getDefaultInstance()))
              .setSchemaDescriptor(new ImageClassifyGrpcMethodDescriptorSupplier("ImageUploadClassify"))
              .build();
        }
      }
    }
    return getImageUploadClassifyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<toolgood.textfilter.api.GrpcBase.ImageClassify.ImageLocalAsyncGrpcRequest2,
      toolgood.textfilter.api.GrpcBase.ImageClassify.ImageRequestIdGrpcReply2> getImageLocalClassifyAsyncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ImageLocalClassifyAsync",
      requestType = toolgood.textfilter.api.GrpcBase.ImageClassify.ImageLocalAsyncGrpcRequest2.class,
      responseType = toolgood.textfilter.api.GrpcBase.ImageClassify.ImageRequestIdGrpcReply2.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<toolgood.textfilter.api.GrpcBase.ImageClassify.ImageLocalAsyncGrpcRequest2,
      toolgood.textfilter.api.GrpcBase.ImageClassify.ImageRequestIdGrpcReply2> getImageLocalClassifyAsyncMethod() {
    io.grpc.MethodDescriptor<toolgood.textfilter.api.GrpcBase.ImageClassify.ImageLocalAsyncGrpcRequest2, toolgood.textfilter.api.GrpcBase.ImageClassify.ImageRequestIdGrpcReply2> getImageLocalClassifyAsyncMethod;
    if ((getImageLocalClassifyAsyncMethod = ImageClassifyGrpcGrpc.getImageLocalClassifyAsyncMethod) == null) {
      synchronized (ImageClassifyGrpcGrpc.class) {
        if ((getImageLocalClassifyAsyncMethod = ImageClassifyGrpcGrpc.getImageLocalClassifyAsyncMethod) == null) {
          ImageClassifyGrpcGrpc.getImageLocalClassifyAsyncMethod = getImageLocalClassifyAsyncMethod =
              io.grpc.MethodDescriptor.<toolgood.textfilter.api.GrpcBase.ImageClassify.ImageLocalAsyncGrpcRequest2, toolgood.textfilter.api.GrpcBase.ImageClassify.ImageRequestIdGrpcReply2>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ImageLocalClassifyAsync"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  toolgood.textfilter.api.GrpcBase.ImageClassify.ImageLocalAsyncGrpcRequest2.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  toolgood.textfilter.api.GrpcBase.ImageClassify.ImageRequestIdGrpcReply2.getDefaultInstance()))
              .setSchemaDescriptor(new ImageClassifyGrpcMethodDescriptorSupplier("ImageLocalClassifyAsync"))
              .build();
        }
      }
    }
    return getImageLocalClassifyAsyncMethod;
  }

  private static volatile io.grpc.MethodDescriptor<toolgood.textfilter.api.GrpcBase.ImageClassify.ImageUploadAsyncGrpcRequest2,
      toolgood.textfilter.api.GrpcBase.ImageClassify.ImageRequestIdGrpcReply2> getImageUploadClassifyAsyncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ImageUploadClassifyAsync",
      requestType = toolgood.textfilter.api.GrpcBase.ImageClassify.ImageUploadAsyncGrpcRequest2.class,
      responseType = toolgood.textfilter.api.GrpcBase.ImageClassify.ImageRequestIdGrpcReply2.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<toolgood.textfilter.api.GrpcBase.ImageClassify.ImageUploadAsyncGrpcRequest2,
      toolgood.textfilter.api.GrpcBase.ImageClassify.ImageRequestIdGrpcReply2> getImageUploadClassifyAsyncMethod() {
    io.grpc.MethodDescriptor<toolgood.textfilter.api.GrpcBase.ImageClassify.ImageUploadAsyncGrpcRequest2, toolgood.textfilter.api.GrpcBase.ImageClassify.ImageRequestIdGrpcReply2> getImageUploadClassifyAsyncMethod;
    if ((getImageUploadClassifyAsyncMethod = ImageClassifyGrpcGrpc.getImageUploadClassifyAsyncMethod) == null) {
      synchronized (ImageClassifyGrpcGrpc.class) {
        if ((getImageUploadClassifyAsyncMethod = ImageClassifyGrpcGrpc.getImageUploadClassifyAsyncMethod) == null) {
          ImageClassifyGrpcGrpc.getImageUploadClassifyAsyncMethod = getImageUploadClassifyAsyncMethod =
              io.grpc.MethodDescriptor.<toolgood.textfilter.api.GrpcBase.ImageClassify.ImageUploadAsyncGrpcRequest2, toolgood.textfilter.api.GrpcBase.ImageClassify.ImageRequestIdGrpcReply2>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ImageUploadClassifyAsync"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  toolgood.textfilter.api.GrpcBase.ImageClassify.ImageUploadAsyncGrpcRequest2.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  toolgood.textfilter.api.GrpcBase.ImageClassify.ImageRequestIdGrpcReply2.getDefaultInstance()))
              .setSchemaDescriptor(new ImageClassifyGrpcMethodDescriptorSupplier("ImageUploadClassifyAsync"))
              .build();
        }
      }
    }
    return getImageUploadClassifyAsyncMethod;
  }

  private static volatile io.grpc.MethodDescriptor<toolgood.textfilter.api.GrpcBase.ImageClassify.BrowserGrpcRequest,
      toolgood.textfilter.api.GrpcBase.ImageClassify.ImageBrowserFilterGrpcReply> getBrowserFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BrowserFilter",
      requestType = toolgood.textfilter.api.GrpcBase.ImageClassify.BrowserGrpcRequest.class,
      responseType = toolgood.textfilter.api.GrpcBase.ImageClassify.ImageBrowserFilterGrpcReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<toolgood.textfilter.api.GrpcBase.ImageClassify.BrowserGrpcRequest,
      toolgood.textfilter.api.GrpcBase.ImageClassify.ImageBrowserFilterGrpcReply> getBrowserFilterMethod() {
    io.grpc.MethodDescriptor<toolgood.textfilter.api.GrpcBase.ImageClassify.BrowserGrpcRequest, toolgood.textfilter.api.GrpcBase.ImageClassify.ImageBrowserFilterGrpcReply> getBrowserFilterMethod;
    if ((getBrowserFilterMethod = ImageClassifyGrpcGrpc.getBrowserFilterMethod) == null) {
      synchronized (ImageClassifyGrpcGrpc.class) {
        if ((getBrowserFilterMethod = ImageClassifyGrpcGrpc.getBrowserFilterMethod) == null) {
          ImageClassifyGrpcGrpc.getBrowserFilterMethod = getBrowserFilterMethod =
              io.grpc.MethodDescriptor.<toolgood.textfilter.api.GrpcBase.ImageClassify.BrowserGrpcRequest, toolgood.textfilter.api.GrpcBase.ImageClassify.ImageBrowserFilterGrpcReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BrowserFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  toolgood.textfilter.api.GrpcBase.ImageClassify.BrowserGrpcRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  toolgood.textfilter.api.GrpcBase.ImageClassify.ImageBrowserFilterGrpcReply.getDefaultInstance()))
              .setSchemaDescriptor(new ImageClassifyGrpcMethodDescriptorSupplier("BrowserFilter"))
              .build();
        }
      }
    }
    return getBrowserFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<toolgood.textfilter.api.GrpcBase.ImageClassify.BrowserGrpcRequest,
      toolgood.textfilter.api.GrpcBase.ImageClassify.ImageBrowserClassifyGrpcReply> getBrowserClassifyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BrowserClassify",
      requestType = toolgood.textfilter.api.GrpcBase.ImageClassify.BrowserGrpcRequest.class,
      responseType = toolgood.textfilter.api.GrpcBase.ImageClassify.ImageBrowserClassifyGrpcReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<toolgood.textfilter.api.GrpcBase.ImageClassify.BrowserGrpcRequest,
      toolgood.textfilter.api.GrpcBase.ImageClassify.ImageBrowserClassifyGrpcReply> getBrowserClassifyMethod() {
    io.grpc.MethodDescriptor<toolgood.textfilter.api.GrpcBase.ImageClassify.BrowserGrpcRequest, toolgood.textfilter.api.GrpcBase.ImageClassify.ImageBrowserClassifyGrpcReply> getBrowserClassifyMethod;
    if ((getBrowserClassifyMethod = ImageClassifyGrpcGrpc.getBrowserClassifyMethod) == null) {
      synchronized (ImageClassifyGrpcGrpc.class) {
        if ((getBrowserClassifyMethod = ImageClassifyGrpcGrpc.getBrowserClassifyMethod) == null) {
          ImageClassifyGrpcGrpc.getBrowserClassifyMethod = getBrowserClassifyMethod =
              io.grpc.MethodDescriptor.<toolgood.textfilter.api.GrpcBase.ImageClassify.BrowserGrpcRequest, toolgood.textfilter.api.GrpcBase.ImageClassify.ImageBrowserClassifyGrpcReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BrowserClassify"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  toolgood.textfilter.api.GrpcBase.ImageClassify.BrowserGrpcRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  toolgood.textfilter.api.GrpcBase.ImageClassify.ImageBrowserClassifyGrpcReply.getDefaultInstance()))
              .setSchemaDescriptor(new ImageClassifyGrpcMethodDescriptorSupplier("BrowserClassify"))
              .build();
        }
      }
    }
    return getBrowserClassifyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<toolgood.textfilter.api.GrpcBase.ImageClassify.BrowserAsyncGrpcRequest,
      toolgood.textfilter.api.GrpcBase.ImageClassify.ImageRequestIdGrpcReply2> getBrowserFilterAsyncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BrowserFilterAsync",
      requestType = toolgood.textfilter.api.GrpcBase.ImageClassify.BrowserAsyncGrpcRequest.class,
      responseType = toolgood.textfilter.api.GrpcBase.ImageClassify.ImageRequestIdGrpcReply2.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<toolgood.textfilter.api.GrpcBase.ImageClassify.BrowserAsyncGrpcRequest,
      toolgood.textfilter.api.GrpcBase.ImageClassify.ImageRequestIdGrpcReply2> getBrowserFilterAsyncMethod() {
    io.grpc.MethodDescriptor<toolgood.textfilter.api.GrpcBase.ImageClassify.BrowserAsyncGrpcRequest, toolgood.textfilter.api.GrpcBase.ImageClassify.ImageRequestIdGrpcReply2> getBrowserFilterAsyncMethod;
    if ((getBrowserFilterAsyncMethod = ImageClassifyGrpcGrpc.getBrowserFilterAsyncMethod) == null) {
      synchronized (ImageClassifyGrpcGrpc.class) {
        if ((getBrowserFilterAsyncMethod = ImageClassifyGrpcGrpc.getBrowserFilterAsyncMethod) == null) {
          ImageClassifyGrpcGrpc.getBrowserFilterAsyncMethod = getBrowserFilterAsyncMethod =
              io.grpc.MethodDescriptor.<toolgood.textfilter.api.GrpcBase.ImageClassify.BrowserAsyncGrpcRequest, toolgood.textfilter.api.GrpcBase.ImageClassify.ImageRequestIdGrpcReply2>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BrowserFilterAsync"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  toolgood.textfilter.api.GrpcBase.ImageClassify.BrowserAsyncGrpcRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  toolgood.textfilter.api.GrpcBase.ImageClassify.ImageRequestIdGrpcReply2.getDefaultInstance()))
              .setSchemaDescriptor(new ImageClassifyGrpcMethodDescriptorSupplier("BrowserFilterAsync"))
              .build();
        }
      }
    }
    return getBrowserFilterAsyncMethod;
  }

  private static volatile io.grpc.MethodDescriptor<toolgood.textfilter.api.GrpcBase.ImageClassify.BrowserAsyncGrpcRequest,
      toolgood.textfilter.api.GrpcBase.ImageClassify.ImageRequestIdGrpcReply2> getBrowserClassifyAsyncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BrowserClassifyAsync",
      requestType = toolgood.textfilter.api.GrpcBase.ImageClassify.BrowserAsyncGrpcRequest.class,
      responseType = toolgood.textfilter.api.GrpcBase.ImageClassify.ImageRequestIdGrpcReply2.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<toolgood.textfilter.api.GrpcBase.ImageClassify.BrowserAsyncGrpcRequest,
      toolgood.textfilter.api.GrpcBase.ImageClassify.ImageRequestIdGrpcReply2> getBrowserClassifyAsyncMethod() {
    io.grpc.MethodDescriptor<toolgood.textfilter.api.GrpcBase.ImageClassify.BrowserAsyncGrpcRequest, toolgood.textfilter.api.GrpcBase.ImageClassify.ImageRequestIdGrpcReply2> getBrowserClassifyAsyncMethod;
    if ((getBrowserClassifyAsyncMethod = ImageClassifyGrpcGrpc.getBrowserClassifyAsyncMethod) == null) {
      synchronized (ImageClassifyGrpcGrpc.class) {
        if ((getBrowserClassifyAsyncMethod = ImageClassifyGrpcGrpc.getBrowserClassifyAsyncMethod) == null) {
          ImageClassifyGrpcGrpc.getBrowserClassifyAsyncMethod = getBrowserClassifyAsyncMethod =
              io.grpc.MethodDescriptor.<toolgood.textfilter.api.GrpcBase.ImageClassify.BrowserAsyncGrpcRequest, toolgood.textfilter.api.GrpcBase.ImageClassify.ImageRequestIdGrpcReply2>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BrowserClassifyAsync"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  toolgood.textfilter.api.GrpcBase.ImageClassify.BrowserAsyncGrpcRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  toolgood.textfilter.api.GrpcBase.ImageClassify.ImageRequestIdGrpcReply2.getDefaultInstance()))
              .setSchemaDescriptor(new ImageClassifyGrpcMethodDescriptorSupplier("BrowserClassifyAsync"))
              .build();
        }
      }
    }
    return getBrowserClassifyAsyncMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ImageClassifyGrpcStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ImageClassifyGrpcStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ImageClassifyGrpcStub>() {
        @java.lang.Override
        public ImageClassifyGrpcStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ImageClassifyGrpcStub(channel, callOptions);
        }
      };
    return ImageClassifyGrpcStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ImageClassifyGrpcBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ImageClassifyGrpcBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ImageClassifyGrpcBlockingStub>() {
        @java.lang.Override
        public ImageClassifyGrpcBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ImageClassifyGrpcBlockingStub(channel, callOptions);
        }
      };
    return ImageClassifyGrpcBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ImageClassifyGrpcFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ImageClassifyGrpcFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ImageClassifyGrpcFutureStub>() {
        @java.lang.Override
        public ImageClassifyGrpcFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ImageClassifyGrpcFutureStub(channel, callOptions);
        }
      };
    return ImageClassifyGrpcFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class ImageClassifyGrpcImplBase implements io.grpc.BindableService {

    /**
     */
    public void imageLocalClassify(toolgood.textfilter.api.GrpcBase.ImageClassify.ImageLocalGrpcRequest2 request,
        io.grpc.stub.StreamObserver<toolgood.textfilter.api.GrpcBase.ImageClassify.ImageClassifyGrpcReply2> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getImageLocalClassifyMethod(), responseObserver);
    }

    /**
     */
    public void imageUploadClassify(toolgood.textfilter.api.GrpcBase.ImageClassify.ImageUploadGrpcRequest2 request,
        io.grpc.stub.StreamObserver<toolgood.textfilter.api.GrpcBase.ImageClassify.ImageClassifyGrpcReply2> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getImageUploadClassifyMethod(), responseObserver);
    }

    /**
     */
    public void imageLocalClassifyAsync(toolgood.textfilter.api.GrpcBase.ImageClassify.ImageLocalAsyncGrpcRequest2 request,
        io.grpc.stub.StreamObserver<toolgood.textfilter.api.GrpcBase.ImageClassify.ImageRequestIdGrpcReply2> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getImageLocalClassifyAsyncMethod(), responseObserver);
    }

    /**
     */
    public void imageUploadClassifyAsync(toolgood.textfilter.api.GrpcBase.ImageClassify.ImageUploadAsyncGrpcRequest2 request,
        io.grpc.stub.StreamObserver<toolgood.textfilter.api.GrpcBase.ImageClassify.ImageRequestIdGrpcReply2> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getImageUploadClassifyAsyncMethod(), responseObserver);
    }

    /**
     */
    public void browserFilter(toolgood.textfilter.api.GrpcBase.ImageClassify.BrowserGrpcRequest request,
        io.grpc.stub.StreamObserver<toolgood.textfilter.api.GrpcBase.ImageClassify.ImageBrowserFilterGrpcReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBrowserFilterMethod(), responseObserver);
    }

    /**
     */
    public void browserClassify(toolgood.textfilter.api.GrpcBase.ImageClassify.BrowserGrpcRequest request,
        io.grpc.stub.StreamObserver<toolgood.textfilter.api.GrpcBase.ImageClassify.ImageBrowserClassifyGrpcReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBrowserClassifyMethod(), responseObserver);
    }

    /**
     */
    public void browserFilterAsync(toolgood.textfilter.api.GrpcBase.ImageClassify.BrowserAsyncGrpcRequest request,
        io.grpc.stub.StreamObserver<toolgood.textfilter.api.GrpcBase.ImageClassify.ImageRequestIdGrpcReply2> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBrowserFilterAsyncMethod(), responseObserver);
    }

    /**
     */
    public void browserClassifyAsync(toolgood.textfilter.api.GrpcBase.ImageClassify.BrowserAsyncGrpcRequest request,
        io.grpc.stub.StreamObserver<toolgood.textfilter.api.GrpcBase.ImageClassify.ImageRequestIdGrpcReply2> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBrowserClassifyAsyncMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getImageLocalClassifyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                toolgood.textfilter.api.GrpcBase.ImageClassify.ImageLocalGrpcRequest2,
                toolgood.textfilter.api.GrpcBase.ImageClassify.ImageClassifyGrpcReply2>(
                  this, METHODID_IMAGE_LOCAL_CLASSIFY)))
          .addMethod(
            getImageUploadClassifyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                toolgood.textfilter.api.GrpcBase.ImageClassify.ImageUploadGrpcRequest2,
                toolgood.textfilter.api.GrpcBase.ImageClassify.ImageClassifyGrpcReply2>(
                  this, METHODID_IMAGE_UPLOAD_CLASSIFY)))
          .addMethod(
            getImageLocalClassifyAsyncMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                toolgood.textfilter.api.GrpcBase.ImageClassify.ImageLocalAsyncGrpcRequest2,
                toolgood.textfilter.api.GrpcBase.ImageClassify.ImageRequestIdGrpcReply2>(
                  this, METHODID_IMAGE_LOCAL_CLASSIFY_ASYNC)))
          .addMethod(
            getImageUploadClassifyAsyncMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                toolgood.textfilter.api.GrpcBase.ImageClassify.ImageUploadAsyncGrpcRequest2,
                toolgood.textfilter.api.GrpcBase.ImageClassify.ImageRequestIdGrpcReply2>(
                  this, METHODID_IMAGE_UPLOAD_CLASSIFY_ASYNC)))
          .addMethod(
            getBrowserFilterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                toolgood.textfilter.api.GrpcBase.ImageClassify.BrowserGrpcRequest,
                toolgood.textfilter.api.GrpcBase.ImageClassify.ImageBrowserFilterGrpcReply>(
                  this, METHODID_BROWSER_FILTER)))
          .addMethod(
            getBrowserClassifyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                toolgood.textfilter.api.GrpcBase.ImageClassify.BrowserGrpcRequest,
                toolgood.textfilter.api.GrpcBase.ImageClassify.ImageBrowserClassifyGrpcReply>(
                  this, METHODID_BROWSER_CLASSIFY)))
          .addMethod(
            getBrowserFilterAsyncMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                toolgood.textfilter.api.GrpcBase.ImageClassify.BrowserAsyncGrpcRequest,
                toolgood.textfilter.api.GrpcBase.ImageClassify.ImageRequestIdGrpcReply2>(
                  this, METHODID_BROWSER_FILTER_ASYNC)))
          .addMethod(
            getBrowserClassifyAsyncMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                toolgood.textfilter.api.GrpcBase.ImageClassify.BrowserAsyncGrpcRequest,
                toolgood.textfilter.api.GrpcBase.ImageClassify.ImageRequestIdGrpcReply2>(
                  this, METHODID_BROWSER_CLASSIFY_ASYNC)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class ImageClassifyGrpcStub extends io.grpc.stub.AbstractAsyncStub<ImageClassifyGrpcStub> {
    private ImageClassifyGrpcStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImageClassifyGrpcStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ImageClassifyGrpcStub(channel, callOptions);
    }

    /**
     */
    public void imageLocalClassify(toolgood.textfilter.api.GrpcBase.ImageClassify.ImageLocalGrpcRequest2 request,
        io.grpc.stub.StreamObserver<toolgood.textfilter.api.GrpcBase.ImageClassify.ImageClassifyGrpcReply2> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getImageLocalClassifyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void imageUploadClassify(toolgood.textfilter.api.GrpcBase.ImageClassify.ImageUploadGrpcRequest2 request,
        io.grpc.stub.StreamObserver<toolgood.textfilter.api.GrpcBase.ImageClassify.ImageClassifyGrpcReply2> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getImageUploadClassifyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void imageLocalClassifyAsync(toolgood.textfilter.api.GrpcBase.ImageClassify.ImageLocalAsyncGrpcRequest2 request,
        io.grpc.stub.StreamObserver<toolgood.textfilter.api.GrpcBase.ImageClassify.ImageRequestIdGrpcReply2> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getImageLocalClassifyAsyncMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void imageUploadClassifyAsync(toolgood.textfilter.api.GrpcBase.ImageClassify.ImageUploadAsyncGrpcRequest2 request,
        io.grpc.stub.StreamObserver<toolgood.textfilter.api.GrpcBase.ImageClassify.ImageRequestIdGrpcReply2> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getImageUploadClassifyAsyncMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void browserFilter(toolgood.textfilter.api.GrpcBase.ImageClassify.BrowserGrpcRequest request,
        io.grpc.stub.StreamObserver<toolgood.textfilter.api.GrpcBase.ImageClassify.ImageBrowserFilterGrpcReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBrowserFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void browserClassify(toolgood.textfilter.api.GrpcBase.ImageClassify.BrowserGrpcRequest request,
        io.grpc.stub.StreamObserver<toolgood.textfilter.api.GrpcBase.ImageClassify.ImageBrowserClassifyGrpcReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBrowserClassifyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void browserFilterAsync(toolgood.textfilter.api.GrpcBase.ImageClassify.BrowserAsyncGrpcRequest request,
        io.grpc.stub.StreamObserver<toolgood.textfilter.api.GrpcBase.ImageClassify.ImageRequestIdGrpcReply2> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBrowserFilterAsyncMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void browserClassifyAsync(toolgood.textfilter.api.GrpcBase.ImageClassify.BrowserAsyncGrpcRequest request,
        io.grpc.stub.StreamObserver<toolgood.textfilter.api.GrpcBase.ImageClassify.ImageRequestIdGrpcReply2> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBrowserClassifyAsyncMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class ImageClassifyGrpcBlockingStub extends io.grpc.stub.AbstractBlockingStub<ImageClassifyGrpcBlockingStub> {
    private ImageClassifyGrpcBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImageClassifyGrpcBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ImageClassifyGrpcBlockingStub(channel, callOptions);
    }

    /**
     */
    public toolgood.textfilter.api.GrpcBase.ImageClassify.ImageClassifyGrpcReply2 imageLocalClassify(toolgood.textfilter.api.GrpcBase.ImageClassify.ImageLocalGrpcRequest2 request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getImageLocalClassifyMethod(), getCallOptions(), request);
    }

    /**
     */
    public toolgood.textfilter.api.GrpcBase.ImageClassify.ImageClassifyGrpcReply2 imageUploadClassify(toolgood.textfilter.api.GrpcBase.ImageClassify.ImageUploadGrpcRequest2 request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getImageUploadClassifyMethod(), getCallOptions(), request);
    }

    /**
     */
    public toolgood.textfilter.api.GrpcBase.ImageClassify.ImageRequestIdGrpcReply2 imageLocalClassifyAsync(toolgood.textfilter.api.GrpcBase.ImageClassify.ImageLocalAsyncGrpcRequest2 request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getImageLocalClassifyAsyncMethod(), getCallOptions(), request);
    }

    /**
     */
    public toolgood.textfilter.api.GrpcBase.ImageClassify.ImageRequestIdGrpcReply2 imageUploadClassifyAsync(toolgood.textfilter.api.GrpcBase.ImageClassify.ImageUploadAsyncGrpcRequest2 request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getImageUploadClassifyAsyncMethod(), getCallOptions(), request);
    }

    /**
     */
    public toolgood.textfilter.api.GrpcBase.ImageClassify.ImageBrowserFilterGrpcReply browserFilter(toolgood.textfilter.api.GrpcBase.ImageClassify.BrowserGrpcRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBrowserFilterMethod(), getCallOptions(), request);
    }

    /**
     */
    public toolgood.textfilter.api.GrpcBase.ImageClassify.ImageBrowserClassifyGrpcReply browserClassify(toolgood.textfilter.api.GrpcBase.ImageClassify.BrowserGrpcRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBrowserClassifyMethod(), getCallOptions(), request);
    }

    /**
     */
    public toolgood.textfilter.api.GrpcBase.ImageClassify.ImageRequestIdGrpcReply2 browserFilterAsync(toolgood.textfilter.api.GrpcBase.ImageClassify.BrowserAsyncGrpcRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBrowserFilterAsyncMethod(), getCallOptions(), request);
    }

    /**
     */
    public toolgood.textfilter.api.GrpcBase.ImageClassify.ImageRequestIdGrpcReply2 browserClassifyAsync(toolgood.textfilter.api.GrpcBase.ImageClassify.BrowserAsyncGrpcRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBrowserClassifyAsyncMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class ImageClassifyGrpcFutureStub extends io.grpc.stub.AbstractFutureStub<ImageClassifyGrpcFutureStub> {
    private ImageClassifyGrpcFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImageClassifyGrpcFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ImageClassifyGrpcFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<toolgood.textfilter.api.GrpcBase.ImageClassify.ImageClassifyGrpcReply2> imageLocalClassify(
        toolgood.textfilter.api.GrpcBase.ImageClassify.ImageLocalGrpcRequest2 request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getImageLocalClassifyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<toolgood.textfilter.api.GrpcBase.ImageClassify.ImageClassifyGrpcReply2> imageUploadClassify(
        toolgood.textfilter.api.GrpcBase.ImageClassify.ImageUploadGrpcRequest2 request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getImageUploadClassifyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<toolgood.textfilter.api.GrpcBase.ImageClassify.ImageRequestIdGrpcReply2> imageLocalClassifyAsync(
        toolgood.textfilter.api.GrpcBase.ImageClassify.ImageLocalAsyncGrpcRequest2 request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getImageLocalClassifyAsyncMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<toolgood.textfilter.api.GrpcBase.ImageClassify.ImageRequestIdGrpcReply2> imageUploadClassifyAsync(
        toolgood.textfilter.api.GrpcBase.ImageClassify.ImageUploadAsyncGrpcRequest2 request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getImageUploadClassifyAsyncMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<toolgood.textfilter.api.GrpcBase.ImageClassify.ImageBrowserFilterGrpcReply> browserFilter(
        toolgood.textfilter.api.GrpcBase.ImageClassify.BrowserGrpcRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBrowserFilterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<toolgood.textfilter.api.GrpcBase.ImageClassify.ImageBrowserClassifyGrpcReply> browserClassify(
        toolgood.textfilter.api.GrpcBase.ImageClassify.BrowserGrpcRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBrowserClassifyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<toolgood.textfilter.api.GrpcBase.ImageClassify.ImageRequestIdGrpcReply2> browserFilterAsync(
        toolgood.textfilter.api.GrpcBase.ImageClassify.BrowserAsyncGrpcRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBrowserFilterAsyncMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<toolgood.textfilter.api.GrpcBase.ImageClassify.ImageRequestIdGrpcReply2> browserClassifyAsync(
        toolgood.textfilter.api.GrpcBase.ImageClassify.BrowserAsyncGrpcRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBrowserClassifyAsyncMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_IMAGE_LOCAL_CLASSIFY = 0;
  private static final int METHODID_IMAGE_UPLOAD_CLASSIFY = 1;
  private static final int METHODID_IMAGE_LOCAL_CLASSIFY_ASYNC = 2;
  private static final int METHODID_IMAGE_UPLOAD_CLASSIFY_ASYNC = 3;
  private static final int METHODID_BROWSER_FILTER = 4;
  private static final int METHODID_BROWSER_CLASSIFY = 5;
  private static final int METHODID_BROWSER_FILTER_ASYNC = 6;
  private static final int METHODID_BROWSER_CLASSIFY_ASYNC = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ImageClassifyGrpcImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ImageClassifyGrpcImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_IMAGE_LOCAL_CLASSIFY:
          serviceImpl.imageLocalClassify((toolgood.textfilter.api.GrpcBase.ImageClassify.ImageLocalGrpcRequest2) request,
              (io.grpc.stub.StreamObserver<toolgood.textfilter.api.GrpcBase.ImageClassify.ImageClassifyGrpcReply2>) responseObserver);
          break;
        case METHODID_IMAGE_UPLOAD_CLASSIFY:
          serviceImpl.imageUploadClassify((toolgood.textfilter.api.GrpcBase.ImageClassify.ImageUploadGrpcRequest2) request,
              (io.grpc.stub.StreamObserver<toolgood.textfilter.api.GrpcBase.ImageClassify.ImageClassifyGrpcReply2>) responseObserver);
          break;
        case METHODID_IMAGE_LOCAL_CLASSIFY_ASYNC:
          serviceImpl.imageLocalClassifyAsync((toolgood.textfilter.api.GrpcBase.ImageClassify.ImageLocalAsyncGrpcRequest2) request,
              (io.grpc.stub.StreamObserver<toolgood.textfilter.api.GrpcBase.ImageClassify.ImageRequestIdGrpcReply2>) responseObserver);
          break;
        case METHODID_IMAGE_UPLOAD_CLASSIFY_ASYNC:
          serviceImpl.imageUploadClassifyAsync((toolgood.textfilter.api.GrpcBase.ImageClassify.ImageUploadAsyncGrpcRequest2) request,
              (io.grpc.stub.StreamObserver<toolgood.textfilter.api.GrpcBase.ImageClassify.ImageRequestIdGrpcReply2>) responseObserver);
          break;
        case METHODID_BROWSER_FILTER:
          serviceImpl.browserFilter((toolgood.textfilter.api.GrpcBase.ImageClassify.BrowserGrpcRequest) request,
              (io.grpc.stub.StreamObserver<toolgood.textfilter.api.GrpcBase.ImageClassify.ImageBrowserFilterGrpcReply>) responseObserver);
          break;
        case METHODID_BROWSER_CLASSIFY:
          serviceImpl.browserClassify((toolgood.textfilter.api.GrpcBase.ImageClassify.BrowserGrpcRequest) request,
              (io.grpc.stub.StreamObserver<toolgood.textfilter.api.GrpcBase.ImageClassify.ImageBrowserClassifyGrpcReply>) responseObserver);
          break;
        case METHODID_BROWSER_FILTER_ASYNC:
          serviceImpl.browserFilterAsync((toolgood.textfilter.api.GrpcBase.ImageClassify.BrowserAsyncGrpcRequest) request,
              (io.grpc.stub.StreamObserver<toolgood.textfilter.api.GrpcBase.ImageClassify.ImageRequestIdGrpcReply2>) responseObserver);
          break;
        case METHODID_BROWSER_CLASSIFY_ASYNC:
          serviceImpl.browserClassifyAsync((toolgood.textfilter.api.GrpcBase.ImageClassify.BrowserAsyncGrpcRequest) request,
              (io.grpc.stub.StreamObserver<toolgood.textfilter.api.GrpcBase.ImageClassify.ImageRequestIdGrpcReply2>) responseObserver);
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

  private static abstract class ImageClassifyGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ImageClassifyGrpcBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return toolgood.textfilter.api.GrpcBase.ImageClassify.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ImageClassifyGrpc");
    }
  }

  private static final class ImageClassifyGrpcFileDescriptorSupplier
      extends ImageClassifyGrpcBaseDescriptorSupplier {
    ImageClassifyGrpcFileDescriptorSupplier() {}
  }

  private static final class ImageClassifyGrpcMethodDescriptorSupplier
      extends ImageClassifyGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ImageClassifyGrpcMethodDescriptorSupplier(String methodName) {
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
      synchronized (ImageClassifyGrpcGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ImageClassifyGrpcFileDescriptorSupplier())
              .addMethod(getImageLocalClassifyMethod())
              .addMethod(getImageUploadClassifyMethod())
              .addMethod(getImageLocalClassifyAsyncMethod())
              .addMethod(getImageUploadClassifyAsyncMethod())
              .addMethod(getBrowserFilterMethod())
              .addMethod(getBrowserClassifyMethod())
              .addMethod(getBrowserFilterAsyncMethod())
              .addMethod(getBrowserClassifyAsyncMethod())
              .build();
        }
      }
    }
    return result;
  }
}
