package Images




type ImageClassifyResult struct{
	Code int
	Message string
	RequestId string
	Porn float32
	Bloody float32
	Hentai float32
	Lure float32
	Sexy float32
	Normal float32
}