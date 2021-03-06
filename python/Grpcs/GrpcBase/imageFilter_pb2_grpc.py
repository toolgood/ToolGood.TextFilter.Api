# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

import imageFilter_pb2 as imageFilter__pb2


class ImageFilterGrpcStub(object):
    """The greeting service definition.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.ImageLocalFilter = channel.unary_unary(
                '/imageFilter.ImageFilterGrpc/ImageLocalFilter',
                request_serializer=imageFilter__pb2.ImageLocalGrpcRequest.SerializeToString,
                response_deserializer=imageFilter__pb2.ImageFilterGrpcReply.FromString,
                )
        self.ImageUploadFilter = channel.unary_unary(
                '/imageFilter.ImageFilterGrpc/ImageUploadFilter',
                request_serializer=imageFilter__pb2.ImageUploadGrpcRequest.SerializeToString,
                response_deserializer=imageFilter__pb2.ImageFilterGrpcReply.FromString,
                )
        self.ImageLocalFilterAsync = channel.unary_unary(
                '/imageFilter.ImageFilterGrpc/ImageLocalFilterAsync',
                request_serializer=imageFilter__pb2.ImageLocalAsyncGrpcRequest.SerializeToString,
                response_deserializer=imageFilter__pb2.ImageRequestIdGrpcReply.FromString,
                )
        self.ImageUploadFilterAsync = channel.unary_unary(
                '/imageFilter.ImageFilterGrpc/ImageUploadFilterAsync',
                request_serializer=imageFilter__pb2.ImageUploadAsyncGrpcRequest.SerializeToString,
                response_deserializer=imageFilter__pb2.ImageRequestIdGrpcReply.FromString,
                )


class ImageFilterGrpcServicer(object):
    """The greeting service definition.
    """

    def ImageLocalFilter(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ImageUploadFilter(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ImageLocalFilterAsync(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ImageUploadFilterAsync(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_ImageFilterGrpcServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'ImageLocalFilter': grpc.unary_unary_rpc_method_handler(
                    servicer.ImageLocalFilter,
                    request_deserializer=imageFilter__pb2.ImageLocalGrpcRequest.FromString,
                    response_serializer=imageFilter__pb2.ImageFilterGrpcReply.SerializeToString,
            ),
            'ImageUploadFilter': grpc.unary_unary_rpc_method_handler(
                    servicer.ImageUploadFilter,
                    request_deserializer=imageFilter__pb2.ImageUploadGrpcRequest.FromString,
                    response_serializer=imageFilter__pb2.ImageFilterGrpcReply.SerializeToString,
            ),
            'ImageLocalFilterAsync': grpc.unary_unary_rpc_method_handler(
                    servicer.ImageLocalFilterAsync,
                    request_deserializer=imageFilter__pb2.ImageLocalAsyncGrpcRequest.FromString,
                    response_serializer=imageFilter__pb2.ImageRequestIdGrpcReply.SerializeToString,
            ),
            'ImageUploadFilterAsync': grpc.unary_unary_rpc_method_handler(
                    servicer.ImageUploadFilterAsync,
                    request_deserializer=imageFilter__pb2.ImageUploadAsyncGrpcRequest.FromString,
                    response_serializer=imageFilter__pb2.ImageRequestIdGrpcReply.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'imageFilter.ImageFilterGrpc', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class ImageFilterGrpc(object):
    """The greeting service definition.
    """

    @staticmethod
    def ImageLocalFilter(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/imageFilter.ImageFilterGrpc/ImageLocalFilter',
            imageFilter__pb2.ImageLocalGrpcRequest.SerializeToString,
            imageFilter__pb2.ImageFilterGrpcReply.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ImageUploadFilter(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/imageFilter.ImageFilterGrpc/ImageUploadFilter',
            imageFilter__pb2.ImageUploadGrpcRequest.SerializeToString,
            imageFilter__pb2.ImageFilterGrpcReply.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ImageLocalFilterAsync(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/imageFilter.ImageFilterGrpc/ImageLocalFilterAsync',
            imageFilter__pb2.ImageLocalAsyncGrpcRequest.SerializeToString,
            imageFilter__pb2.ImageRequestIdGrpcReply.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ImageUploadFilterAsync(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/imageFilter.ImageFilterGrpc/ImageUploadFilterAsync',
            imageFilter__pb2.ImageUploadAsyncGrpcRequest.SerializeToString,
            imageFilter__pb2.ImageRequestIdGrpcReply.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
