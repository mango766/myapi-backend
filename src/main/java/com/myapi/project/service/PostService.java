package com.myapi.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.myapi.myapicommon.model.entity.InterfaceInfo;
import com.myapi.myapicommon.model.entity.UserInterfaceInfo;

/**
 * @author yupili
 * @description 针对表【interfaceInfo(帖子)】的数据库操作Service
 */
public interface PostService extends IService<InterfaceInfo> {

    /**
     * 校验
     *
     * @param interfaceInfo
     * @param add 是否为创建校验
     */
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);

    /**
    * @author Lenovo
    * @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
    * @createDate 2023-09-09 16:49:02
    */
    interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {

    }
}
