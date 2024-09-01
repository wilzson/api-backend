package com.example.apiclientsdk;

import com.example.apiclientsdk.client.ApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// 通过 @Configuration 注解，将该类标记为一个配置类，告诉 Spring 这是一个用于配置的类
// 能够读取 application.yml 的配置，读取到配置之后，把这个读到的配置设置到我们这里的属性中
@Configuration
@ConfigurationProperties("client.sdk")
@Data
// @ComponentScan 注解用于自动扫描组件，使得 Spring 能够自动注册相应的 Bean
@ComponentScan
public class ApiClientConfig {

    private String accessKey; // 相当于账号

    private String secretKey; // 相当于密码

    // 创建一个名为 “ApiClient” 的Bean
    @Bean
    public ApiClient apiClient() {
        // 使用ak 和 sk 创建一个ApiClient实例
        return new ApiClient(accessKey, secretKey);
    }
}
