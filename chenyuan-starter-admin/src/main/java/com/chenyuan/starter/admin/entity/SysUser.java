package com.chenyuan.starter.admin.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "SYS_USERS")
public class SysUser extends BaseEntity {

    /**
     * 用户名
     */
    @Column(name = "USERNAME", nullable = true, columnDefinition = "varchar(64) comment '用户名'")
    private String username;

    /**
     * 用户密码
     */
    @Column(name = "PASSWORD", nullable = true, columnDefinition = "varchar(64) default '123456' comment '用户密码'")
    @JsonIgnore
    private String password;

    /**
     * 姓名
     */
    @Column(name = "NAME", nullable = true, columnDefinition = "varchar(64) comment '姓名'")
    private String name;

    /**
     * 头像
     */
    @Column(name = "AVATAR", columnDefinition = "varchar(200) comment '头像'")
    private String avatar;

    /**
     * 电话
     */
    @Column(name = "PHONE", columnDefinition = "varchar(11) comment '电话'")
    private String phone;

    /**
     * 身份证号
     */
    @Column(name = "SFZH", columnDefinition = "varchar(18) comment '身份证号'")
    private String sfzh;

    /**
     * 所在部门
     */
    @Column(name = "DEPARTMENT", columnDefinition = "varchar(64) comment '所在部门'")
    private String department;

    /**
     * 状态(0:禁用, 1:正常)
     */
    @Column(name = "STATUS", columnDefinition = "int default 1 comment '状态(0:禁用, 1:正常)'")
    private Integer status;

    /**
     * 登录模式(0:不限制, 1:PKI登录, 2:账号登录)
     */
    @Column(name = "LOGIN_MODE", columnDefinition = "int default 0 comment '登录模式(0:不限制, 1:PKI登录, 2:账号登录)'")
    private Integer loginMode;

    /**
     * 登录次数
     */
    @Column(name = "LOGIN_COUNT", columnDefinition = "int default 0 comment '登录次数'")
    private Integer loginCount;

    /**
     * 最后登录时间
     */
    @Column(name = "LAST_LOGIN")
    private Date lastLogin;

}
