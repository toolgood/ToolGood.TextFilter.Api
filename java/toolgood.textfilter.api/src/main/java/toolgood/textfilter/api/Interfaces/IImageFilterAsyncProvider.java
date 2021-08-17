package toolgood.textfilter.api.Interfaces;

import toolgood.textfilter.api.Datas.CommonResult;

public interface IImageFilterAsyncProvider {

    /**
     * 本地图片检测
     * 
     * @param path      图片文件
     * @param url       异步回调地址 可空
     * @param requestId 请求标识，为空时会自动生成
     * @return
     */
    CommonResult ImageLocalFilter(String path, String url, String requestId);

    /**
     * 上传图片检测
     * 
     * @param path      图片文件
     * @param url       异步回调地址 可空
     * @param requestId 请求标识，为空时会自动生成
     * @return
     */
    CommonResult ImageUploadFilter(String path, String url, String requestId);

    /**
     * 本地图片分类
     * 
     * @param path      图片文件
     * @param url       异步回调地址 可空
     * @param requestId 请求标识，为空时会自动生成
     * @return
     */
    CommonResult ImageLocalClassify(String path, String url, String requestId);

    /**
     * 上传图片分类
     * 
     * @param path      图片文件
     * @param url       异步回调地址 可空
     * @param requestId 请求标识，为空时会自动生成
     * @return
     */
    CommonResult ImageUploadClassify(String path, String url, String requestId);

    /**
     * 浏览器图片检测
     * 
     * @param vals      值
     * @param url       异步回调地址 可空
     * @param requestId 请求标识，为空时会自动生成
     * @return
     */
    CommonResult BrowserFilter(float[] vals, String url, String requestId);

    /**
     * 浏览器图片分类
     * 
     * @param vals      值
     * @param url       异步回调地址 可空
     * @param requestId 请求标识，为空时会自动生成
     * @return
     */
    CommonResult BrowserClassify(float[] vals, String url, String requestId);

}
