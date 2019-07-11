package com.chenyuan.starter.admin.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "SYS_DICT_DETAILS")
public class SysDictDetails extends BaseEntity {

    /**
     * 字典标签
     */
    @Column(name = "LABEL")
    private String label;

    /**
     * 字典值
     */
    @Column(name = "VALUE")
    private String value;

    /**
     * 字典描述
     */
    @Column(name = "REMARK")
    private String remark;

    /**
     * 排序序号
     */
    @Column(name = "ORDER_BY")
    private Integer order = 999;

    /**
     * 字典ID
     */
    @Column(name = "dict_id")
    private String dictId;

}
