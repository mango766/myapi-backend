package com.myapi.myapiclientsdk.utils;
/*
 * -*- coding = utf-8 -*-
 * @Time : 2023/6/4 19:38
 * @Author : Eason
 * @File : SignUtils.java
 * @Software : IntelliJ IDEA
 */

import cn.hutool.crypto.digest.DigestAlgorithm;
import cn.hutool.crypto.digest.Digester;

/*
 * 签名工具类
 * */
public class SignUtils {
    /**
     * 生成签名
     *
     * @param params
     * @param secretKey
     * @return
     */
    public static String genSign(String body, String secretKey) {
        Digester md5 = new Digester(DigestAlgorithm.SHA256);
        String content = body + "." + secretKey;
        return md5.digestHex(content);
    }
}
