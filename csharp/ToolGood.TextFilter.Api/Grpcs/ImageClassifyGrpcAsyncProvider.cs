#if image
#if GRPC
using System;
using System.IO;
using System.Threading.Tasks;
using Google.Protobuf;
using Grpc.Net.Client;
using ToolGood.TextFilter.Api.Datas;
using ToolGood.TextFilter.Api.Datas.Images;

namespace ToolGood.TextFilter.Api.Grpcs
{
    public class ImageClassifyGrpcAsyncProvider
    {
        private readonly ImageClassifyGrpc.ImageClassifyGrpcClient _client;

        public ImageClassifyGrpcAsyncProvider(string grpcHost)
        {
            var channel = GrpcChannel.ForAddress(grpcHost);
            _client = new ImageClassifyGrpc.ImageClassifyGrpcClient(channel);
        }


        public async Task<ImageClassifyResult> ImageLocalClassify(String path)
        {
            var response = await _client.ImageLocalClassifyAsync(new ImageLocalGrpcRequest2() {
                Path = path
            });
            return Create(response);
        }

        public async Task<ImageClassifyResult> ImageUploadClassify(String path)
        {
            var files = File.ReadAllBytes(path);
            var response = await _client.ImageUploadClassifyAsync(new ImageUploadGrpcRequest2() {
                File = ByteString.CopyFrom(files),
            });
            return Create(response);
        }
        public async Task<ImageFilterResult> BrowserFilter(float[] vals)
        {
            var request = new BrowserGrpcRequest();
            request.Params.Add(vals);
            var response = await _client.BrowserFilterAsync(request);
            return Create(response);
        }
        public async Task<ImageClassifyResult> BrowserClassify(float[] vals)
        {
            var request = new BrowserGrpcRequest();
            request.Params.Add(vals);
            var response = await _client.BrowserClassifyAsync(request);
            return Create(response);
        }

#if Async
        public async Task<CommonResult> ImageLocalClassifyAsync(String path, String url, String requestId)
        {
            var response = await _client.ImageLocalClassifyAsyncAsync(new ImageLocalAsyncGrpcRequest2() {
                Path = path,
                Url = url,
                RequestId = requestId,
            });
            return Create(response);
        }

        public async Task<CommonResult> ImageUploadClassifyAsync(String path, String url, String requestId)
        {
            var files = File.ReadAllBytes(path);
            var response = await _client.ImageUploadClassifyAsyncAsync(new ImageUploadAsyncGrpcRequest2() {
                File = ByteString.CopyFrom(files),
                Url = url,
                RequestId = requestId,
            });
            return Create(response);
        }

        public async Task<CommonResult> BrowserFilterAsync(float[] vals, String url, String requestId)
        {
            var request = new BrowserAsyncGrpcRequest();
            request.Params.Add(vals);
            request.Url = url;
            request.RequestId = requestId;
            var response = await _client.BrowserFilterAsyncAsync(request);
            return Create(response);
        }

        public async Task<CommonResult> BrowserClassifyAsync(float[] vals, String url, String requestId)
        {
            var request = new BrowserAsyncGrpcRequest();
            request.Params.Add(vals);
            request.Url = url;
            request.RequestId = requestId;
            var response = await _client.BrowserFilterAsyncAsync(request);
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
