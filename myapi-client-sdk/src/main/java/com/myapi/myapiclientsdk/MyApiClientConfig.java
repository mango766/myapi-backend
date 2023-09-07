package com.myapi.myapiclientsdk;
/*
 * -*- coding = utf-8 -*-
 * @Time : 2023/6/4 21:07
 * @Author : Eason
 * @File : MyApiClientConfig.java
 * @Software : IntelliJ IDEA
 */

import com.myapi.myapiclientsdk.client.MyApiClient;
import com.myapi.myapiclientsdk.model.User;
import lombok.Data;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ConfigurationProperties("myapi.client")
@Data
@ComponentScan
public class MyApiClientConfig {
    private String accessKey;
    private String secretKey;

    @Bean
    public MyApiClient myApiClient() {
        return new MyApiClient(accessKey, secretKey);
    }



}
