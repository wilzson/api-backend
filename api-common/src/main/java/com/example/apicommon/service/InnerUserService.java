package com.example.apicommon.service;

import com.example.apicommon.model.entity.User;

/**
 * 内部用户服务
 */
public interface InnerUserService {

    /**
     * 数据库中查是否已分配给用户密钥(accesskey)
     * @param accessKey
     * @return
     */
    User getInvokeUser(String accessKey);
}
