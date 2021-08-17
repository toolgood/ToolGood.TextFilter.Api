#if image
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using ToolGood.TextFilter.Api.Datas.Images;
using ToolGood.TextFilter.Api.Interfaces;
using Newtonsoft.Json;

namespace ToolGood.TextFilter.Api.Impl
{
    public class ImageFilterProvider : ProviderBase, IImageFilterProvider
    {
        public ImageFilterProvider() : base(TextFilterConfig.Instance) { }
        public ImageFilterProvider(TextFilterConfig textFilterConfig) : base(textFilterConfig) { }

        private const string ImageLocalFilterUrl = "/api/image-local-filter";
        private const string ImageUploadFilterUrl = "/api/image-upload-filter";
        private const string ImageLocalClassifyUrl = "/api/image-local-classify";
        private const string ImageUploadClassifyUrl = "/api/image-upload-classify";
        private const string BrowserFilterUrl = "/api/image-browser-filter";
        private const string BrowserClassifyUrl = "/api/image-browser-classify";

        public ImageFilterResult ImageLocalFilter(string path)
        {
            Dictionary<string, string> dict = new Dictionary<string, string>();
            dict["path"] = path;
            var json = JsonConvert.SerializeObject(dict);
            return PostContent<ImageFilterResult>(ImageLocalFilterUrl, json);
        }
        public Task<ImageFilterResult> ImageLocalFilterAsync(string path)
        {
            Dictionary<string, string> dict = new Dictionary<string, string>();
            dict["path"] = path;
            var json = JsonConvert.SerializeObject(dict);
            return PostContentAsync<ImageFilterResult>(ImageLocalFilterUrl, json);
        }
        public ImageFilterResult ImageUploadFilter(string path)
        {
            return PostFile<ImageFilterResult>(ImageUploadFilterUrl, path);
        }
        public Task<ImageFilterResult> ImageUploadFilterAsync(string path)
        {
            return PostFileAsync<ImageFilterResult>(ImageUploadFilterUrl, path);
        }

#if Async
        public ImageClassifyResult ImageLocalClassify(string path)
        {
            Dictionary<string, string> dict = new Dictionary<string, string>();
            dict["path"] = path;
            var json = JsonConvert.SerializeObject(dict);
            return PostContent<ImageClassifyResult>(ImageLocalClassifyUrl, json);
        }
        public Task<ImageClassifyResult> ImageLocalClassifyAsync(string path)
        {
            Dictionary<string, string> dict = new Dictionary<string, string>();
            dict["path"] = path;
            var json = JsonConvert.SerializeObject(dict);
            return PostContentAsync<ImageClassifyResult>(ImageLocalClassifyUrl, json);
        }
        public ImageClassifyResult ImageUploadClassify(string path)
        {
            return PostFile<ImageClassifyResult>(ImageUploadClassifyUrl, path);
        }
        public Task<ImageClassifyResult> ImageUploadClassifyAsync(string path)
        {
            return PostFileAsync<ImageClassifyResult>(ImageUploadClassifyUrl, path);
        }


        public ImageFilterResult BrowserFilter(float[] vals)
        {
            var v = string.Join(",", vals);
            Dictionary<string, string> dict = new Dictionary<string, string>();
            dict["Params"] = v;
            var json = JsonConvert.SerializeObject(dict);
            return PostContent<ImageFilterResult>(BrowserFilterUrl, json);
        }
        public Task<ImageFilterResult> BrowserFilterAsync(float[] vals)
        {
            var v = string.Join(",", vals);
            Dictionary<string, string> dict = new Dictionary<string, string>();
            dict["Params"] = v;
            var json = JsonConvert.SerializeObject(dict);
            return PostContentAsync<ImageFilterResult>(BrowserFilterUrl, json);
        }

        public ImageClassifyResult BrowserClassify(float[] vals)
        {
            var v = string.Join(",", vals);
            Dictionary<string, string> dict = new Dictionary<string, string>();
            dict["Params"] = v;
            var json = JsonConvert.SerializeObject(dict);
            return PostContent<ImageClassifyResult>(BrowserClassifyUrl, json);
        }
        public Task<ImageClassifyResult> BrowserClassifyAsync(float[] vals)
        {
            var v = string.Join(",", vals);
            Dictionary<string, string> dict = new Dictionary<string, string>();
            dict["Params"] = v;
            var json = JsonConvert.SerializeObject(dict);
            return PostContentAsync<ImageClassifyResult>(BrowserClassifyUrl, json);
        }

#endif


    }
}

#endif