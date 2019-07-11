package com.chenyuan.starter.admin.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "SYS_ROLES")
public class SysRole extends BaseEntity {

    /**
     * 角色名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 角色说明
     */
    @Column(name = "REMARK")
    private String remark;

}
