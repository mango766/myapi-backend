package com.myapi.project.service.impl.inner;

/*
 * -*- coding = utf-8 -*-
 * @Time : 2023/9/17 13:35
 * @Author : Eason
 * @File : InnerUserInterfaceInfoServiceImpl.java
 * @Software : IntelliJ IDEA
 */


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.myapi.myapicommon.model.entity.UserInterfaceInfo;
import com.myapi.myapicommon.service.InnerUserInterfaceInfoService;
import com.myapi.project.common.ErrorCode;
import com.myapi.project.exception.BusinessException;
import com.myapi.project.mapper.UserInterfaceInfoMapper;
import com.myapi.project.service.UserInterfaceInfoService;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 * 内部用户接口信息服务实现类
 */
@DubboService
public class InnerUserInterfaceInfoServiceImpl implements InnerUserInterfaceInfoService {

    @Resource
    private UserInterfaceInfoService userInterfaceInfoService;


    @Override
    public boolean invokeCount(long interfaceInfoId, long userId) {
        return userInterfaceInfoService.invokeCount(interfaceInfoId, userId);
    }

    @Override
    public boolean isLeftNumNull(long interfaceInfoId, long userId) {
        return userInterfaceInfoService.isLeftNumNull(interfaceInfoId, userId);
        }
    }


