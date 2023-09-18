package com.myapi.project.service.impl.inner;
/*
 * -*- coding = utf-8 -*-
 * @Time : 2023/9/17 13:32
 * @Author : Eason
 * @File : InnerInterfaceInfoServiceImpl.java
 * @Software : IntelliJ IDEA
 */




import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.myapi.myapicommon.model.entity.InterfaceInfo;
import com.myapi.myapicommon.service.InnerInterfaceInfoService;
import com.myapi.project.exception.BusinessException;
import com.myapi.project.mapper.InterfaceInfoMapper;
import com.myapi.project.common.ErrorCode;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 * 内部接口服务实现类
 */
@DubboService
public class InnerInterfaceInfoServiceImpl implements InnerInterfaceInfoService {

    @Resource
    private InterfaceInfoMapper interfaceInfoMapper;

    @Override
    public InterfaceInfo getInterfaceInfo(String url, String method) {
        if (StringUtils.isAnyBlank(url, method)) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        QueryWrapper<InterfaceInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("url", url);
        queryWrapper.eq("method", method);
        return interfaceInfoMapper.selectOne(queryWrapper);
    }

}
