package com.hual.shiro.service.impl;

import com.hual.shiro.datasources.DataSourceContextHolder;
import com.hual.shiro.datasources.DataSourceType;
import com.hual.shiro.mapper.RoleMapper;
import com.hual.shiro.mapper.UserMapper;
import com.hual.shiro.mapper.UsrRoleRelationMapper;
import com.hual.shiro.po.Role;
import com.hual.shiro.po.User;
import com.hual.shiro.po.UsrRoleRelation;
import com.hual.shiro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UsrRoleRelationMapper roleRelationMapper;

    @Autowired
    RoleMapper roleMapper;


    public UserServiceImpl(){
        System.out.print("aaa");
    }

    @Override
    public List<User> findAllUsers() {
        DataSourceContextHolder.setDataSourceType(DataSourceType.ds1);
        return userMapper.selectAllUsers();
    }

    @Override
    public User findUserByName(String name) {
        User user = new User();
        user.setName(name);
        return userMapper.selectOne(user);
    }

    @Override
    public List<Role> findAllRolesById(int id){
        DataSourceContextHolder.setDataSourceType(DataSourceType.ds1);
        List<UsrRoleRelation> usrRoleRelations = roleRelationMapper.selectAllRolesByUsrId(id);
        List<Role> roles = new ArrayList<>();
        for(UsrRoleRelation usrRoleRelation:usrRoleRelations){
            roles.add(roleMapper.selectByPrimaryKey(usrRoleRelation.getRoleId()));
        }
        return roles;
    }
}
