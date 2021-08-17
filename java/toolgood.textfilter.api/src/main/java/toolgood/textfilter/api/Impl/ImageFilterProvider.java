package toolgood.textfilter.api.Impl;

import java.util.Hashtable;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import toolgood.textfilter.api.TextFilterConfig;
import toolgood.textfilter.api.Datas.Images.ImageClassifyResult;
import toolgood.textfilter.api.Datas.Images.ImageFilterResult;
import toolgood.textfilter.api.Interfaces.IImageFilterProvider;

public class ImageFilterProvider extends ProviderBase implements IImageFilterProvider {
    public ImageFilterProvider(TextFilterConfig textFilterConfig) {
        super(textFilterConfig);
    }

    private final String ImageLocalFilterUrl = "/api/image-local-filter";
    private final String ImageUploadFilterUrl = "/api/image-upload-filter";
    private final String ImageLocalClassifyUrl = "/api/image-local-classify";
    private final String ImageUploadClassifyUrl = "/api/image-upload-classify";
    private final String BrowserFilterUrl = "/api/image-browser-filter";
    private final String BrowserClassifyUrl = "/api/image-browser-classify";

    @Override
    public ImageFilterResult ImageLocalFilter(String path) {
        Map<String, Object> dictionary = new Hashtable<String, Object>();
        dictionary.put("path", path);
        String content = doPost(ImageLocalFilterUrl, dictionary);

        Gson gson = new GsonBuilder().create();
        ImageFilterResult result = gson.fromJson(content, ImageFilterResult.class);
        return result;
    }

    @Override
    public ImageFilterResult ImageUploadFilter(String path) {
        Map<String, Object> dictionary = new Hashtable<String, Object>();
        dictionary.put("path", path);
        String content = doPost(ImageUploadFilterUrl, dictionary);

        Gson gson = new GsonBuilder().create();
        ImageFilterResult result = gson.fromJson(content, ImageFilterResult.class);
        return result;
    }

    @Override
    public ImageClassifyResult ImageLocalClassify(String path) {
        Map<String, Object> dictionary = new Hashtable<String, Object>();
        dictionary.put("path", path);
        String content = doPost(ImageLocalClassifyUrl, dictionary);

        Gson gson = new GsonBuilder().create();
        ImageClassifyResult result = gson.fromJson(content, ImageClassifyResult.class);
        return result;
    }

    @Override
    public ImageClassifyResult ImageUploadClassify(String path) {
        Map<String, Object> dictionary = new Hashtable<String, Object>();
        dictionary.put("path", path);
        String content = doPost(ImageUploadClassifyUrl, dictionary);

        Gson gson = new GsonBuilder().create();
        ImageClassifyResult result = gson.fromJson(content, ImageClassifyResult.class);
        return result;
    }

    @Override
    public ImageFilterResult BrowserFilter(float[] vals) {
        Map<String, Object> dictionary = new Hashtable<String, Object>();
        dictionary.put("Params", vals);
        String content = doPost(BrowserFilterUrl, dictionary);

        Gson gson = new GsonBuilder().create();
        ImageFilterResult result = gson.fromJson(content, ImageFilterResult.class);
        return result;
    }

    @Override
    public ImageClassifyResult BrowserClassify(float[] vals) {
        Map<String, Object> dictionary = new Hashtable<String, Object>();
        dictionary.put("Params", vals);
        String content = doPost(BrowserClassifyUrl, dictionary);

        Gson gson = new GsonBuilder().create();
        ImageClassifyResult result = gson.fromJson(content, ImageClassifyResult.class);
        return result;
    }

}
