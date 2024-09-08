package com.example.apicommon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.apicommon.model.entity.InterfaceInfo;

/**
 * 内部接口信息服务
* @author fzefeng
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2024-08-25 22:58:18
*/
public interface InnerInterfaceInfoService {

    /**
     * 从数据库中查询模拟接口是否存在（请求路径、请求方法、请求参数）
     */
    InterfaceInfo getInterfaceInfo(String path, String method);
}
