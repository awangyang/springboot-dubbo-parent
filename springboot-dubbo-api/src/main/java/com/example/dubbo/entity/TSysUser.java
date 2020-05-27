package com.example.dubbo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author Wang Yang
 * @since 2020-04-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TSysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 登陆名
     */
    private String loginName;

    /**
     * 用户名
     */
    private String name;

    /**
     * 密码
     */
    private String password;

    /**
     * 密码加密盐
     */
    private String salt;

    /**
     * 性别(0:男，1：女)
     */
    private Integer sex;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 用户类别（0：超级管理员，1：企业用户，2：监管用户）
     */
    private Integer userType;

    /**
     * 用户状态(0：正常，1：不正常)
     */
    private Integer status;

    /**
     * 过期字段（0-不过期，1-过期）
     */
    private Integer expired;

    /**
     * 所属企业
     */
    private String enterpriseId;

    /**
     * 所属部门
     */
    private String departmentId;

    /**
     * 用户职务
     */
    private String jobId;

    /**
     * 是否领导（0-是，1-否）
     */
    private Integer isLeader;

    /**
     * 记录创建时间
     */
    private LocalDateTime createTime;

    /**
     * 记录最后修改时间
     */
    private LocalDateTime updateTime;

    /**
     * 记录创建用户ID
     */
    private Long createUserId;


}
