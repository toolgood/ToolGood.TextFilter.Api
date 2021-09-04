package Texts

 
          
type TextFilterResult struct{
	Code int     
	Message string
	RequestId string
	RiskLevel string
	SentimentScore float32

	Details []TextFilterDetailItem
	Contacts []TextFilterContactItem
}