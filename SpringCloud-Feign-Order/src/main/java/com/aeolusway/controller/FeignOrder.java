package com.aeolusway.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by SIE-PC on 2019/3/19.
 */
@RestController
@FeignClient("service-member")
public interface FeignOrder {

    @RequestMapping("/getUsername")
    public String getFeign();
}
