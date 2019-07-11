package com.chenyuan.starter.admin.repository;

import com.chenyuan.starter.admin.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface SysUserMapper {

    /**
     * 查询列表
     * @return
     */
    List<SysUser> findAll();

    /**
     * 根据 ID 查询
     * @param id
     * @return
     */
    SysUser findById(String id);

    /**
     * 保存数据
     * @param entity
     */
    void  save(SysUser entity);

    /**
     * 更新数据
     * @param entity
     */
    void update(SysUser entity);

    /**
     * 删除数据
     * @param ids
     */
    void delete(List<String> ids);
}
