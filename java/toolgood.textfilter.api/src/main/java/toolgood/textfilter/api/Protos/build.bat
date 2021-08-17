

protoc.exe --plugin=protoc-gen-grpc-java=protoc-gen-grpc-java-1.39.0-windows-x86_64.exe --grpc-java_out=./ *.proto

protoc.exe imageClassifyGrpc.proto --java_out=./

protoc.exe imageFilter.proto --java_out=./

protoc.exe textFilter.proto --java_out=./





pause

 