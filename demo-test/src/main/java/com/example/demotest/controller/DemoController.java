package com.example.demotest.controller;

import com.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class DemoController {
    @Autowired
    private DemoService demoService;
    @GetMapping("/hello")
    public String test(){
        String msg = demoService.getDemoMsg();
        return msg;
    }
}
