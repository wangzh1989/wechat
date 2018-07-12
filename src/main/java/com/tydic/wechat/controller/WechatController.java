package com.tydic.wechat.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tydic.wechat.entity.WechatInfo;
import com.tydic.wechat.service.WechatInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/wechat")
public class WechatController {
    private static final Logger LOGGER = LoggerFactory.getLogger(WechatController.class);
    @Autowired
    private WechatInfoService wechatInfoService;
    @RequestMapping("/showInfo")
    public PageInfo getInfo(int pageNum, int pageSize){
        PageHelper.startPage(pageNum,pageSize);//设置分页的起始码以及页面大小
        List<WechatInfo> list= wechatInfoService.getInfo();
        PageInfo infoList = new PageInfo(list);
        return infoList;
    }
}
