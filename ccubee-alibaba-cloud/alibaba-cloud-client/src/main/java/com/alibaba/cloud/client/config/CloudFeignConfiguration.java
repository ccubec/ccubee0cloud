package com.alibaba.cloud.client.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 云假装配置
 *
 * @author root
 * @date 2021/11/22
 */
@Configuration
@EnableFeignClients(basePackages = "com.alibaba.cloud.client")
@ComponentScan("com.alibaba.cloud.client.impl")
@EnableAutoConfiguration
public class CloudFeignConfiguration {
}
