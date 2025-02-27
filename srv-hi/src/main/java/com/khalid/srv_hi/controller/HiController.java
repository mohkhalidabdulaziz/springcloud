package com.khalid.srv_hi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HiController {

    @GetMapping(name = "/say",value = "/say")
    public String sayHello() {
        return "HI, SERVICE TWO !! ";
    }
}
