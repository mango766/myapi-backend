package com.yupi.project.common;
/*
 * -*- coding = utf-8 -*-
 * @Time : 2023/7/24 13:41
 * @Author : Eason
 * @File : IdRequest.java
 * @Software : IntelliJ IDEA
 */

import lombok.Data;

import java.io.Serializable;
@Data
public class IdRequest implements Serializable {
    public Long id;
    private static final long serialVersionUID = 1L;


}
