package com.hual.shiro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Controller
public class HelloWorld {

    @RequestMapping("/hello")
    public String Hello(Map<String,Object> map){
        map.put("hello","hello freemarker");
        return "hello";
    }
}
