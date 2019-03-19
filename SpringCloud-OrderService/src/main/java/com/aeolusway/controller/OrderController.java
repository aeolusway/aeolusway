package com.aeolusway.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by SIE-PC on 2019/3/19.
 */
@RestController
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping("/getMember")
    public String getMember(){
//        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://service-member/getUsername",String.class);
    }
}
