package Impl

import "encoding/json"
import "net/http"
import "net/url"
import	"io/ioutil"
import	. "../Datas/Images"

type ImageFilterAsyncProvider struct{
	textFilterHost string
}

func NewImageFilterAsyncProvider(config string) *ImageFilterAsyncProvider{
	provider := &ImageFilterAsyncProvider{}
	provider.textFilterHost = config
	return  provider;
}


const imageLocalFilterUrl_async string = "/api/async/image-local-filter";
const imageUploadFilterUrl_async string = "/api/async/image-upload-filter";
const imageLocalClassifyUrl_async string = "/api/async/image-local-classify";
const imageUploadClassifyUrl_async string = "/api/async/image-upload-classify";
const browserFilterUrl_async string = "/api/async/image-browser-filter";
const browserClassifyUrl_async string = "/api/async/image-browser-classify";


func (this *ImageFilterAsyncProvider)ImageLocalFilter(path string) *ImageFilterResult  {
	u:=this.textFilterHost+imageLocalFilterUrl_async;

	resp, err := http.PostForm(u, url.Values{"path":{path}}) 
    if err != nil {
		return nil
    }
	defer resp.Body.Close() 
    body,err := ioutil.ReadAll(resp.Body)
    if err != nil {
		return nil
    }
	var result *ImageFilterResult
	err = json.Unmarshal([]byte(body), &result)
	if err != nil {
		return nil
	}
	return result
}
func (this *ImageFilterAsyncProvider)ImageUploadFilter(path string) *ImageFilterResult  {
	u:=this.textFilterHost+imageUploadFilterUrl_async;

	resp, err := http.PostForm(u, url.Values{"path":{path}}) 
    if err != nil {
		return nil
    }
	defer resp.Body.Close() 
    body,err := ioutil.ReadAll(resp.Body)
    if err != nil {
		return nil
    }
	var result *ImageFilterResult
	err = json.Unmarshal([]byte(body), &result)
	if err != nil {
		return nil
	}
	return result
}
func (this *ImageFilterAsyncProvider)ImageLocalClassify(path string) *ImageClassifyResult  {
	u:=this.textFilterHost+imageLocalClassifyUrl_async;

	resp, err := http.PostForm(u, url.Values{"path":{path}}) 
    if err != nil {
		return nil
    }
	defer resp.Body.Close() 
    body,err := ioutil.ReadAll(resp.Body)
    if err != nil {
		return nil
    }
	var result *ImageClassifyResult
	err = json.Unmarshal([]byte(body), &result)
	if err != nil {
		return nil
	}
	return result
}
func (this *ImageFilterAsyncProvider)ImageUploadClassify(path string) *ImageClassifyResult  {
	u:=this.textFilterHost+imageUploadClassifyUrl_async;

	resp, err := http.PostForm(u, url.Values{"path":{path}}) 
    if err != nil {
		return nil
    }
	defer resp.Body.Close() 
    body,err := ioutil.ReadAll(resp.Body)
    if err != nil {
		return nil
    }
	var result *ImageClassifyResult
	err = json.Unmarshal([]byte(body), &result)
	if err != nil {
		return nil
	}
	return result
}
func (this *ImageFilterAsyncProvider)BrowserFilter(vals []float32) *ImageFilterResult  {
	u:=this.textFilterHost+browserFilterUrl_async;

	resp, err := http.PostForm(u, url.Values{"Params":{toStr(vals)}}) 
    if err != nil {
		return nil
    }
	defer resp.Body.Close() 
    body,err := ioutil.ReadAll(resp.Body)
    if err != nil {
		return nil
    }
	var result *ImageFilterResult
	err = json.Unmarshal([]byte(body), &result)
	if err != nil {
		return nil
	}
	return result
}
func (this *ImageFilterAsyncProvider)BrowserClassify(vals []float32) *ImageClassifyResult  {
	u:=this.textFilterHost+browserClassifyUrl_async;

	resp, err := http.PostForm(u, url.Values{"Params":{toStr(vals)}}) 
    if err != nil {
		return nil
    }
	defer resp.Body.Close() 
    body,err := ioutil.ReadAll(resp.Body)
    if err != nil {
		return nil
    }
	var result *ImageClassifyResult
	err = json.Unmarshal([]byte(body), &result)
	if err != nil {
		return nil
	}
	return result
}
