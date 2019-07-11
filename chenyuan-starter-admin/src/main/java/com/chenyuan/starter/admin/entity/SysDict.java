package com.chenyuan.starter.admin.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "SYS_DICTS")
public class SysDict extends BaseEntity {

    /**
     * 名称
     */
    @Column(name = "NAME", nullable = true)
    private String name;

    /**
     * 描述
     */
    @Column(name = "REMARK")
    private String remark;

    /**
     * 排序序号
     */
    @Column(name = "ORDER_BY")
    private Integer order = 999;

}
