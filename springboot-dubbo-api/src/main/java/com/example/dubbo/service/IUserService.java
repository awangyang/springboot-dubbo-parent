package com.example.dubbo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.dubbo.entity.User;

/**
 * @Description:
 * @author: WangYang
 * @date: 2019-08-03 17:05:44
 */
public interface IUserService extends IService<User> {

    String getUsername();
}
