package com.myapi.project.service.impl.inner;
/*
 * -*- coding = utf-8 -*-
 * @Time : 2023/9/17 13:28
 * @Author : Eason
 * @File : InnerUserServiceImpl.java
 * @Software : IntelliJ IDEA
 */

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.myapi.myapicommon.model.entity.User;
import com.myapi.myapicommon.service.InnerUserService;
import com.myapi.project.exception.BusinessException;
import com.myapi.project.common.ErrorCode;
import com.myapi.project.mapper.UserMapper;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

@DubboService
public class InnerUserServiceImpl implements InnerUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User getInvokeUser(String accessKey) {
        if (StringUtils.isAnyBlank(accessKey)) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("accessKey", accessKey);
        return userMapper.selectOne(queryWrapper);
    }
}
