package com.myapi.myapiclientsdk.client;
/*
 * -*- coding = utf-8 -*-
 * @Time : 2023/6/4 11:43
 * @Author : Eason
 * @File : MyApiClient.java
 * @Software : IntelliJ IDEA
 */

/*
 * 调用第三方接口客户端
 * */

import cn.hutool.core.util.RandomUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.myapi.myapiclientsdk.model.User;


import java.util.HashMap;
import java.util.Map;

import static com.myapi.myapiclientsdk.Utils.SignUtils.genSign;


public class MyApiClient {

    private String accessKey;
    private String secretKey;


    public MyApiClient(String accessKey, String secretKey) {
        this.accessKey = accessKey;
        this.secretKey = secretKey;
    }

    public String getNameByGet(String name) {
        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("name", name);
        String result3 = HttpUtil.get("http://localhost:8123/api/name/", paramMap);
        System.out.println(result3);
        return "Get" + result3;
    }

    public String getNameByPost(String name) {
        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("name", name);
        String result3 = HttpUtil.post("http://localhost:8123/api/name/", paramMap);
        System.out.println(result3);
        return "Post1" + result3;
    }



    /*
    * hashmap的结构，前几个是参数，最后一个sign是之前参数进行加密后的数
    * */
    private Map<String, String> getHeaderMap(String body) {
        Map<String, String> hashmap = new HashMap<>();
        hashmap.put("accessKey", accessKey);
//        hashmap.put("secretKey", secretKey);
        hashmap.put("nonce", RandomUtil.randomNumbers(4));
        hashmap.put("body", body);
        hashmap.put("timestamp", String.valueOf(System.currentTimeMillis()/1000));
        hashmap.put("sign", genSign(body,secretKey));
        return hashmap;
    }



    public String getUserNameByPost(User user) {
        String json = JSONUtil.toJsonStr(user);
        HttpResponse httpResponse = HttpRequest.post("http://localhost:8123/api/name/user").addHeaders(getHeaderMap(json)).body(json).execute();
        System.out.println(httpResponse.getStatus());
        String result = httpResponse.body();
        return "Post2" + result;

    }

}
