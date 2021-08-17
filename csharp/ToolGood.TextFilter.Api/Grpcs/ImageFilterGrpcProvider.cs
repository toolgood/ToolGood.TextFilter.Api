#if GRPC
using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using System.Threading.Tasks;
using Google.Protobuf;
using Grpc.Net.Client;
using ToolGood.TextFilter.Api.Datas;
using ToolGood.TextFilter.Api.Datas.Images;

namespace ToolGood.TextFilter.Api.Grpcs
{
    public class ImageFilterGrpcProvider
    {
        private readonly ImageFilterGrpc.ImageFilterGrpcClient _client;

        public ImageFilterGrpcProvider(string grpcHost)
        {
            var channel = GrpcChannel.ForAddress(grpcHost);
            _client = new ImageFilterGrpc.ImageFilterGrpcClient(channel);
        }

        public ImageFilterResult ImageLocalFilter(String path)
        {
            var response = _client.ImageLocalFilter(new ImageLocalGrpcRequest() {
                Path = path,
            });
            return Create(response);
        }

        public ImageFilterResult ImageUploadFilter(String path)
        {
            var files = File.ReadAllBytes(path);
            var response = _client.ImageUploadFilter(new ImageUploadGrpcRequest() {
                File = ByteString.CopyFrom(files),
            });
            return Create(response);
        }
#if Async

        public CommonResult ImageLocalFilterAsync(String path, String url, String requestId)
        {
            var response = _client.ImageLocalFilterAsync(new ImageLocalAsyncGrpcRequest() {
                Path = path,
                Url = url,
                RequestId = requestId,
            });
            return Create(response);
        }

        public CommonResult ImageUploadFilterAsync(String path, String url, String requestId)
        {
            var files = File.ReadAllBytes(path);
            var response = _client.ImageUploadFilterAsync(new ImageUploadAsyncGrpcRequest() {
                File = ByteString.CopyFrom(files),
                Url = url,
                RequestId = requestId,
            });
            return Create(response);
        } 
#endif

        private ImageFilterResult Create(ImageFilterGrpcReply response)
        {
            ImageFilterResult result = new ImageFilterResult() {
                Code = response.Code,
                Message = response.Message,
                RequestId = response.RequestId,
                UnSafe = response.Unsafe
            };
            return result;
        }

        private CommonResult Create(ImageRequestIdGrpcReply response)
        {
            CommonResult result = new CommonResult() {
                Code = response.Code,
                Message = response.Message,
                RequestId = response.RequestId,
            };
            return result;
        }



    }
}

#endif