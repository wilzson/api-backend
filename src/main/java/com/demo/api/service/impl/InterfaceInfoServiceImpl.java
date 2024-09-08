package com.demo.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo.api.service.InterfaceInfoService;
import com.demo.api.mapper.InterfaceInfoMapper;
import com.example.apicommon.model.entity.InterfaceInfo;
import org.springframework.stereotype.Service;

/**
* @author fzefeng
* @description 针对表【interface_info(接口信息)】的数据库操作Service实现
* @createDate 2024-08-25 22:58:18
*/
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo>
    implements InterfaceInfoService {

    @Override
    public void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add) {

    }
}




