package com.chenyuan.starter.admin.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@MappedSuperclass
@DynamicInsert
@DynamicUpdate
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {

    /**
     * 主键ID
     */
    @Id
    @Column(name = "ID", nullable = true, length = 64)
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    protected String id;

    /**
     * 创建人
     */
    @Column(name = "CREATED_BY", length = 64)
    protected String createdBy;

    /**
     * 创建时间
     */
    @CreatedDate
    @Column(name = "CREATED_AT")
    protected Date createdAt;

    /**
     * 创建人
     */
    @LastModifiedBy
    @Column(name = "UPDATED_BY", length = 64)
    protected String updatedBy;

    /**
     * 更新时间
     */
    @LastModifiedDate
    @Column(name = "UPDATED_AT")
    protected Date updatedAt;

}
