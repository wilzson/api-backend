package com.demo.api.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.apicommon.model.entity.InterfaceInfo;

/**
* @author fzefeng
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2024-08-25 22:58:18
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo InterfaceInfo, boolean add);
}
