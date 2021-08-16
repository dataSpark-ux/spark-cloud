package com.spark.auth.service.impl;

import cn.hutool.core.util.IdUtil;
import com.spark.auth.client.request.LoginRequest;
import com.spark.auth.client.response.TokenResponse;
import com.spark.auth.service.IAuthService;
import com.spark.sys.client.feign.ISysUserClient;
import com.spark.sys.client.request.QuerySysUserRequest;
import com.spark.sys.client.response.SysUserResponse;
import com.spark.tools.model.Result;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wy
 * @Description 认证
 * @createTime 2021/08/16
 */
@Service
public class AuthServiceImpl implements IAuthService {

    @Resource
    private ISysUserClient sysUserClient;

    @Override
    public TokenResponse sign(LoginRequest loginRequest) {
        Result<SysUserResponse> result = sysUserClient.getByUsername(loginRequest.getUsername());
        return TokenResponse.builder()
                .accessToken(result.getData().getUsername()).build();
    }
}
