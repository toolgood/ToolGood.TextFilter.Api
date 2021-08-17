package toolgood.textfilter.api.Interfaces;

import toolgood.textfilter.api.Datas.Images.ImageClassifyResult;
import toolgood.textfilter.api.Datas.Images.ImageFilterResult;

public interface IImageFilterProvider {

    /**
     * 本地图片检测
     * 
     * @param path 图片文件
     * @return
     */
    ImageFilterResult ImageLocalFilter(String path);

    /**
     * 上传图片检测
     * 
     * @param path 图片文件
     * @return
     */
    ImageFilterResult ImageUploadFilter(String path);

    /**
     * 本地图片分类
     * 
     * @param path 图片文件
     * @return
     */
    ImageClassifyResult ImageLocalClassify(String path);

    /**
     * 上传图片分类
     * 
     * @param path 图片文件
     * @return
     */
    ImageClassifyResult ImageUploadClassify(String path);

    /**
     * 浏览器图片检测
     * 
     * @param vals 值
     * @return
     */
    ImageFilterResult BrowserFilter(float[] vals);

    /**
     * 浏览器图片分类
     * 
     * @param vals 值
     * @return
     */
    ImageClassifyResult BrowserClassify(float[] vals);

}
