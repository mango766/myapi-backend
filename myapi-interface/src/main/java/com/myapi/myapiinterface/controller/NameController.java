package com.myapi.myapiinterface.controller;
/*
 * -*- coding = utf-8 -*-
 * @Time : 2023/6/3 21:16
 * @Author : Eason
 * @File : NameController.java
 * @Software : IntelliJ IDEA
 */

import com.myapi.myapiclientsdk.utils.SignUtils;

import com.myapi.myapiclientsdk.model.User;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/*
 * 查询名称接口
 * */
@RestController
@RequestMapping("/name")
public class NameController {

    @GetMapping("/get")
    public String getNameByGet(String name) {

        return "Get 你的名字是" + name;

    }

    @PostMapping("/post")
    public String getNameByPost(@RequestParam String name) {
        return "Post1 你的名字是" + name;

    }

    @PostMapping("/user")
    public String getUserNameByPost(@RequestBody User user, HttpServletRequest request) {
//        String accessKey = request.getHeader("accessKey");
////        String secretKey = request.getHeader("secretKey");
//        String nonce = request.getHeader("nonce");
//        String body = request.getHeader("body");
//        String timestamp = request.getHeader("timestamp");
//        String sign = request.getHeader("sign");
//
//
////首先在数据库中查询是否存在用户授权
//        if(!accessKey.equals("myapi")){
//            throw new RuntimeException("accessKey错误");
//        }
//        if(Long.parseLong(nonce)>10000){
//            throw  new RuntimeException("nonce错误");
//        }
//
////       todo 时间戳校验
////       if(timestamp>String.valueOf(System.currentTimeMillis()/1000+100))
////       todo  校验sign,实际情况中secretKey从数据库中查出来
//        String serverSign = SignUtils.genSign(body, "abcdef");
//        if(!sign.equals(serverSign)){
//            throw new RuntimeException("sign错误");
//        }
        String result =  "Post2 你的名字是" + user.getUsername();
        return result;
    }



}
