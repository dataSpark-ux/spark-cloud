package com.spark.sys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author wy
 */
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(value = "com.spark.*")
public class SparkSysApp {
    public static void main(String[] args) {
        SpringApplication.run(SparkSysApp.class, args);
    }
}
