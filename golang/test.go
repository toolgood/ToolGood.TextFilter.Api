package main
 
import "fmt"

import . "./Toolgood/TextFilter/Api"
import . "./Toolgood/TextFilter/Api/Datas/Requests"


  
func main()  {
	test_TextFilterProvider();
 
}
func test_TextFilterProvider(){
	fmt.Println("test_TextFilterProvider is Start.");

	config:= NewTextFilterConfig()
	provider :=config.CreateTextFilterProvider()
	request:=NewTextFilterRequest()
	request.Txt="你妈的"

	result:= provider.TextFilter(request)
	if(result.RiskLevel!="REJECT"){
		fmt.Println("TextFilter is Error.");
	}

	result= provider.HtmlFilter(request)
	if(result.RiskLevel!="REJECT"){
		fmt.Println("HtmlFilter is Error.");
	}

	result= provider.JsonFilter(request)
	if(result.RiskLevel!="REJECT"){
		fmt.Println("HtmlFilter is Error.");
	}
	result= provider.MarkdownFilter(request)
	if(result.RiskLevel!="REJECT"){
		fmt.Println("HtmlFilter is Error.");
	}
}
