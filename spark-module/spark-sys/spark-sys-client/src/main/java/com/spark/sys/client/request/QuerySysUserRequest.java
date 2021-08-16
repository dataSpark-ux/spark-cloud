package com.spark.sys.client.request;

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
public class QuerySysUserRequest {

    @ApiModelProperty("用户名称")
    private String username;
}
