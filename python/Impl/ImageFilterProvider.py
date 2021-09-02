#!/usr/bin/env python
# -*- coding:utf-8 -*-
# ImageFilterProvider.py
# 2021, Lin Zhijun, https://github.com/toolgood/ToolGood.TextFilter.Api
# MIT Licensed 
 
__all__ = ['ImageFilterProvider']
import json
import http.client, urllib.parse
import requests


class ImageFilterProvider():

    def __init__(self,textFilterConfig):
        self.__textFilterConfig=textFilterConfig
        self.__ImageLocalFilterUrl = "/api/image-local-filter"
        self.__ImageUploadFilterUrl = "/api/image-upload-filter"
        self.__ImageLocalClassifyUrl = "/api/image-local-classify"
        self.__ImageUploadClassifyUrl = "/api/image-upload-classify"
        self.__BrowserFilterUrl = "/api/image-browser-filter"
        self.__BrowserClassifyUrl = "/api/image-browser-classify"

    def ImageLocalFilter(self,path:str):
        """本地图片检测

        @path      图片文件

        @url       异步回调地址 可空

        @requestId 请求标识，为空时会自动生成
        """
        dictionary = {'path':path}
        result=doPost(self.__textFilterConfig,self.__ImageLocalFilterUrl,dictionary)
        return json.loads(result)

    def ImageUploadFilter(self,path:str):
        """上传图片检测
        
        @path      图片文件

        @url       异步回调地址 可空

        @requestId 请求标识，为空时会自动生成
        """
        u=self.__textFilterConfig.GetTextFilterHost()+self.__ImageUploadFilterUrl

        files = {'file': open(path, 'rb')}
        result = requests.post(u, files=files)
        return json.loads(result.text)

    def ImageLocalClassify(self,path:str):
        """        本地图片分类
        
        @path      图片文件

        @url       异步回调地址 可空

        @requestId 请求标识，为空时会自动生成
        """
        dictionary = {'path':path}
        result=doPost(self.__textFilterConfig,self.__ImageLocalClassifyUrl,dictionary)
        return json.loads(result)

    def ImageUploadClassify(self,path:str):
        """     上传图片分类
     
        @path      图片文件

        @url       异步回调地址 可空

        @requestId 请求标识，为空时会自动生成
        """
        u=self.__textFilterConfig.GetTextFilterHost()+self.__ImageUploadClassifyUrl
        files = {'file': open(path, 'rb')}
        result = requests.post(u, files=files)
        return json.loads(result.text)

    def BrowserFilter(self,vals:list):
        """ 浏览器图片检测
      
        @vals      值

        @url       异步回调地址 可空
        
        @requestId 请求标识，为空时会自动生成
        """
        dictionary = {'params':vals}
        result=doPost(self.__textFilterConfig,self.__BrowserFilterUrl,dictionary)
        return json.loads(result)

    def BrowserClassify(self,vals:list):
        """      浏览器图片分类

        @vals      值

        @url       异步回调地址 可空

        @requestId 请求标识，为空时会自动生成
        """
        dictionary = {'params':vals}
        result=doPost(self.__textFilterConfig,self.__BrowserClassifyUrl,dictionary)
        return json.loads(result)
  

def doPost(textFilterConfig,url,postData):
    u=textFilterConfig.GetTextFilterHost()+url
    result = requests.post(u, postData)
    return  result.text