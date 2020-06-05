package com.example.springboot.dubbo.web.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.dubbo.dto.ResultDTO;
import com.example.dubbo.entity.User;
import com.example.dubbo.service.IUserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author WangYang
 * @date 2019-08-03 17:21:35
 */
@Controller
public class UserController {

    @Reference(version = "1.0.0")
    private IUserService userService;

    @GetMapping("/index")
    @ResponseBody
    public ResultDTO getUsername(String username) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", "manager");

        System.out.println(userService.getById(3));
        //System.out.println(userService.list(queryWrapper));
        return ResultDTO.success(userService.getUsername(username));
    }

    @GetMapping("/home")
    @ResponseBody
    public ResultDTO getHome() {
        return ResultDTO.success("home");
    }

    @GetMapping("/all")
    @ResponseBody
    public ResultDTO getAll() {
        return ResultDTO.success("all");
    }


    @RequestMapping("/login")
    public String getLogin() {
        return "login";
    }
}
