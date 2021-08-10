package com.spark.auth.controller;

import com.spark.common.tools.model.Result;
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
@Api(tags = "认证aaa")
public class AuthssController {

    @GetMapping("/login11")
    @ApiOperation("登录")
    public Result login() {
        return Result.success();
    }

}
