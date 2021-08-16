package com.spark.auth.client.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

/**
 * @author wy
 * @Description
 * @createTime 2021/08/16
 */
@Data
@Builder
public class TokenResponse {

    @ApiModelProperty("认证标识")
    private String accessToken;

    @ApiModelProperty("过期时间")
    private Long expireTime;
}
