package com.example.apicommon.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.example.apicommon.model.entity.UserInterfaceInfo;

/**
* @author fzefeng
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2024-08-25 23:47:12
*/
public interface InnerUserInterfaceInfoService {

    /**
     * 调用接口统计
     */
    boolean invokeCount(long interfaceInfoId, long userId);
}
