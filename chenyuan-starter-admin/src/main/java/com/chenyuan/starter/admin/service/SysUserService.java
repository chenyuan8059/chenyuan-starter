package com.chenyuan.starter.admin.service;

import com.chenyuan.starter.admin.entity.SysUser;

import java.util.List;

public interface SysUserService {
    List<SysUser> findAll();

    SysUser findById(String id);

    void save(SysUser entity);

    void update(SysUser entity);

    void delete(List<String> ids);
}
