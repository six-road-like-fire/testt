package com.hikvision.wl.demo.controller;
/**
 it is just a test
 * */
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String say(){
        return "xhqwxhn";
    }
}
