package com.tmicros.service;

import org.springframework.stereotype.Component;

/**
 * @author tb
 * @date 2018/12/25 15:08
 */
@Component
public class SchedualServiceHiHystrix implements SchedualServiceHi {


    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
