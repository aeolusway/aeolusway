package com.aeolusway.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by SIE-PC on 2019/3/20.
 */
@RestController
public class ConfigClientController {

    @Value("${description}")
    private String description;
    @RequestMapping("/getDesc")
    public String getDesc(){
        return description;
    }
    // 很奇怪的是，config-client-uat.properties 中并没有 username属性，
    // 而且访问这个返回的是我计算机的adminstrator的用户名
    @Value("${username}")
    private String username;
    @RequestMapping("/getUser")
    public String getUser(){
        return username;
    }

    // 读取git上的config-client-uat.properties 文件中的question属性，question是中文，存在乱码问题
    @Value("${question}")
    private String question;
    @RequestMapping("/getQue")
    public String getQue(){
        return question;
    }
}
