package toolgood.textfilter.api.Grpcs;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;

import com.google.protobuf.ByteString;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import toolgood.textfilter.api.Datas.CommonResult;
import toolgood.textfilter.api.Datas.Images.ImageFilterResult;
import toolgood.textfilter.api.GrpcBase.ImageFilter.ImageFilterGrpcReply;
import toolgood.textfilter.api.GrpcBase.ImageFilter.ImageLocalAsyncGrpcRequest;
import toolgood.textfilter.api.GrpcBase.ImageFilter.ImageLocalGrpcRequest;
import toolgood.textfilter.api.GrpcBase.ImageFilter.ImageRequestIdGrpcReply;
import toolgood.textfilter.api.GrpcBase.ImageFilter.ImageUploadAsyncGrpcRequest;
import toolgood.textfilter.api.GrpcBase.ImageFilter.ImageUploadGrpcRequest;
import toolgood.textfilter.api.GrpcBase.ImageFilterGrpcGrpc;
import toolgood.textfilter.api.GrpcBase.ImageFilterGrpcGrpc.ImageFilterGrpcBlockingStub;

public class ImageFilterGrpcProvider {
    private final ImageFilterGrpcBlockingStub blockingStub;

    public ImageFilterGrpcProvider(String host, int port) {
        this(ManagedChannelBuilder.forAddress(host, port).usePlaintext().build());
    }

    public ImageFilterGrpcProvider(String url) {
        this(ManagedChannelBuilder.forTarget(url).usePlaintext().build());
    }

    private ImageFilterGrpcProvider(ManagedChannel channel) {
        blockingStub = ImageFilterGrpcGrpc.newBlockingStub(channel);
    }

    public ImageFilterResult ImageLocalFilter(String path) {
        ImageLocalGrpcRequest request = ImageLocalGrpcRequest.newBuilder().setPath(path).build();
        ImageFilterGrpcReply response = blockingStub.imageLocalFilter(request);
        return Create(response);
    }

    public CommonResult ImageLocalFilterAsync(String path, String url, String requestId) {
        ImageLocalAsyncGrpcRequest request = ImageLocalAsyncGrpcRequest.newBuilder().setPath(path).setUrl(url)
                .setRequestId(requestId).build();
        ImageRequestIdGrpcReply response = blockingStub.imageLocalFilterAsync(request);
        return Create(response);
    }

    public ImageFilterResult ImageUploadFilter(String path) throws IOException {
        byte[] bytes = ReadFile(path);

        ImageUploadGrpcRequest request = ImageUploadGrpcRequest.newBuilder().setFile(ByteString.copyFrom(bytes))
                .build();
        ImageFilterGrpcReply response = blockingStub.imageUploadFilter(request);
        return Create(response);
    }

    public CommonResult ImageUploadFilterAsync(String path, String url, String requestId) throws IOException {
        byte[] bytes = ReadFile(path);

        ImageUploadAsyncGrpcRequest request = ImageUploadAsyncGrpcRequest.newBuilder()
                .setFile(ByteString.copyFrom(bytes)).setUrl(url).setRequestId(requestId).build();
        ImageRequestIdGrpcReply response = blockingStub.imageUploadFilterAsync(request);
        return Create(response);
    }

    private ImageFilterResult Create(ImageFilterGrpcReply response) {
        ImageFilterResult result = new ImageFilterResult();
        result.code = response.getCode();
        result.message = response.getMessage();
        result.requestId = response.getRequestId();
        result.unsafe = response.getUnsafe();
        return result;
    }

    private CommonResult Create(ImageRequestIdGrpcReply response) {
        CommonResult result = new CommonResult();
        result.code = response.getCode();
        result.message = response.getMessage();
        result.requestId = response.getRequestId();
        return result;
    }

    private static byte[] ReadFile(String filename) throws IOException {

        FileChannel fc = null;
        try {
            fc = new RandomAccessFile(filename, "r").getChannel();
            MappedByteBuffer byteBuffer = fc.map(MapMode.READ_ONLY, 0, fc.size()).load();
            System.out.println(byteBuffer.isLoaded());
            byte[] result = new byte[(int) fc.size()];
            if (byteBuffer.remaining() > 0) {
                // System.out.println("remain");
                byteBuffer.get(result, 0, byteBuffer.remaining());
            }
            return result;
        } finally {
            fc.close();
        }
    }
}
