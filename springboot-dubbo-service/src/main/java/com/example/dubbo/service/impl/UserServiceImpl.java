package com.example.dubbo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.dubbo.entity.User;
import com.example.dubbo.mapper.UserMapper;
import com.example.dubbo.service.IUserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author WangYang
 * @date 2019-08-03 17:07:24
 */
@Component
@Service(version = "1.0.0", timeout = 10000, interfaceClass = IUserService.class)
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUsername(String username) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("_username", username);
        return userMapper.selectOne(queryWrapper);
    }
}
