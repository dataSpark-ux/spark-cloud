package com.spark.gateway.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Configuration;

import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;


import java.util.List;

/**
 * @author wy
 * @Description 认证过滤器
 * @createTime 2021/08/09
 */
@Configuration
@Slf4j
public class AuthFilter implements GlobalFilter {


    private final AntPathMatcher antPathMatcher = new AntPathMatcher();


    /**
     * 不拦截的urls
     */
    private List<String> urls;

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        ServerHttpRequest request = exchange.getRequest();
        String requestUri = request.getPath().pathWithinApplication().value();


        return chain.filter(exchange);
    }

}
