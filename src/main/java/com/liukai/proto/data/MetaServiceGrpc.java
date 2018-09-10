package com.liukai.proto.data;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.0-pre2)",
    comments = "Source: meta_rpc.proto")
public class MetaServiceGrpc {

  private MetaServiceGrpc() {}

  public static final String SERVICE_NAME = "look.meta.MetaService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.liukai.proto.data.RpcModel.PingResp> METHOD_PING =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "look.meta.MetaService", "Ping"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.liukai.proto.data.RpcModel.PingResp.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Int64Value,
      com.google.protobuf.Any> METHOD_GET_BRAND =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "look.meta.MetaService", "GetBrand"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Int64Value.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Any.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.liukai.proto.data.RpcModel.LongList,
      com.liukai.proto.data.RpcModel.LongKeyMap> METHOD_GET_BRANDS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "look.meta.MetaService", "GetBrands"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.liukai.proto.data.RpcModel.LongList.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.liukai.proto.data.RpcModel.LongKeyMap.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.liukai.proto.data.RpcModel.UpdateReq,
      com.liukai.proto.MetaModel.Brand> METHOD_SAVE_BRAND =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "look.meta.MetaService", "SaveBrand"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.liukai.proto.data.RpcModel.UpdateReq.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.liukai.proto.MetaModel.Brand.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.liukai.proto.data.RpcModel.ListReq,
      com.liukai.proto.data.RpcModel.ListResp> METHOD_LIST_BRAND =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "look.meta.MetaService", "ListBrand"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.liukai.proto.data.RpcModel.ListReq.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.liukai.proto.data.RpcModel.ListResp.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.liukai.proto.data.MetaRpc.BrandQuery,
      com.google.protobuf.Int32Value> METHOD_COUNT_BRAND =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "look.meta.MetaService", "CountBrand"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.liukai.proto.data.MetaRpc.BrandQuery.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Int32Value.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.liukai.proto.data.RpcModel.ListReq,
      com.liukai.proto.data.RpcModel.ListResp> METHOD_SEARCH_BRAND =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "look.meta.MetaService", "SearchBrand"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.liukai.proto.data.RpcModel.ListReq.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.liukai.proto.data.RpcModel.ListResp.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MetaServiceStub newStub(io.grpc.Channel channel) {
    return new MetaServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MetaServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MetaServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static MetaServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MetaServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class MetaServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void ping(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.liukai.proto.data.RpcModel.PingResp> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_PING, responseObserver);
    }

