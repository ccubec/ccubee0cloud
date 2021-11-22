package com.example.cloud.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 云中心应用程序
 *
 * @author root
 * @date 2021/11/22
 */
@EnableEurekaServer
@SpringBootApplication
public class CloudCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudCenterApplication.class, args);
        System.out.println("注册中心启动完成=======》");
    }

}
