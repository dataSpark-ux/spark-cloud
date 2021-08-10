package com.spark.auth.controller;

import com.spark.admin.model.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wy
 * @Description 认证
 * @createTime 2021/08/09
 */
@RestController
@RequestMapping("/auth")
@Api(tags = "认证")
public class AuthController {

    @GetMapping("/login")
    @ApiOperation("登录")
    public Result login() {
        return Result.success();
    }

}
