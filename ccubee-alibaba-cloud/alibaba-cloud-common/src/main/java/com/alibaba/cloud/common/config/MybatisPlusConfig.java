package com.alibaba.cloud.common.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * mybatis +配置
 *
 * @author root
 * @date 2021/11/22
 */
@Configuration
@MapperScan("com.alibaba.cloud.dao")
public class MybatisPlusConfig {
}
