package com.tydic.wechat.mapper;

import com.tydic.wechat.entity.WechatInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface InfoMapper {
    /*@Select("select ID, APP_ID, APP_SECRET from wechat_info where id=#{id}")
    @Results({
        @Result(property = "id", column = "ID"),
        @Result(property = "appId", column = "APP_ID"),
        @Result(property = "appSecret", column = "APP_SECRET")
    })*/
    List<WechatInfo> getInfoById(int id);
    List<WechatInfo> getInfo();

    @Insert("INSERT INTO `wechat`.`WECHAT_INFO` (`APP_ID`, `APP_SECRET`) VALUES (#{appId}, #{appSecret})")
    @Options(useGeneratedKeys = true,keyColumn = "id",keyProperty = "id")
    public void save(WechatInfo info);
}
