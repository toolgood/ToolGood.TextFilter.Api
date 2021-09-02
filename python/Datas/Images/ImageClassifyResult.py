#!/usr/bin/env python
# -*- coding:utf-8 -*-
# ImageClassifyResult.py
# 2021, Lin Zhijun, https://github.com/toolgood/ToolGood.TextFilter.Api
# MIT Licensed 
 
__all__ = ['ToolGood.TextFilter.ImageClassifyResult']

class ImageClassifyResult():
    '返回码：0) 成功，1) 失败'
    code=0
    '返回码详情描述'
    message=""
    '请求标识'
    requestId=0
    '不安全系数'
    unsafe=0.0
 
 