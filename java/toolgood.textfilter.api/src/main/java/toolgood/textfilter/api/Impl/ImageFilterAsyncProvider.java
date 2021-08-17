package toolgood.textfilter.api.Impl;

import java.util.Hashtable;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import toolgood.textfilter.api.TextFilterConfig;
import toolgood.textfilter.api.Datas.CommonResult;
import toolgood.textfilter.api.Interfaces.IImageFilterAsyncProvider;

public class ImageFilterAsyncProvider extends ProviderBase implements IImageFilterAsyncProvider {

    public ImageFilterAsyncProvider(TextFilterConfig textFilterConfig) {
        super(textFilterConfig);
    }

    private final String ImageLocalFilterUrl = "/api/async/image-local-filter";
    private final String ImageUploadFilterUrl = "/api/async/image-upload-filter";
    private final String ImageLocalClassifyUrl = "/api/async/image-local-classify";
    private final String ImageUploadClassifyUrl = "/api/async/image-upload-classify";
    private final String BrowserFilterUrl = "/api/async/image-browser-filter";
    private final String BrowserClassifyUrl = "/api/async/image-browser-classify";

    @Override
    public CommonResult ImageLocalFilter(String path, String url, String requestId) {
        Map<String, Object> dictionary = new Hashtable<String, Object>();
        dictionary.put("path", path);
        dictionary.put("url", url);
        dictionary.put("requestId", requestId);
        String content = doPost(ImageLocalFilterUrl, dictionary);

        Gson gson = new GsonBuilder().create();
        CommonResult result = gson.fromJson(content, CommonResult.class);
        return result;
    }

    @Override
    public CommonResult ImageUploadFilter(String path, String url, String requestId) {
        Map<String, Object> dictionary = new Hashtable<String, Object>();
        dictionary.put("path", path);
        dictionary.put("url", url);
        dictionary.put("requestId", requestId);
        String content = doPost(ImageUploadFilterUrl, dictionary);

        Gson gson = new GsonBuilder().create();
        CommonResult result = gson.fromJson(content, CommonResult.class);
        return result;
    }

    @Override
    public CommonResult ImageLocalClassify(String path, String url, String requestId) {
        Map<String, Object> dictionary = new Hashtable<String, Object>();
        dictionary.put("path", path);
        dictionary.put("url", url);
        dictionary.put("requestId", requestId);
        String content = doPost(ImageLocalClassifyUrl, dictionary);

        Gson gson = new GsonBuilder().create();
        CommonResult result = gson.fromJson(content, CommonResult.class);
        return result;
    }

    @Override
    public CommonResult ImageUploadClassify(String path, String url, String requestId) {
        Map<String, Object> dictionary = new Hashtable<String, Object>();
        dictionary.put("path", path);
        dictionary.put("url", url);
        dictionary.put("requestId", requestId);
        String content = doPost(ImageUploadClassifyUrl, dictionary);

        Gson gson = new GsonBuilder().create();
        CommonResult result = gson.fromJson(content, CommonResult.class);
        return result;
    }

    @Override
    public CommonResult BrowserFilter(float[] vals, String url, String requestId) {
        Map<String, Object> dictionary = new Hashtable<String, Object>();
        dictionary.put("Params", vals);
        dictionary.put("url", url);
        dictionary.put("requestId", requestId);
        String content = doPost(BrowserClassifyUrl, dictionary);

        Gson gson = new GsonBuilder().create();
        CommonResult result = gson.fromJson(content, CommonResult.class);
        return result;
    }

    @Override
    public CommonResult BrowserClassify(float[] vals, String url, String requestId) {
        Map<String, Object> dictionary = new Hashtable<String, Object>();
        dictionary.put("Params", vals);
        dictionary.put("url", url);
        dictionary.put("requestId", requestId);
        String content = doPost(BrowserFilterUrl, dictionary);

        Gson gson = new GsonBuilder().create();
        CommonResult result = gson.fromJson(content, CommonResult.class);
        return result;
    }

}
