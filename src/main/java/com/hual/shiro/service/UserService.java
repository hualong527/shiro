package com.hual.shiro.service;

import com.hual.shiro.po.Role;
import com.hual.shiro.po.User;

import java.util.List;

public interface UserService {

    List<User> findAllUsers();

    User findUserByName(String name);

    List<Role> findAllRolesById(int id);
}
