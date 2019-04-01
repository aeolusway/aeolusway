package com.aeolusway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by SIE-PC on 2019/3/20.
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServer {
    public static void main(String args[]){
        SpringApplication.run(ConfigServer.class,args);
    }
}
