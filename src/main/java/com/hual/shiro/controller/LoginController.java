package com.hual.shiro.controller;

import com.hual.shiro.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(value={"/login"}, method = RequestMethod.GET)
    public String findAllUser(){
        return "login";
    }

    @RequestMapping(value={"/index"})
    public String index(){
        return "index";
    }

    @RequestMapping(value={"/login"}, method = RequestMethod.POST)
    public String findAllUser(Map<String,Object> map){
        try {
//            Subject subject = SecurityUtils.getSubject();
//            UsernamePasswordToken token = new UsernamePasswordToken(username, password);
//            subject.login(token);
            return "index";
        } catch (AuthenticationException e) {
            map.put("message", e.getMessage());
        }
        return "login";
    }
}
