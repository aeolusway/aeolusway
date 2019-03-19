package com.aeolusway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by SIE-PC on 2019/3/19.
 */
@RestController
public class MemberServices2Controller {

    @RequestMapping("/getUsername")
    public String getUsername(){

        return "this is 8891 port service";
    }

}
