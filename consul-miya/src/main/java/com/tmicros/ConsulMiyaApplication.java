package com.tmicros;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tb
 * @date 2018/12/26 15:07
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ConsulMiyaApplication {


    @RequestMapping("/hi")
    public String home() {
        return "hi ,i'm miya";
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(ConsulMiyaApplication.class)
                .web(WebApplicationType.SERVLET)
                .run(args);
    }
}
