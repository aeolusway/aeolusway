package com.aeolusway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by SIE-PC on 2019/3/19.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class FeignOrderApp {
    public static void main(String[] args) {
        SpringApplication.run(FeignOrderApp.class, args);
    }

}
