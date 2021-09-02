# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

import imageClassify_pb2 as imageClassify__pb2


class ImageClassifyGrpcStub(object):
    """The greeting service definition.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.ImageLocalClassify = channel.unary_unary(
                '/imageFilter.ImageClassifyGrpc/ImageLocalClassify',
                request_serializer=imageClassify__pb2.ImageLocalGrpcRequest2.SerializeToString,
                response_deserializer=imageClassify__pb2.ImageClassifyGrpcReply2.FromString,
                )
        self.ImageUploadClassify = channel.unary_unary(
                '/imageFilter.ImageClassifyGrpc/ImageUploadClassify',
                request_serializer=imageClassify__pb2.ImageUploadGrpcRequest2.SerializeToString,
                response_deserializer=imageClassify__pb2.ImageClassifyGrpcReply2.FromString,
                )
        self.ImageLocalClassifyAsync = channel.unary_unary(
                '/imageFilter.ImageClassifyGrpc/ImageLocalClassifyAsync',
                request_serializer=imageClassify__pb2.ImageLocalAsyncGrpcRequest2.SerializeToString,
                response_deserializer=imageClassify__pb2.ImageRequestIdGrpcReply2.FromString,
                )
        self.ImageUploadClassifyAsync = channel.unary_unary(
                '/imageFilter.ImageClassifyGrpc/ImageUploadClassifyAsync',
                request_serializer=imageClassify__pb2.ImageUploadAsyncGrpcRequest2.SerializeToString,
                response_deserializer=imageClassify__pb2.ImageRequestIdGrpcReply2.FromString,
                )
        self.BrowserFilter = channel.unary_unary(
                '/imageFilter.ImageClassifyGrpc/BrowserFilter',
                request_serializer=imageClassify__pb2.BrowserGrpcRequest.SerializeToString,
                response_deserializer=imageClassify__pb2.ImageBrowserFilterGrpcReply.FromString,
                )
        self.BrowserClassify = channel.unary_unary(
                '/imageFilter.ImageClassifyGrpc/BrowserClassify',
                request_serializer=imageClassify__pb2.BrowserGrpcRequest.SerializeToString,
                response_deserializer=imageClassify__pb2.ImageBrowserClassifyGrpcReply.FromString,
                )
        self.BrowserFilterAsync = channel.unary_unary(
                '/imageFilter.ImageClassifyGrpc/BrowserFilterAsync',
                request_serializer=imageClassify__pb2.BrowserAsyncGrpcRequest.SerializeToString,
                response_deserializer=imageClassify__pb2.ImageRequestIdGrpcReply2.FromString,
                )
        self.BrowserClassifyAsync = channel.unary_unary(
                '/imageFilter.ImageClassifyGrpc/BrowserClassifyAsync',
                request_serializer=imageClassify__pb2.BrowserAsyncGrpcRequest.SerializeToString,
                response_deserializer=imageClassify__pb2.ImageRequestIdGrpcReply2.FromString,
                )


class ImageClassifyGrpcServicer(object):
    """The greeting service definition.
    """

    def ImageLocalClassify(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ImageUploadClassify(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ImageLocalClassifyAsync(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ImageUploadClassifyAsync(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def BrowserFilter(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def BrowserClassify(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def BrowserFilterAsync(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def BrowserClassifyAsync(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_ImageClassifyGrpcServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'ImageLocalClassify': grpc.unary_unary_rpc_method_handler(
                    servicer.ImageLocalClassify,
                    request_deserializer=imageClassify__pb2.ImageLocalGrpcRequest2.FromString,
                    response_serializer=imageClassify__pb2.ImageClassifyGrpcReply2.SerializeToString,
            ),
            'ImageUploadClassify': grpc.unary_unary_rpc_method_handler(
                    servicer.ImageUploadClassify,
                    request_deserializer=imageClassify__pb2.ImageUploadGrpcRequest2.FromString,
                    response_serializer=imageClassify__pb2.ImageClassifyGrpcReply2.SerializeToString,
            ),
            'ImageLocalClassifyAsync': grpc.unary_unary_rpc_method_handler(
                    servicer.ImageLocalClassifyAsync,
                    request_deserializer=imageClassify__pb2.ImageLocalAsyncGrpcRequest2.FromString,
                    response_serializer=imageClassify__pb2.ImageRequestIdGrpcReply2.SerializeToString,
            ),
            'ImageUploadClassifyAsync': grpc.unary_unary_rpc_method_handler(
                    servicer.ImageUploadClassifyAsync,
                    request_deserializer=imageClassify__pb2.ImageUploadAsyncGrpcRequest2.FromString,
                    response_serializer=imageClassify__pb2.ImageRequestIdGrpcReply2.SerializeToString,
            ),
            'BrowserFilter': grpc.unary_unary_rpc_method_handler(
                    servicer.BrowserFilter,
                    request_deserializer=imageClassify__pb2.BrowserGrpcRequest.FromString,
                    response_serializer=imageClassify__pb2.ImageBrowserFilterGrpcReply.SerializeToString,
            ),
            'BrowserClassify': grpc.unary_unary_rpc_method_handler(
                    servicer.BrowserClassify,
                    request_deserializer=imageClassify__pb2.BrowserGrpcRequest.FromString,
                    response_serializer=imageClassify__pb2.ImageBrowserClassifyGrpcReply.SerializeToString,
            ),
            'BrowserFilterAsync': grpc.unary_unary_rpc_method_handler(
                    servicer.BrowserFilterAsync,
                    request_deserializer=imageClassify__pb2.BrowserAsyncGrpcRequest.FromString,
                    response_serializer=imageClassify__pb2.ImageRequestIdGrpcReply2.SerializeToString,
            ),
            'BrowserClassifyAsync': grpc.unary_unary_rpc_method_handler(
                    servicer.BrowserClassifyAsync,
                    request_deserializer=imageClassify__pb2.BrowserAsyncGrpcRequest.FromString,
                    response_serializer=imageClassify__pb2.ImageRequestIdGrpcReply2.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'imageFilter.ImageClassifyGrpc', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class ImageClassifyGrpc(object):
    """The greeting service definition.
    """

    @staticmethod
    def ImageLocalClassify(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/imageFilter.ImageClassifyGrpc/ImageLocalClassify',
            imageClassify__pb2.ImageLocalGrpcRequest2.SerializeToString,
            imageClassify__pb2.ImageClassifyGrpcReply2.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ImageUploadClassify(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/imageFilter.ImageClassifyGrpc/ImageUploadClassify',
            imageClassify__pb2.ImageUploadGrpcRequest2.SerializeToString,
            imageClassify__pb2.ImageClassifyGrpcReply2.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ImageLocalClassifyAsync(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/imageFilter.ImageClassifyGrpc/ImageLocalClassifyAsync',
            imageClassify__pb2.ImageLocalAsyncGrpcRequest2.SerializeToString,
            imageClassify__pb2.ImageRequestIdGrpcReply2.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ImageUploadClassifyAsync(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/imageFilter.ImageClassifyGrpc/ImageUploadClassifyAsync',
            imageClassify__pb2.ImageUploadAsyncGrpcRequest2.SerializeToString,
            imageClassify__pb2.ImageRequestIdGrpcReply2.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def BrowserFilter(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/imageFilter.ImageClassifyGrpc/BrowserFilter',
            imageClassify__pb2.BrowserGrpcRequest.SerializeToString,
            imageClassify__pb2.ImageBrowserFilterGrpcReply.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def BrowserClassify(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/imageFilter.ImageClassifyGrpc/BrowserClassify',
            imageClassify__pb2.BrowserGrpcRequest.SerializeToString,
            imageClassify__pb2.ImageBrowserClassifyGrpcReply.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def BrowserFilterAsync(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/imageFilter.ImageClassifyGrpc/BrowserFilterAsync',
            imageClassify__pb2.BrowserAsyncGrpcRequest.SerializeToString,
            imageClassify__pb2.ImageRequestIdGrpcReply2.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def BrowserClassifyAsync(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/imageFilter.ImageClassifyGrpc/BrowserClassifyAsync',
            imageClassify__pb2.BrowserAsyncGrpcRequest.SerializeToString,
            imageClassify__pb2.ImageRequestIdGrpcReply2.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
