package com.example.springboot.dubbo.web;

import com.example.dubbo.service.IUserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangyang
 * @date 2020/06/05
 */
@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Reference(version = "1.0.0")
    private IUserService userService;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        //生成环境是查询数据库获取username的角色用于后续权限判断（如：张三 admin)
        //这里不做数据库操作，给定假数据，有兴趣的人可以使内存模式。
        com.example.dubbo.entity.User user = userService.getUsername(username);

        GrantedAuthority grantedAuthority = new SimpleGrantedAuthority("管理员");
        grantedAuthorities.add(grantedAuthority);

        //创建一个用户，用于判断权限，请注意此用户名和方法参数中的username一致；BCryptPasswordEncoder是用来演示加密使用。
        return new User(user.getUsername(), user.getPassword(), grantedAuthorities);
    }
}
