#!/usr/bin/env python
# -*- coding:utf-8 -*-
# ImageFilterAsyncProvider.py
# 2021, Lin Zhijun, https://github.com/toolgood/ToolGood.TextFilter.Api
# MIT Licensed 

import grpc



class ImageClassifyGrpcProvider():
    def __init__(self,textFilterConfig):
        self.__textFilterConfig=textFilterConfig



        