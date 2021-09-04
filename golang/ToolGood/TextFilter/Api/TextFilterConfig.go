package Api

import . "./Impl"

type TextFilterConfig struct {
	textFilterHost string 
	grpcHost       string
	consulAddress  string
} 


func NewTextFilterConfig() *TextFilterConfig {
	result  := &TextFilterConfig{}
	result.textFilterHost  =  "http://localhost:9191"
	result.grpcHost  =  "http://localhost:9192"
	result.consulAddress  =  "http://localhost:8500"

	return result
}

func (this *TextFilterConfig)  GetTextFilterHost() string {
	return this.textFilterHost
}

func (this *TextFilterConfig)SetTextFilterHost(host string) {
	this.textFilterHost   = host
}
func (this *TextFilterConfig) GetGrpcHostt() string {
	return this.grpcHost 
}

func (this *TextFilterConfig) SetGrpcHostt(host string) {
	this.grpcHost = host 
}  

func (this *TextFilterConfig) GetConsulAddress() string {
	return this.consulAddress 
}

func (this *TextFilterConfig) SetConsulAddress(host string) {
	this.consulAddress = host 
}  

func (this *TextFilterConfig) CreateImageFilterAsyncProvider() *ImageFilterAsyncProvider {
	provider := NewImageFilterAsyncProvider(this.textFilterHost)
	return provider
}
func (this *TextFilterConfig) CreateImageFilterProvider() *ImageFilterProvider {
	provider := NewImageFilterProvider(this.textFilterHost)
	return provider
}
func (this *TextFilterConfig) CreateKeywordProvider() *KeywordProvider {
	provider := NewKeywordProvider(this.textFilterHost)
	return provider
}
func (this *TextFilterConfig) CreateKeywordTypeProvider() *KeywordTypeProvider {
	provider := NewKeywordTypeProvider(this.textFilterHost)
	return provider
}
func (this *TextFilterConfig) CreateSysProvider() *SysProvider {
	provider := NewSysProvider(this.textFilterHost)
	return provider
}
func (this *TextFilterConfig) CreateTextFilterAsyncProvider() *TextFilterAsyncProvider {
	provider := NewTextFilterAsyncProvider(this.textFilterHost)
	return provider
}
func (this *TextFilterConfig) CreateTextFilterProvider() *TextFilterProvider {
	provider := NewTextFilterProvider(this.textFilterHost)
	return provider
}