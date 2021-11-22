package com.alibaba.cloud.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 阿里巴巴云web应用程序
 *
 * @author root
 * @date 2021/11/22
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaCloudWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaCloudWebApplication.class, args);
        System.out.println("alibaba cloud 启动完成=====》");
    }

}
