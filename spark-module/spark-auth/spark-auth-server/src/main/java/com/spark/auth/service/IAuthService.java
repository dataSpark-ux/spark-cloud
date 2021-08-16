package com.spark.auth.service;

import com.spark.auth.client.request.LoginRequest;
import com.spark.auth.client.response.TokenResponse;

/**
 * @author wy
 * @Description 认证
 * @createTime 2021/08/16
 */
public interface IAuthService {
    /**
     * 获取签名
     * @param loginRequest
     * @return
     */
    TokenResponse sign(LoginRequest loginRequest);
}
