package com.example.dubbo.mapper;

import com.example.dubbo.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author Wang Yang
 * @since 2020-04-14
 */
@Repository
public interface UserMapper extends BaseMapper<User> {

}
