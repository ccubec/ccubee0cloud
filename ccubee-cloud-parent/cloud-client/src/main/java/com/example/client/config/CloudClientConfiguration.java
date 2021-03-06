package com.example.client.config;


import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 云客户端配置
 *
 * @author root
 * @date 2021/11/22
 */
@Configuration
@EnableFeignClients("com.example.client")
@ComponentScan("com.example.client.impl")
public class CloudClientConfiguration {


}
