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
import toolgood.textfilter.api.Datas.Images.ImageClassifyResult;
import toolgood.textfilter.api.Datas.Images.ImageFilterResult;
import toolgood.textfilter.api.GrpcBase.ImageClassifyGrpcGrpc;
import toolgood.textfilter.api.GrpcBase.ImageClassifyGrpcGrpc.ImageClassifyGrpcBlockingStub;
import toolgood.textfilter.api.GrpcBase.ImageClassify.BrowserAsyncGrpcRequest;
import toolgood.textfilter.api.GrpcBase.ImageClassify.BrowserGrpcRequest;
import toolgood.textfilter.api.GrpcBase.ImageClassify.ImageBrowserClassifyGrpcReply;
import toolgood.textfilter.api.GrpcBase.ImageClassify.ImageBrowserFilterGrpcReply;
import toolgood.textfilter.api.GrpcBase.ImageClassify.ImageClassifyGrpcReply2;
import toolgood.textfilter.api.GrpcBase.ImageClassify.ImageLocalAsyncGrpcRequest2;
import toolgood.textfilter.api.GrpcBase.ImageClassify.ImageLocalGrpcRequest2;
import toolgood.textfilter.api.GrpcBase.ImageClassify.ImageRequestIdGrpcReply2;
import toolgood.textfilter.api.GrpcBase.ImageClassify.ImageUploadAsyncGrpcRequest2;
import toolgood.textfilter.api.GrpcBase.ImageClassify.ImageUploadGrpcRequest2;

public class ImageClassifyGrpcProvider {
    private final ImageClassifyGrpcBlockingStub blockingStub;

    public ImageClassifyGrpcProvider(String host, int port) {
        this(ManagedChannelBuilder.forAddress(host, port).usePlaintext().build());
    }

    public ImageClassifyGrpcProvider(String url) {
        this(ManagedChannelBuilder.forTarget(url).usePlaintext().build());
    }

    private ImageClassifyGrpcProvider(ManagedChannel channel) {
        blockingStub = ImageClassifyGrpcGrpc.newBlockingStub(channel);
    }

    public ImageClassifyResult ImageLocalClassify(String path) {
        ImageLocalGrpcRequest2 request = ImageLocalGrpcRequest2.newBuilder().setPath(path).build();
        ImageClassifyGrpcReply2 response = blockingStub.imageLocalClassify(request);
        return Create(response);
    }

    public CommonResult ImageLocalClassifyAsync(String path, String url, String requestId) {
        ImageLocalAsyncGrpcRequest2 request = ImageLocalAsyncGrpcRequest2.newBuilder().setPath(path).setUrl(url)
                .setRequestId(requestId).build();
        ImageRequestIdGrpcReply2 response = blockingStub.imageLocalClassifyAsync(request);
        return Create(response);
    }

    public ImageClassifyResult ImageUploadClassify(String path) throws IOException {
        byte[] bytes = ReadFile(path);

        ImageUploadGrpcRequest2 request = ImageUploadGrpcRequest2.newBuilder().setFile(ByteString.copyFrom(bytes))
                .build();
        ImageClassifyGrpcReply2 response = blockingStub.imageUploadClassify(request);
        return Create(response);
    }

    public CommonResult ImageUploadClassifyAsync(String path, String url, String requestId) throws IOException {
        byte[] bytes = ReadFile(path);

        ImageUploadAsyncGrpcRequest2 request = ImageUploadAsyncGrpcRequest2.newBuilder()
                .setFile(ByteString.copyFrom(bytes)).setUrl(url).setRequestId(requestId).build();
        ImageRequestIdGrpcReply2 response = blockingStub.imageUploadClassifyAsync(request);
        return Create(response);
    }

    public ImageFilterResult BrowserFilter(float[] vals) {
        BrowserGrpcRequest.Builder b = BrowserGrpcRequest.newBuilder();
        for (int i = 0; i < vals.length; i++) {
            b.setParams(i, vals[i]);
        }
        BrowserGrpcRequest request = b.build();
        ImageBrowserFilterGrpcReply response = blockingStub.browserFilter(request);
        return Create(response);
    }

    public CommonResult BrowserFilterAsync(float[] vals, String url, String requestId) {
        BrowserAsyncGrpcRequest.Builder b = BrowserAsyncGrpcRequest.newBuilder();
        for (int i = 0; i < vals.length; i++) {
            b.setParams(i, vals[i]);
        }
        BrowserAsyncGrpcRequest request = b.build();
        ImageRequestIdGrpcReply2 response = blockingStub.browserFilterAsync(request);
        return Create(response);
    }

    public ImageClassifyResult BrowserClassify(float[] vals) {
        BrowserGrpcRequest.Builder b = BrowserGrpcRequest.newBuilder();
        for (int i = 0; i < vals.length; i++) {
            b.setParams(i, vals[i]);
        }
        BrowserGrpcRequest request = b.build();
        ImageBrowserClassifyGrpcReply response = blockingStub.browserClassify(request);
        return Create(response);
    }

    public CommonResult BrowserClassifyAsync(float[] vals, String url, String requestId) {
        BrowserAsyncGrpcRequest.Builder b = BrowserAsyncGrpcRequest.newBuilder();
        for (int i = 0; i < vals.length; i++) {
            b.setParams(i, vals[i]);
        }
        BrowserAsyncGrpcRequest request = b.build();
        ImageRequestIdGrpcReply2 response = blockingStub.browserClassifyAsync(request);
        return Create(response);
    }

    private ImageClassifyResult Create(ImageClassifyGrpcReply2 response) {
        ImageClassifyResult result = new ImageClassifyResult();
        result.code = response.getCode();
        result.message = response.getMessage();
        result.requestId = response.getRequestId();

        result.bloody = response.getBloody();
        result.hentai = response.getHentai();
        result.lure = response.getLure();
        result.normal = response.getNormal();
        result.porn = response.getPorn();
        result.sexy = response.getSexy();
        return result;
    }

    private ImageClassifyResult Create(ImageBrowserClassifyGrpcReply response) {
        ImageClassifyResult result = new ImageClassifyResult();
        result.code = response.getCode();
        result.message = response.getMessage();
        result.requestId = response.getRequestId();

        result.bloody = response.getBloody();
        result.hentai = response.getHentai();
        result.lure = response.getLure();
        result.normal = response.getNormal();
        result.porn = response.getPorn();
        result.sexy = response.getSexy();
        return result;
    }

    private CommonResult Create(ImageRequestIdGrpcReply2 response) {
        CommonResult result = new CommonResult();
        result.code = response.getCode();
        result.message = response.getMessage();
        result.requestId = response.getRequestId();
        return result;
    }

    private ImageFilterResult Create(ImageBrowserFilterGrpcReply response) {
        ImageFilterResult result = new ImageFilterResult();
        result.code = response.getCode();
        result.message = response.getMessage();
        result.requestId = response.getRequestId();
        result.unsafe = response.getUnsafe();
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
