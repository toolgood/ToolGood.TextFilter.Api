using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Newtonsoft.Json;

namespace ToolGood.TextFilter.Api.Datas.Images
{
    public class ImageClassifyResult
    {
        /// <summary>
        /// 返回码：0) 成功，1) 失败
        /// </summary>
        [JsonProperty("code")]
        public int Code { get; set; }
        /// <summary>
        /// 返回码详情描述
        /// </summary>
        [JsonProperty("message", NullValueHandling = NullValueHandling.Ignore)]
        public string Message { get; set; }
        /// <summary>
        /// 请求标识
        /// </summary>
        [JsonProperty("requestId", NullValueHandling = NullValueHandling.Ignore)]
        public string RequestId { get; set; }

        /// <summary>
        /// 色情系数
        /// </summary>
        [JsonProperty("porn", NullValueHandling = NullValueHandling.Ignore)]
        public float? Porn { get; set; }

        /// <summary>
        /// 血腥系数
        /// </summary>
        [JsonProperty("bloody", NullValueHandling = NullValueHandling.Ignore)]
        public float? Bloody { get; set; }

        /// <summary>
        /// 变态系数
        /// </summary>
        [JsonProperty("hentai", NullValueHandling = NullValueHandling.Ignore)]
        public float? Hentai { get; set; }

        /// <summary>
        /// 引诱系数
        /// </summary>
        [JsonProperty("lure", NullValueHandling = NullValueHandling.Ignore)]
        public float? Lure { get; set; }

        /// <summary>
        /// 性感系数
        /// </summary>
        [JsonProperty("sexy", NullValueHandling = NullValueHandling.Ignore)]
        public float? Sexy { get; set; }

        /// <summary>
        /// 正常系数
        /// </summary>
        [JsonProperty("normal", NullValueHandling = NullValueHandling.Ignore)]
        public float? Normal { get; set; }
    }
}
