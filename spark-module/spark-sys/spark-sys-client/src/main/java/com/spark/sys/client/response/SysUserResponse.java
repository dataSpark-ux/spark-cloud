package com.spark.sys.client.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author wy
 * @Description
 * @createTime 2021/08/16
 */
@Data
public class SysUserResponse implements Serializable {

    @ApiModelProperty("用户ID")
    private String id;

    @ApiModelProperty("用户名称 ")
    private String username;

}
