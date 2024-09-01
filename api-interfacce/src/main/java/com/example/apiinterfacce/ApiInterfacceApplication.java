package com.example.apiinterfacce;

import com.example.apiclientsdk.ApiClientConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ApiClientConfig.class)
public class ApiInterfacceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiInterfacceApplication.class, args);
    }

}
