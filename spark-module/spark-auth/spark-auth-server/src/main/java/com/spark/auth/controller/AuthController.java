package com.spark.auth.controller;

import com.spark.auth.client.request.LoginRequest;
import com.spark.auth.client.response.TokenResponse;
import com.spark.auth.service.IAuthService;
import com.spark.tools.model.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wy
 * @Description 认证
 * @createTime 2021/08/09
 */
@RestController
@RequestMapping("/auth")
@Api(tags = "认证")
public class AuthController {


    @Resource
    private IAuthService authService;

    @GetMapping("/login")
    @ApiOperation("登录")
    public Result login(LoginRequest loginRequest) {
        TokenResponse response = authService.sign(loginRequest);
        return Result.success(response);
    }

}
