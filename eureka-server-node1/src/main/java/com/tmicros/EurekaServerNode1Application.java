package com.tmicros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *
 * host配置
 * @author tb
 * @date 2018/12/26 10:24
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerNode1Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerNode1Application.class, args);
    }
}
