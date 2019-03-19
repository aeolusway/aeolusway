package com.aeolusway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by SIE-PC on 2019/3/19.
 */
@RestController
public class MemberController {

    @RequestMapping("/getUsername")
    public String getUsername(){

        return "control of ideology is so terrible";
    }
}
