package com.spark.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Spring Cloud Gateway 启动入口
 *
 * @author wy
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableAdminServer
public class SparkAdminApp {
    public static void main(String[] args) {
        SpringApplication.run(SparkAdminApp.class, args);
    }
}
