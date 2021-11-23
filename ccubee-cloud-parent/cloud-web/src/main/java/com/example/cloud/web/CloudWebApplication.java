package com.example.cloud.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 云web应用程序
 *
 * @author root
 * @date 2021/11/22
 */
@MapperScan("com.example.cloud.mapper")
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "com.example.cloud.*")
public class CloudWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudWebApplication.class, args);
        System.out.println("cloud 启动完成=====》");
    }

}
