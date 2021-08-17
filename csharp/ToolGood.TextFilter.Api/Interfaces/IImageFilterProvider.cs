#if image
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using ToolGood.TextFilter.Api.Datas.Images;

namespace ToolGood.TextFilter.Api.Interfaces
{
    public interface IImageFilterProvider
    {
        /// <summary>
        /// 本地图片检测
        /// </summary>
        /// <param name="path">图片文件</param>
        /// <returns></returns>
        ImageFilterResult ImageLocalFilter(string path);
        /// <summary>
        /// 本地图片检测
        /// </summary>
        /// <param name="path">图片文件</param>
        /// <returns></returns>
        Task<ImageFilterResult> ImageLocalFilterAsync(string path);
        /// <summary>
        /// 上传图片检测
        /// </summary>
        /// <param name="path">图片文件</param>
        /// <returns></returns>
        ImageFilterResult ImageUploadFilter(string path);
        /// <summary>
        /// 上传图片检测
        /// </summary>
        /// <param name="path">图片文件</param>
        /// <returns></returns>
        Task<ImageFilterResult> ImageUploadFilterAsync(string path);

#if Async
        /// <summary>
        /// 本地图片分类
        /// </summary>
        /// <param name="path">图片文件</param>
        /// <returns></returns>
        ImageClassifyResult ImageLocalClassify(string path);
        /// <summary>
        /// 本地图片分类
        /// </summary>
        /// <param name="path">图片文件</param>
        /// <returns></returns>
        Task<ImageClassifyResult> ImageLocalClassifyAsync(string path);
        /// <summary>
        /// 上传图片分类
        /// </summary>
        /// <param name="path">图片文件</param>
        /// <returns></returns>
        ImageClassifyResult ImageUploadClassify(string path);
        /// <summary>
        /// 上传图片分类
        /// </summary>
        /// <param name="path">图片文件</param>
        /// <returns></returns>
        Task<ImageClassifyResult> ImageUploadClassifyAsync(string path);

        /// <summary>
        /// 浏览器图片检测
        /// </summary>
        /// <param name="vals">值</param>
        /// <returns></returns>
        ImageFilterResult BrowserFilter(float[] vals);
        /// <summary>
        /// 浏览器图片检测
        /// </summary>
        /// <param name="vals">值</param>
        /// <returns></returns>
        Task<ImageFilterResult> BrowserFilterAsync(float[] vals);

        /// <summary>
        /// 浏览器图片分类
        /// </summary>
        /// <param name="vals">值</param>
        /// <returns></returns>
        ImageClassifyResult BrowserClassify(float[] vals);

        /// <summary>
        /// 浏览器图片分类
        /// </summary>
        /// <param name="vals">值</param>
        /// <returns></returns>
        Task<ImageClassifyResult> BrowserClassifyAsync(float[] vals);

#endif



    }
}

#endif