package com.hual.shiro.controller.user;

import com.hual.shiro.service.UserService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserContoller {

    @Autowired
    private UserService userService;

    @RequestMapping("/all")
    @RequiresPermissions("userInfo:add")//权限管理;
    public String findAllUser(Map<String,Object> map){
        map.put("users",userService.findAllUsers());
        return "allUsers";
    }

    @RequestMapping("/add")
    @RequiresPermissions("userInfo:add")//权限管理;
    public String login(){
        return "login";
    }
}
