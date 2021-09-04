package Grpcs

import (
	"log"

	pb "./GrpcBase"
	"golang.org/x/net/context"
	"google.golang.org/grpc"

	. "../Datas/Requests"
	. "../Datas/Texts"
)

type TextFilterGrpcProvider struct {
	grpcHost string
}

func NewTextFilterGrpcProvider(grpcHost string) *TextFilterGrpcProvider {
	result := &TextFilterGrpcProvider{}
	result.grpcHost = grpcHost
	return result
}

func (this *TextFilterGrpcProvider) TextFilter(request *TextFilterRequest) *TextFilterResult {
	conn, err := grpc.Dial(this.grpcHost, grpc.WithInsecure())
	if err != nil {
		log.Fatalf("did not connect: %v", err)
	}
	t := pb.NewTextFilterGrpcClient(conn)

	reqBody := new(pb.TextFindAllGrpcRequest)
	reqBody.Txt = request.Txt
	reqBody.SkipBidi = request.SkipBidi
	reqBody.OnlyPosition = request.OnlyPosition

	tr, err := t.TextFilter(context.Background(), reqBody)
	if err != nil {
		log.Fatalf("did not connect: %v", err)
		return nil
	}
	result := this.createTextFilterResult(tr)
	defer conn.Close()

	return result
}

func (this *TextFilterGrpcProvider) createTextFilterResult(response *pb.TextFindAllGrpcReply) *TextFilterResult {
	var result *TextFilterResult
	result.Code = response.Code
	result.RiskCode = response.RiskCode
	result.RequestId = response.RequestId
	result.Message = response.Message
	result.RiskLevel = response.RiskLevel
	result.SentimentScore = response.SentimentScore
	details := make([]TextFilterDetailItem, len(response.Details))
	for index, r := range response.Details {
		item := &TextFilterDetailItem{}
		item.Position = r.Position
		item.RiskCode = r.RiskCode
		item.RiskLevel = r.RiskLevel
		item.Text = r.Text
		details[index] = *item
	}
	result.Details = details

	contactItems := make([]TextFilterContactItem, len(response.Contacts))
	for index, r := range response.Contacts {
		item := &TextFilterContactItem{}
		item.ContactType = r.ContactType
		item.ContactString = r.ContactString
		item.Position = r.Position
		contactItems[index] = *item
	}
	result.Contacts = contactItems
	return result
}
