package com.chenyuan.starter.admin.controller;

import com.alibaba.fastjson.JSONObject;
import com.chenyuan.starter.admin.entity.SysUser;
import com.chenyuan.starter.admin.service.SysUserService;
import com.chenyuan.starter.web.dto.ResultJson;
import com.fasterxml.jackson.databind.util.JSONPObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sys/users")
public class SysUserController {

    @Autowired
    private SysUserService userService;

    @RequestMapping(value = "/info/{id}", method = RequestMethod.POST)
    public ResultJson info(@PathVariable String id) {
        return ResultJson.success(userService.findById(id));
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public ResultJson list() {
        return ResultJson.success(userService.findAll());
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResultJson save(@RequestBody SysUser user) {
        userService.save(user);
        return ResultJson.success();
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ResultJson update() {
        return null;
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public ResultJson delete(@RequestBody JSONObject ids) {

        return null;
    }

}
