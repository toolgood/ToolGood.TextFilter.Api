package Impl


import "encoding/json"
import "net/http"
import "net/url"
import	"io/ioutil"
import	. "../Datas/Images"
import	"strconv"
import	"strings"


type ImageFilterProvider struct{
	textFilterHost string
}

func NewImageFilterProvider(config string) *ImageFilterProvider{
	provider := &ImageFilterProvider{}
	provider.textFilterHost = config
	return  provider;
}

const imageLocalFilterUrl string = "/api/image-local-filter";
const imageUploadFilterUrl string = "/api/image-upload-filter";
const imageLocalClassifyUrl string = "/api/image-local-classify";
const imageUploadClassifyUrl string = "/api/image-upload-classify";
const browserFilterUrl string = "/api/image-browser-filter";
const browserClassifyUrl string = "/api/image-browser-classify";

func (this *ImageFilterProvider)ImageLocalFilter(path string) *ImageFilterResult  {
	u:=this.textFilterHost+imageLocalFilterUrl;

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
func (this *ImageFilterProvider)ImageUploadFilter(path string) *ImageFilterResult  {
	u:=this.textFilterHost+imageUploadFilterUrl;

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
func (this *ImageFilterProvider)ImageLocalClassify(path string) *ImageClassifyResult  {
	u:=this.textFilterHost+imageLocalClassifyUrl;

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
func (this *ImageFilterProvider)ImageUploadClassify(path string) *ImageClassifyResult  {
	u:=this.textFilterHost+imageUploadClassifyUrl;

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
func (this *ImageFilterProvider)BrowserFilter(vals []float32) *ImageFilterResult  {
	u:=this.textFilterHost+browserFilterUrl;

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
func (this *ImageFilterProvider)BrowserClassify(vals []float32) *ImageClassifyResult  {
	u:=this.textFilterHost+browserClassifyUrl;

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

func toStr(vals []float32) string{
	var builder strings.Builder

	for i := 0; i < len(vals) ; i++ {
		val:=vals[i]
		builder.WriteString(strconv.FormatFloat(float64(val), 'f', 8, 64))
	}
	return  builder.String()
}


