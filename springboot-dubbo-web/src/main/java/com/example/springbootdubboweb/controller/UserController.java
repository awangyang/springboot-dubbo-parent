package com.example.springbootdubboweb.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.dubbo.entity.TSysUser;
import com.example.dubbo.service.ITSysUserService;
import com.example.dubbo.service.IUserService;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @author: WangYang
 * @date: 2019-08-03 17:21:35
 */
@RestController
public class UserController {

    @Reference(version = "1.0.0")
    private IUserService userService;

    @Reference(version = "1.0.0")
    private ITSysUserService sysUserService;

    @GetMapping("/index")
    public String getUsername() {
        QueryWrapper<TSysUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", "manager");

        System.out.println(sysUserService.getById(7));
        return userService.getUsername();
    }
}
