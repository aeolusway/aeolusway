package com.aeolusway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by SIE-PC on 2019/3/19.
 */
@SpringBootApplication
@EnableEurekaClient
public class MemberServices2App {
    public static void main(String args[]){
        SpringApplication.run(MemberServices2App.class,args);
    }
}
