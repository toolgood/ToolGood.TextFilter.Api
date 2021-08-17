#if Async
#if image
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Newtonsoft.Json;
using ToolGood.TextFilter.Api.Datas;
using ToolGood.TextFilter.Api.Datas.Images;
using ToolGood.TextFilter.Api.Interfaces;
using System.Web;

namespace ToolGood.TextFilter.Api.Impl
{
    public class ImageFilterAsyncProvider : ProviderBase, IImageFilterAsyncProvider
    {
        public ImageFilterAsyncProvider() : base(TextFilterConfig.Instance) { }
        public ImageFilterAsyncProvider(TextFilterConfig textFilterConfig) : base(textFilterConfig) { }


        private const string ImageLocalFilterUrl = "/api/async/image-local-filter";
        private const string ImageUploadFilterUrl = "/api/async/image-upload-filter";
        private const string ImageLocalClassifyUrl = "/api/async/image-local-classify";
        private const string ImageUploadClassifyUrl = "/api/async/image-upload-classify";
        private const string BrowserFilterUrl = "/api/async/image-browser-filter";
        private const string BrowserClassifyUrl = "/api/async/image-browser-classify";

        public CommonResult ImageLocalFilter(string path, string url, string requestId)
        {
            Dictionary<string, string> dict = new Dictionary<string, string>();
            dict["path"] = path;
            dict["url"] = url;
            dict["requestId"] = requestId;
            var json = JsonConvert.SerializeObject(dict);
            return PostContent<CommonResult>(ImageLocalFilterUrl, json);
        }
        public Task<CommonResult> ImageLocalFilterAsync(string path, string url, string requestId)
        {
            Dictionary<string, string> dict = new Dictionary<string, string>();
            dict["path"] = path;
            dict["url"] = url;
            dict["requestId"] = requestId;
            var json = JsonConvert.SerializeObject(dict);
            return PostContentAsync<CommonResult>(ImageLocalFilterUrl, json);
        }
        public CommonResult ImageUploadFilter(string path, string url, string requestId)
        {
            var u = "?url=" + HttpUtility.UrlEncode(url ?? "") + "&requestId=" + HttpUtility.UrlEncode(requestId ?? "");

            return PostFile<CommonResult>(ImageUploadFilterUrl + u, path);
        }
        public Task<CommonResult> ImageUploadFilterAsync(string path, string url, string requestId)
        {
            var u = "?url=" + HttpUtility.UrlEncode(url ?? "") + "&requestId=" + HttpUtility.UrlEncode(requestId ?? "");
            return PostFileAsync<CommonResult>(ImageUploadFilterUrl + u, path);
        }

#if Async
        public CommonResult ImageLocalClassify(string path, string url, string requestId)
        {
            Dictionary<string, string> dict = new Dictionary<string, string>();
            dict["path"] = path;
            dict["url"] = url;
            dict["requestId"] = requestId;
            var json = JsonConvert.SerializeObject(dict);
            return PostContent<CommonResult>(ImageLocalClassifyUrl, json);
        }
        public Task<CommonResult> ImageLocalClassifyAsync(string path, string url, string requestId)
        {
            Dictionary<string, string> dict = new Dictionary<string, string>();
            dict["path"] = path;
            dict["url"] = url;
            dict["requestId"] = requestId;
            var json = JsonConvert.SerializeObject(dict);
            return PostContentAsync<CommonResult>(ImageLocalClassifyUrl, json);
        }
        public CommonResult ImageUploadClassify(string path, string url, string requestId)
        {
            var u = "?url=" + HttpUtility.UrlEncode(url ?? "") + "&requestId=" + HttpUtility.UrlEncode(requestId ?? "");
            return PostFile<CommonResult>(ImageUploadClassifyUrl + u, path);
        }
        public Task<CommonResult> ImageUploadClassifyAsync(string path, string url, string requestId)
        {
            var u = "?url=" + HttpUtility.UrlEncode(url ?? "") + "&requestId=" + HttpUtility.UrlEncode(requestId ?? "");
            return PostFileAsync<CommonResult>(ImageUploadClassifyUrl + u, path);
        }


        public CommonResult BrowserFilter(float[] vals, string url, string requestId)
        {
            var v = string.Join(",", vals);
            Dictionary<string, string> dict = new Dictionary<string, string>();
            dict["Params"] = v;
            dict["url"] = url;
            dict["requestId"] = requestId;
            var json = JsonConvert.SerializeObject(dict);
            return PostContent<CommonResult>(BrowserFilterUrl, json);
        }
        public Task<CommonResult> BrowserFilterAsync(float[] vals, string url, string requestId)
        {
            var v = string.Join(",", vals);
            Dictionary<string, string> dict = new Dictionary<string, string>();
            dict["Params"] = v;
            dict["url"] = url;
            dict["requestId"] = requestId;
            var json = JsonConvert.SerializeObject(dict);
            return PostContentAsync<CommonResult>(BrowserFilterUrl, json);
        }

        public CommonResult BrowserClassify(float[] vals, string url, string requestId)
        {
            var v = string.Join(",", vals);
            Dictionary<string, string> dict = new Dictionary<string, string>();
            dict["Params"] = v;
            dict["url"] = url;
            dict["requestId"] = requestId;
            var json = JsonConvert.SerializeObject(dict);
            return PostContent<CommonResult>(BrowserClassifyUrl, json);
        }
        public Task<CommonResult> BrowserClassifyAsync(float[] vals, string url, string requestId)
        {
            var v = string.Join(",", vals);
            Dictionary<string, string> dict = new Dictionary<string, string>();
            dict["Params"] = v;
            dict["url"] = url;
            dict["requestId"] = requestId;
            var json = JsonConvert.SerializeObject(dict);
            return PostContentAsync<CommonResult>(BrowserClassifyUrl, json);
        }

#endif



    }
}

#endif
#endif