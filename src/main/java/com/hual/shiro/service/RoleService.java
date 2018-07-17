package com.hual.shiro.service;

import com.hual.shiro.po.Privilege;
import com.hual.shiro.po.Role;

import java.util.List;

public interface RoleService {

    List<Role> findAllRoles();

    List<Privilege> findAllPrivilegesById(int id);
}
