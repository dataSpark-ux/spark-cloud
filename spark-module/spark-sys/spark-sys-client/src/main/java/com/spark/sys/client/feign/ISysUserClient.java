package com.spark.sys.client.feign;

import com.spark.sys.client.feign.fallback.SysUserFallbackFactory;
import com.spark.sys.client.request.QuerySysUserRequest;
import com.spark.sys.client.response.SysUserResponse;
import com.spark.tools.constans.ServiceNameConstants;
import com.spark.tools.model.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wy
 * @Description
 * @createTime 2021/08/16
 */
@FeignClient(name = ServiceNameConstants.SPARK_SYS, fallbackFactory = SysUserFallbackFactory.class, decode404 = true)
public interface ISysUserClient {

    /**
     * 系统用户列表
     *
     * @param username
     * @return
     */
    @GetMapping("/user/username")
    Result<SysUserResponse> getByUsername(@RequestParam("username") String username);

    /**
     * 系统用户列表
     *
     * @param request
     * @return
     */
    @PostMapping("/create")
    Result create();
}
