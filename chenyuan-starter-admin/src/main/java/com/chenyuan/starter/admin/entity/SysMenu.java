package com.chenyuan.starter.admin.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "SYS_MENUS")
public class SysMenu extends BaseEntity {

    /**
     * 名称
     */
    @Column(name = "NAME", nullable = true)
    private String name;

    /**
     * 图标
     */
    @Column(name = "ICON")
    private String icon;

    /**
     * 类型(0:目录, 1:菜单, 2:按钮, 3:菜单引用, 4:导航菜单)
     */
    @Column(name = "TYPE", columnDefinition = "int default 0 comment '类型(0:目录, 1:菜单, 2:按钮, 3:菜单引用, 4:导航菜单)'")
    private Integer type;

    /**
     * 布局方式
     */
    @Column(name = "LAYOUT")
    private String layout;

    /**
     * 视图/页面
     */
    @Column(name = "VIEW")
    private String view;

    /**
     * 访问路径
     */
    @Column(name = "PATH")
    private String path;

    /**
     * 状态,是否有效(0:无效,1:有效)
     */
    @Column(name = "STATUS", columnDefinition = "int default 1 comment '状态,是否有效(0:无效,1:有效)'")
    private Integer status;

    /**
     * 是否隐藏(0:不隐藏,1:隐藏)
     */
    @Column(name = "HIDDEN", columnDefinition = "int default 0 comment '是否隐藏(0:不隐藏,1:隐藏)'")
    private Integer hidden;

    /**
     * 打开方式
     */
    @Column(name = "OPEN")
    private String open;

    /**
     * 上级菜单ID
     */
    @Column(name = "PARENT_ID")
    private String parentId;

    /**
     * 参数
     */
    @Column(name = "PARAMS")
    private String params;

    /**
     * 排序序号
     */
    @Column(name = "ORDER_BY", columnDefinition = "int default 999")
    private Integer order = 999;

}
