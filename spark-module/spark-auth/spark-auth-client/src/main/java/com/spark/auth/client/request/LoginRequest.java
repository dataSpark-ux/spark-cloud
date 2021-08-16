package com.spark.auth.client.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author wy
 * @Description 登录
 * @createTime 2021/08/16
 */
@Data
public class LoginRequest implements Serializable {

    @ApiModelProperty("用户名")
    private String username;

    @ApiModelProperty("密码")
    private String password;
}
