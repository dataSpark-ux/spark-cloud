package com.spark.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @author wy
 * @Description
 * @createTime 2021/08/16
 */
@Data
@TableName("sys_user")
public class SysUserEntity implements Serializable {

    @TableId
    private String id;

    private String username;

    private String password;
}
