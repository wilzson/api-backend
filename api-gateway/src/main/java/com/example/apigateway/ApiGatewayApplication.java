package com.example.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class, args);
    }

//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        // 创建路由规则的构建起
//        return builder.routes()
//                // 定义路由规则，给该规则起一个名字 "todemo"
////                .route("todemo", r -> r.path("/get")
////                        .uri("http://localhost:8101"))
//                .route("toyupiicu", r -> r.host("/test")
//                        .uri("http://localhost:8123/api/name/hello"))
//                // 创建并返回路由规则配置对象
//                .build();
//    }

}
