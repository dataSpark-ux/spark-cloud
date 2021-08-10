package com.spark.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Spring Cloud Gateway 启动入口
 *
 * @author wy
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SparkGatewayApp {
    public static void main(String[] args) {
        SpringApplication.run(SparkGatewayApp.class, args);
    }
}
