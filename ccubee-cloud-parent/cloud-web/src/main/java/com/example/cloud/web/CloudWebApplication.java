package com.example.cloud.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * 云web应用程序
 *
 * @author root
 * @date 2021/11/22
 */
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "com.example.cloud.*")
public class CloudWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudWebApplication.class, args);
        System.out.println("cloud 启动完成=====》");
    }

}
