package com.aeolusway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by SIE-PC on 2019/3/18.
 */
@SpringBootApplication
@EnableEurekaServer

public class AeolusApp {
    public static void main(String args[]){
        SpringApplication.run(AeolusApp.class,args);
    }
}
