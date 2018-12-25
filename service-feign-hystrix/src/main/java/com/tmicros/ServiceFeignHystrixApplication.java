package com.tmicros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author tb
 * @date 2018/12/25 15:07
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ServiceFeignHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceFeignHystrixApplication.class);
    }
}
