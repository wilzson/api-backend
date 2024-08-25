package com.demo.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo.api.model.entity.UserInterfaceInfo;
import com.demo.api.service.UserInterfaceInfoService;
import com.demo.api.mapper.UserInterfaceInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author fzefeng
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service实现
* @createDate 2024-08-25 23:47:12
*/
@Service
public class UserInterfaceInfoServiceImpl extends ServiceImpl<UserInterfaceInfoMapper, UserInterfaceInfo>
    implements UserInterfaceInfoService{

}




