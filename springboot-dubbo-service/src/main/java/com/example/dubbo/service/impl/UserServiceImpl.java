package com.example.dubbo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.dubbo.entity.User;
import com.example.dubbo.mapper.UserMapper;
import com.example.dubbo.service.IUserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @author: WangYang
 * @date: 2019-08-03 17:07:24
 */
@Component
@Service(version = "1.0.0", timeout = 10000, interfaceClass = IUserService.class)
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public String getUsername() {
        return "大帅比！！！！！！！！！";
    }
}
