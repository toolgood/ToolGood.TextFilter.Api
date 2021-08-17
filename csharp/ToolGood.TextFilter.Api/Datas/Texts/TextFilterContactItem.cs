using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Newtonsoft.Json;

namespace ToolGood.TextFilter.Api.Datas.Texts
{
    public class TextFilterContactItem
    {
        /// <summary>
        /// 联系方式类型 0)手机号  1)qq号  2)微信号  3) 微博号  4)微信号公众号   
        /// </summary>
        [JsonProperty("contactType", NullValueHandling = NullValueHandling.Ignore)]
        public string ContactType { get; set; }
        /// <summary>
        /// 联系方式串
        /// </summary>
        [JsonProperty("contactString", NullValueHandling = NullValueHandling.Ignore)]
        public string ContactString { get; set; }
        /// <summary>
        /// 联系方式串位置，例：1,3,5,7-12,15
        /// </summary>
        [JsonProperty("position", NullValueHandling = NullValueHandling.Ignore)]
        public string Position { get; set; }

    }
}
