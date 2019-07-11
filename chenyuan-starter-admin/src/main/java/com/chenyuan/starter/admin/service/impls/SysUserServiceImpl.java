package com.chenyuan.starter.admin.service.impls;

import com.chenyuan.starter.admin.entity.SysUser;
import com.chenyuan.starter.admin.repository.SysUserMapper;
import com.chenyuan.starter.admin.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper userDao;

    @Override
    public List<SysUser> findAll() {
        return userDao.findAll();
    }

    @Override
    public SysUser findById(String id) {
        return userDao.findById(id);
    }

    @Override
    public void save(SysUser entity) {
        userDao.save(entity);
    }

    @Override
    public void update(SysUser entity) {
        userDao.update(entity);
    }

    @Override
    public void delete(List<String> ids) {
        userDao.delete(ids);
    }
}
