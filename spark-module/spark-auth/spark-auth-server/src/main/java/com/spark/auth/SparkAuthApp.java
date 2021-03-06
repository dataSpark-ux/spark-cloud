package com.spark.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author wy
 */
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(value = "com.spark.*")
@EnableFeignClients(basePackages = "com.spark.sys.client")
public class SparkAuthApp {
    public static void main(String[] args) {
        SpringApplication.run(SparkAuthApp.class, args);
    }
}
