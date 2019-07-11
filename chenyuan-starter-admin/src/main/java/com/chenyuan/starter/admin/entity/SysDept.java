package com.chenyuan.starter.admin.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "SYS_DEPTS")
public class SysDept extends BaseEntity {

    /**
     * 单位代码
     */
    @Column(name = "CODE")
    private String code;

    /**
     * 单位名称
     */
    @Column(name = "NAME", nullable = true)
    private String name;

    /**
     * 单位描述
     */
    @Column(name = "REMARK")
    private String remark;

    /**
     * 单位排序
     */
    @Column(name = "ORDER_BY")
    private Integer order = 999;

    /**
     * 上级单位ID
     */
    @Column(name = "PARENT_ID")
    private String parentId;

}
