package com.myapi.myapiinterface;
/*
 * -*- coding = utf-8 -*-
 * @Time : 2023/6/4 12:15
 * @Author : Eason
 * @File : Main.java
 * @Software : IntelliJ IDEA
 */

import cn.hutool.json.JSONUtil;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.myapi.myapiclientsdk.client.MyApiClient;
import com.myapi.myapiclientsdk.model.User;

import static sun.plugin2.util.PojoUtil.toJson;

public class Main {
    public static void main(String[] args) {

        String accessKey = "myapi";
        String secretKey="abcdef";


        MyApiClient myApiClient = new MyApiClient(accessKey, secretKey);

        String result1 =  myApiClient.getNameByGet("good");

        String result2 = myApiClient.getNameByPost("good");


        User user = new User();
        user.setUsername("lala");

        String result3 = myApiClient.getUserNameByPost(user);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
