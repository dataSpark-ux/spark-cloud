package com.spark.sys.controller;

import com.spark.tools.model.Result;
import com.spark.sys.client.request.QuerySysUserRequest;
import com.spark.sys.client.response.SysUserResponse;
import com.spark.sys.service.ISysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wy
 * @Description
 * @createTime 2021/08/12
 */
@RestController
@RequestMapping("/user")
@Api(tags = "系统用户")
public class SysUserController {

    @Resource
    private ISysUserService sysUserService;

    @GetMapping("/username")
    @ApiOperation("根据用户名称获取用户信息")
    public Result list(String username) {
        SysUserResponse result = sysUserService.getUsername(username);
        return Result.success(result);
    }
}
