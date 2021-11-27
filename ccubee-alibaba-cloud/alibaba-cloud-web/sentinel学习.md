# 整合sentinel


## 添加依赖    注解无、配置无
```pom
<!-- sentinel -->
<dependency>
    <groupId>com.alibaba.cloud</groupId>
    <artifactId>spring-cloud-starter-alibaba-sentinel</artifactId>
    <version>2021.1</version>
</dependency>
```

指定控制台地址
配置文件
```yml
spring:
  cloud:
    sentinel:
      transport:
        dashboard: localhost:8080
```

注解
`@sentinelResource`

## sentinel 控制台

查询pom sentinel版本   下载sentinel-dashboard

启动后访问请求路径 再次刷新控制台


## 流控规则
* qps限流
* 线程数限流



### 限流后自定义返回异常
