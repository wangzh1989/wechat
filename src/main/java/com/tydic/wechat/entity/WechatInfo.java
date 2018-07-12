package com.tydic.wechat.entity;

import java.io.Serializable;

public class WechatInfo implements Serializable{
    private static Long serialVersionUID = 123131L;

    private int id;
    private String appId;
    private String appSecret;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }
}
