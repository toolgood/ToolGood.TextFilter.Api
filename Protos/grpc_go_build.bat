echo off 
echo ProtosתĿ���������У�go��������ӵģ�û�йٷ�protoc-gen-go.exe
echo ��һ�¼�����������
pause

protoc --plugin=protoc-gen-go=protoc-gen-go.exe  --go_out=plugins=grpc:. imageClassify.proto

protoc --plugin=protoc-gen-go=protoc-gen-go.exe  --go_out=plugins=grpc:. imageFilter.proto

protoc --plugin=protoc-gen-go=protoc-gen-go.exe  --go_out=plugins=grpc:. textFilter.proto

