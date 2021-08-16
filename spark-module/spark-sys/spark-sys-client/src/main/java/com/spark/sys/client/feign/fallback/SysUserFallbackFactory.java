package com.spark.sys.client.feign.fallback;

import com.spark.sys.client.feign.ISysUserClient;
import com.spark.sys.client.request.QuerySysUserRequest;
import com.spark.sys.client.response.SysUserResponse;
import com.spark.tools.model.Result;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author wy
 * @Description 系统用户服务降级
 * @createTime 2021/08/16
 */
@Slf4j
@Component
public class SysUserFallbackFactory implements FallbackFactory<ISysUserClient> {


    @Override
    public ISysUserClient create(Throwable throwable) {
        return new ISysUserClient() {
            @Override
            public Result<SysUserResponse> getByUsername(String username) {
                log.error("参数==>{}, 原因==={}", username, throwable.getMessage());
                return Result.failed("系统用户服务降级");
            }

            @Override
            public Result create() {
                return null;
            }
        };
    }
}
