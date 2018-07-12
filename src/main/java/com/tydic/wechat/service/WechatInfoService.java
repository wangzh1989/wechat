package com.tydic.wechat.service;

import com.tydic.wechat.mapper.InfoMapper;
import com.tydic.wechat.entity.WechatInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WechatInfoService {

    @Autowired
    private InfoMapper infoMapper;

    public List<WechatInfo> getInfo() {
        return infoMapper.getInfo();
    }

    public List<WechatInfo> getInfoById(int id) {
        return infoMapper.getInfoById(id);
    }

    public void save(WechatInfo wechatInfo){
        infoMapper.save(wechatInfo);
    }
}