    /**
     * <pre>
     * 根据 brand id 获取 brand
     * </pre>
     */
    public void getBrand(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Any> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_BRAND, responseObserver);
    }

    /**
     */
    public void getBrands(com.liukai.proto.data.RpcModel.LongList request,
        io.grpc.stub.StreamObserver<com.liukai.proto.data.RpcModel.LongKeyMap> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_BRANDS, responseObserver);
    }

    /**
     * <pre>
     * 保存 brand：新加或更新
     * </pre>
     */
    public void saveBrand(com.liukai.proto.data.RpcModel.UpdateReq request,
        io.grpc.stub.StreamObserver<com.liukai.proto.MetaModel.Brand> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SAVE_BRAND, responseObserver);
    }

    /**
     * <pre>
     * brand 列表（分页）
     * </pre>
     */
    public void listBrand(com.liukai.proto.data.RpcModel.ListReq request,
        io.grpc.stub.StreamObserver<com.liukai.proto.data.RpcModel.ListResp> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_BRAND, responseObserver);
    }

    /**
     * <pre>
     * brand count
     * </pre>
     */
    public void countBrand(com.liukai.proto.data.MetaRpc.BrandQuery request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Int32Value> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_COUNT_BRAND, responseObserver);
    }

    /**
     * <pre>
     * 通过搜索引擎搜索 brand
     * </pre>
     */
    public void searchBrand(com.liukai.proto.data.RpcModel.ListReq request,
        io.grpc.stub.StreamObserver<com.liukai.proto.data.RpcModel.ListResp> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEARCH_BRAND, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_PING,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.liukai.proto.data.RpcModel.PingResp>(
                  this, METHODID_PING)))
          .addMethod(
            METHOD_GET_BRAND,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Int64Value,
                com.google.protobuf.Any>(
                  this, METHODID_GET_BRAND)))
          .addMethod(
            METHOD_GET_BRANDS,
            asyncUnaryCall(
              new MethodHandlers<
                com.liukai.proto.data.RpcModel.LongList,
                com.liukai.proto.data.RpcModel.LongKeyMap>(
                  this, METHODID_GET_BRANDS)))
          .addMethod(
            METHOD_SAVE_BRAND,
            asyncUnaryCall(
              new MethodHandlers<
                com.liukai.proto.data.RpcModel.UpdateReq,
                com.liukai.proto.MetaModel.Brand>(
                  this, METHODID_SAVE_BRAND)))
          .addMethod(
            METHOD_LIST_BRAND,
            asyncUnaryCall(
              new MethodHandlers<
                com.liukai.proto.data.RpcModel.ListReq,
                com.liukai.proto.data.RpcModel.ListResp>(
                  this, METHODID_LIST_BRAND)))
          .addMethod(
            METHOD_COUNT_BRAND,
            asyncUnaryCall(
              new MethodHandlers<
                com.liukai.proto.data.MetaRpc.BrandQuery,
                com.google.protobuf.Int32Value>(
                  this, METHODID_COUNT_BRAND)))
          .addMethod(
            METHOD_SEARCH_BRAND,
            asyncUnaryCall(
              new MethodHandlers<
                com.liukai.proto.data.RpcModel.ListReq,
                com.liukai.proto.data.RpcModel.ListResp>(
                  this, METHODID_SEARCH_BRAND)))
          .build();
    }
  }

  /**
   */
  public static final class MetaServiceStub extends io.grpc.stub.AbstractStub<MetaServiceStub> {
    private MetaServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MetaServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetaServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MetaServiceStub(channel, callOptions);
    }

    /**
     */
    public void ping(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.liukai.proto.data.RpcModel.PingResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_PING, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 根据 brand id 获取 brand
     * </pre>
     */
    public void getBrand(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Any> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_BRAND, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBrands(com.liukai.proto.data.RpcModel.LongList request,
        io.grpc.stub.StreamObserver<com.liukai.proto.data.RpcModel.LongKeyMap> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_BRANDS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 保存 brand：新加或更新
     * </pre>
     */
    public void saveBrand(com.liukai.proto.data.RpcModel.UpdateReq request,
        io.grpc.stub.StreamObserver<com.liukai.proto.MetaModel.Brand> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SAVE_BRAND, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * brand 列表（分页）
     * </pre>
     */
    public void listBrand(com.liukai.proto.data.RpcModel.ListReq request,
        io.grpc.stub.StreamObserver<com.liukai.proto.data.RpcModel.ListResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_BRAND, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * brand count
     * </pre>
     */
    public void countBrand(com.liukai.proto.data.MetaRpc.BrandQuery request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Int32Value> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_COUNT_BRAND, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 通过搜索引擎搜索 brand
     * </pre>
     */
    public void searchBrand(com.liukai.proto.data.RpcModel.ListReq request,
        io.grpc.stub.StreamObserver<com.liukai.proto.data.RpcModel.ListResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH_BRAND, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MetaServiceBlockingStub extends io.grpc.stub.AbstractStub<MetaServiceBlockingStub> {
    private MetaServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MetaServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetaServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MetaServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.liukai.proto.data.RpcModel.PingResp ping(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), METHOD_PING, getCallOptions(), request);
    }

    /**
     * <pre>
     * 根据 brand id 获取 brand
     * </pre>
     */
    public com.google.protobuf.Any getBrand(com.google.protobuf.Int64Value request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_BRAND, getCallOptions(), request);
    }

    /**
     */
    public com.liukai.proto.data.RpcModel.LongKeyMap getBrands(com.liukai.proto.data.RpcModel.LongList request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_BRANDS, getCallOptions(), request);
    }

    /**
     * <pre>
     * 保存 brand：新加或更新
     * </pre>
     */
    public com.liukai.proto.MetaModel.Brand saveBrand(com.liukai.proto.data.RpcModel.UpdateReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SAVE_BRAND, getCallOptions(), request);
    }

    /**
     * <pre>
     * brand 列表（分页）
     * </pre>
     */
    public com.liukai.proto.data.RpcModel.ListResp listBrand(com.liukai.proto.data.RpcModel.ListReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_BRAND, getCallOptions(), request);
    }

    /**
     * <pre>
     * brand count
     * </pre>
     */
    public com.google.protobuf.Int32Value countBrand(com.liukai.proto.data.MetaRpc.BrandQuery request) {
      return blockingUnaryCall(
          getChannel(), METHOD_COUNT_BRAND, getCallOptions(), request);
    }

    /**
     * <pre>
     * 通过搜索引擎搜索 brand
     * </pre>
     */
    public com.liukai.proto.data.RpcModel.ListResp searchBrand(com.liukai.proto.data.RpcModel.ListReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEARCH_BRAND, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MetaServiceFutureStub extends io.grpc.stub.AbstractStub<MetaServiceFutureStub> {
    private MetaServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MetaServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetaServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MetaServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.liukai.proto.data.RpcModel.PingResp> ping(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_PING, getCallOptions()), request);
    }

    /**
     * <pre>
     * 根据 brand id 获取 brand
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Any> getBrand(
        com.google.protobuf.Int64Value request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_BRAND, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.liukai.proto.data.RpcModel.LongKeyMap> getBrands(
        com.liukai.proto.data.RpcModel.LongList request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_BRANDS, getCallOptions()), request);
    }

    /**
     * <pre>
     * 保存 brand：新加或更新
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.liukai.proto.MetaModel.Brand> saveBrand(
        com.liukai.proto.data.RpcModel.UpdateReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SAVE_BRAND, getCallOptions()), request);
    }

    /**
     * <pre>
     * brand 列表（分页）
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.liukai.proto.data.RpcModel.ListResp> listBrand(
        com.liukai.proto.data.RpcModel.ListReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_BRAND, getCallOptions()), request);
    }

    /**
     * <pre>
     * brand count
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Int32Value> countBrand(
        com.liukai.proto.data.MetaRpc.BrandQuery request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_COUNT_BRAND, getCallOptions()), request);
    }

    /**
     * <pre>
     * 通过搜索引擎搜索 brand
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.liukai.proto.data.RpcModel.ListResp> searchBrand(
        com.liukai.proto.data.RpcModel.ListReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH_BRAND, getCallOptions()), request);
    }
  }

  private static final int METHODID_PING = 0;
  private static final int METHODID_GET_BRAND = 1;
  private static final int METHODID_GET_BRANDS = 2;
  private static final int METHODID_SAVE_BRAND = 3;
  private static final int METHODID_LIST_BRAND = 4;
  private static final int METHODID_COUNT_BRAND = 5;
  private static final int METHODID_SEARCH_BRAND = 6;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MetaServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(MetaServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PING:
          serviceImpl.ping((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.liukai.proto.data.RpcModel.PingResp>) responseObserver);
          break;
        case METHODID_GET_BRAND:
          serviceImpl.getBrand((com.google.protobuf.Int64Value) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Any>) responseObserver);
          break;
        case METHODID_GET_BRANDS:
          serviceImpl.getBrands((com.liukai.proto.data.RpcModel.LongList) request,
              (io.grpc.stub.StreamObserver<com.liukai.proto.data.RpcModel.LongKeyMap>) responseObserver);
          break;
        case METHODID_SAVE_BRAND:
          serviceImpl.saveBrand((com.liukai.proto.data.RpcModel.UpdateReq) request,
              (io.grpc.stub.StreamObserver<com.liukai.proto.MetaModel.Brand>) responseObserver);
          break;
        case METHODID_LIST_BRAND:
          serviceImpl.listBrand((com.liukai.proto.data.RpcModel.ListReq) request,
              (io.grpc.stub.StreamObserver<com.liukai.proto.data.RpcModel.ListResp>) responseObserver);
          break;
        case METHODID_COUNT_BRAND:
          serviceImpl.countBrand((com.liukai.proto.data.MetaRpc.BrandQuery) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Int32Value>) responseObserver);
          break;
        case METHODID_SEARCH_BRAND:
          serviceImpl.searchBrand((com.liukai.proto.data.RpcModel.ListReq) request,
              (io.grpc.stub.StreamObserver<com.liukai.proto.data.RpcModel.ListResp>) responseObserver);
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

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_PING,
        METHOD_GET_BRAND,
        METHOD_GET_BRANDS,
        METHOD_SAVE_BRAND,
        METHOD_LIST_BRAND,
        METHOD_COUNT_BRAND,
        METHOD_SEARCH_BRAND);
  }

}
