package com.tmicros;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

import java.util.HashMap;
import java.util.Map;

/**
 * @author tb
 * @date 2018/12/26 13:16
 */
@SpringBootApplication
@EnableTurbine
public class ServiceTurbineApplication {
    public static void main(String[] args) {
        Map<String,Object> properties = new HashMap<>(1);
        properties.put("turbine.instanceUrlSuffix","hystrix.stream");
        new SpringApplicationBuilder(ServiceTurbineApplication.class).web(WebApplicationType.SERVLET).properties(properties).run(args);
    }
}
