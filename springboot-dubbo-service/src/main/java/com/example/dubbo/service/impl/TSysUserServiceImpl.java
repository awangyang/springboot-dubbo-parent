package com.example.dubbo.service.impl;

import com.example.dubbo.entity.TSysUser;
import com.example.dubbo.mapper.TSysUserMapper;
import com.example.dubbo.service.ITSysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author Wang Yang
 * @since 2020-04-14
 */
@Service
@org.apache.dubbo.config.annotation.Service
public class TSysUserServiceImpl extends ServiceImpl<TSysUserMapper, TSysUser> implements ITSysUserService {

}
