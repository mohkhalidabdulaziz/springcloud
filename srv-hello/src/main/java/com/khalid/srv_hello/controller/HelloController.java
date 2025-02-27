package com.khalid.srv_hello.controller;

import com.khalid.srv_hello.service.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

    private final MyService myService;

    public HelloController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping(name = "/say",value = "/say")
    public String sayHello() {
        return myService.callExternalService();
    }



}
