#!/usr/bin/env python
# -*- coding:utf-8 -*-
# ImageFilterResult.py
# 2021, Lin Zhijun, https://github.com/toolgood/ToolGood.TextFilter.Api
# MIT Licensed 
 
__all__ = ['ToolGood.TextFilter.ImageFilterResult']

class ImageFilterResult():
    '返回码：0) 成功，1) 失败'
    code=0
    '返回码详情描述'
    message=""
    '请求标识'
    requestId=0
    '色情系数'
    porn=0.0
    '血腥系数'
    bloody=0.0
    '变态系数'
    hentai=0.0
    '引诱系数'
    lure=0.0
    '性感系数'
    sexy=0.0
    '正常系数'
    normal=0.0
 