package com.spark.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.spark.sys.client.request.QuerySysUserRequest;
import com.spark.sys.client.response.SysUserResponse;
import com.spark.sys.entity.SysUserEntity;

import java.util.List;

/**
 * @author wy
 * @Description 系统用户
 * @createTime 2021/08/16
 */
public interface ISysUserService extends IService<SysUserEntity> {
    /**
     * 列表
     * @param request
     * @return
     */
    List<SysUserResponse> list(QuerySysUserRequest request);

    /**
     * 获取用户信息
     * @param username
     * @return
     */
    SysUserResponse getUsername(String username);
}
