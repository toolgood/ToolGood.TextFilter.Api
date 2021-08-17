#if image
#if GRPC
using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Google.Protobuf;
using Grpc.Net.Client;
using ToolGood.TextFilter.Api.Datas;
using ToolGood.TextFilter.Api.Datas.Images;

namespace ToolGood.TextFilter.Api.Grpcs
{
    public class ImageClassifyGrpcProvider
    {
        private readonly ImageClassifyGrpc.ImageClassifyGrpcClient _client;

        public ImageClassifyGrpcProvider(string grpcHost)
        {
            var channel = GrpcChannel.ForAddress(grpcHost);
            _client = new ImageClassifyGrpc.ImageClassifyGrpcClient(channel);
        }

        public ImageClassifyResult ImageLocalClassify(String path)
        {
            var response = _client.ImageLocalClassify(new ImageLocalGrpcRequest2() {
                Path = path
            });
            return Create(response);
        }
        public ImageClassifyResult ImageUploadClassify(String path)
        {
            var files = File.ReadAllBytes(path);
            var response = _client.ImageUploadClassify(new ImageUploadGrpcRequest2() {
                File = ByteString.CopyFrom(files),
            });
            return Create(response);
        }
        public ImageFilterResult BrowserFilter(float[] vals)
        {
            var request = new BrowserGrpcRequest();
            request.Params.Add(vals);
            var response = _client.BrowserFilter(request);
            return Create(response);
        }
        public ImageClassifyResult BrowserClassify(float[] vals)
        {
            var request = new BrowserGrpcRequest();
            request.Params.Add(vals);
            var response = _client.BrowserClassify(request);
            return Create(response);
        }

#if Async
        public CommonResult ImageLocalClassifyAsync(String path, String url, String requestId)
        {
            var response = _client.ImageLocalClassifyAsync(new ImageLocalAsyncGrpcRequest2() {
                Path = path,
                Url = url,
                RequestId = requestId,
            });
            return Create(response);
        }

        public CommonResult ImageUploadClassifyAsync(String path, String url, String requestId)
        {
            var files = File.ReadAllBytes(path);
            var response = _client.ImageUploadClassifyAsync(new ImageUploadAsyncGrpcRequest2() {
                File = ByteString.CopyFrom(files),
                Url = url,
                RequestId = requestId,
            });
            return Create(response);
        }

        public CommonResult BrowserFilterAsync(float[] vals, String url, String requestId)
        {
            var request = new BrowserAsyncGrpcRequest();
            request.Params.Add(vals);
            request.Url = url;
            request.RequestId = requestId;
            var response = _client.BrowserFilterAsync(request);
            return Create(response);
        }

        public CommonResult BrowserClassifyAsync(float[] vals, String url, String requestId)
        {
            var request = new BrowserAsyncGrpcRequest();
            request.Params.Add(vals);
            request.Url = url;
            request.RequestId = requestId;
            var response = _client.BrowserFilterAsync(request);
            return Create(response);
        } 
#endif

        private ImageClassifyResult Create(ImageClassifyGrpcReply2 response)
        {
            ImageClassifyResult result = new ImageClassifyResult() {
                Code = response.Code,
                Message = response.Message,
                RequestId = response.RequestId,

                Bloody = response.Bloody,
                Hentai = response.Hentai,
                Lure = response.Lure,
                Normal = response.Normal,
                Sexy = response.Sexy,
                Porn = response.Porn
            };
            return result;
        }

        private ImageClassifyResult Create(ImageBrowserClassifyGrpcReply response)
        {
            ImageClassifyResult result = new ImageClassifyResult() {
                Code = response.Code,
                Message = response.Message,
                RequestId = response.RequestId,

                Bloody = response.Bloody,
                Hentai = response.Hentai,
                Lure = response.Lure,
                Normal = response.Normal,
                Sexy = response.Sexy,
                Porn = response.Porn
            };
            return result;
        }

        private CommonResult Create(ImageRequestIdGrpcReply2 response)
        {
            CommonResult result = new CommonResult() {
                Code = response.Code,
                Message = response.Message,
                RequestId = response.RequestId,
            };
            return result;
        }

        private ImageFilterResult Create(ImageBrowserFilterGrpcReply response)
        {
            ImageFilterResult result = new ImageFilterResult() {
                Code = response.Code,
                Message = response.Message,
                RequestId = response.RequestId,
                UnSafe = response.Unsafe
            };
            return result;
        }


    }
}

#endif  
#endif