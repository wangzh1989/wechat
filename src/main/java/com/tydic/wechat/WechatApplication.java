package com.tydic.wechat;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@MapperScan("com.tydic.wechat.mapper")
public class WechatApplication {

	public static void main(String[] args) {
		SpringApplication.run(WechatApplication.class, args);
	}
}
