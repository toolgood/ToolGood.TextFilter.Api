#if Async
#if image
using System.Threading.Tasks;
using ToolGood.TextFilter.Api.Datas;

namespace ToolGood.TextFilter.Api.Interfaces
{
    public interface IImageFilterAsyncProvider
    {
        /// <summary>
        /// 本地图片检测
        /// </summary>
        /// <param name="path">图片文件</param>
        /// <param name="url">异步回调地址 可空</param>
        /// <param name="requestId">请求标识，为空时会自动生成</param>
        /// <returns></returns>
        CommonResult ImageLocalFilter(string path, string url, string requestId);
        /// <summary>
        /// 本地图片检测
        /// </summary>
        /// <param name="path">图片文件</param>
        /// <param name="url">异步回调地址 可空</param>
        /// <param name="requestId">请求标识，为空时会自动生成</param>
        /// <returns></returns>
        Task<CommonResult> ImageLocalFilterAsync(string path, string url, string requestId);
        /// <summary>
        /// 上传图片检测
        /// </summary>
        /// <param name="path">图片文件</param>
        /// <param name="url">异步回调地址 可空</param>
        /// <param name="requestId">请求标识，为空时会自动生成</param>
        /// <returns></returns>
        CommonResult ImageUploadFilter(string path, string url, string requestId);
        /// <summary>
        /// 上传图片检测
        /// </summary>
        /// <param name="path">图片文件</param>
        /// <param name="url">异步回调地址 可空</param>
        /// <param name="requestId">请求标识，为空时会自动生成</param>
        /// <returns></returns>
        Task<CommonResult> ImageUploadFilterAsync(string path, string url, string requestId);

#if Async
        /// <summary>
        /// 本地图片分类
        /// </summary>
        /// <param name="path">图片文件</param>
        /// <param name="url">异步回调地址 可空</param>
        /// <param name="requestId">请求标识，为空时会自动生成</param>
        /// <returns></returns>
        CommonResult ImageLocalClassify(string path, string url, string requestId);
        /// <summary>
        /// 本地图片分类
        /// </summary>
        /// <param name="path">图片文件</param>
        /// <param name="url">异步回调地址 可空</param>
        /// <param name="requestId">请求标识，为空时会自动生成</param>
        /// <returns></returns>
        Task<CommonResult> ImageLocalClassifyAsync(string path, string url, string requestId);
        /// <summary>
        /// 上传图片分类
        /// </summary>
        /// <param name="path">图片文件</param>
        /// <param name="url">异步回调地址 可空</param>
        /// <param name="requestId">请求标识，为空时会自动生成</param>
        /// <returns></returns>
        CommonResult ImageUploadClassify(string path, string url, string requestId);
        /// <summary>
        /// 上传图片分类
        /// </summary>
        /// <param name="path">图片文件</param>
        /// <param name="url">异步回调地址 可空</param>
        /// <param name="requestId">请求标识，为空时会自动生成</param>
        /// <returns></returns>
        Task<CommonResult> ImageUploadClassifyAsync(string path, string url, string requestId);


        /// <summary>
        /// 浏览器图片检测
        /// </summary>
        /// <param name="vals">值</param>
        /// <param name="url">异步回调地址 可空</param>
        /// <param name="requestId">请求标识，为空时会自动生成</param>
        /// <returns></returns>
        CommonResult BrowserFilter(float[] vals, string url, string requestId);
        /// <summary>
        /// 浏览器图片检测
        /// </summary>
        /// <param name="vals">值</param>
        /// <param name="url">异步回调地址 可空</param>
        /// <param name="requestId">请求标识，为空时会自动生成</param>
        /// <returns></returns>
        Task<CommonResult> BrowserFilterAsync(float[] vals, string url, string requestId);

        /// <summary>
        /// 浏览器图片分类
        /// </summary>
        /// <param name="vals">值</param>
        /// <param name="url">异步回调地址 可空</param>
        /// <param name="requestId">请求标识，为空时会自动生成</param>
        /// <returns></returns>
        CommonResult BrowserClassify(float[] vals, string url, string requestId);
        /// <summary>
        /// 浏览器图片分类
        /// </summary>
        /// <param name="vals">值</param>
        /// <param name="url">异步回调地址 可空</param>
        /// <param name="requestId">请求标识，为空时会自动生成</param>
        /// <returns></returns>
        Task<CommonResult> BrowserClassifyAsync(float[] vals, string url, string requestId);

#endif



    }

}

#endif  
#endif