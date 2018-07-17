package com.hual.shiro.service.impl;

import com.hual.shiro.datasources.DataSourceContextHolder;
import com.hual.shiro.datasources.DataSourceType;
import com.hual.shiro.mapper.*;
import com.hual.shiro.po.*;
import com.hual.shiro.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "roleService")
public class RoleServiceImpl implements RoleService {

    @Autowired
    PrivilegeMapper privilegeMapper;

    @Autowired
    RolePrgRelationMapper rolePrgRelationMapper;

    @Override
    public List<Role> findAllRoles() {
        return null;
    }

    @Override
    public List<Privilege> findAllPrivilegesById(int id){
        DataSourceContextHolder.setDataSourceType(DataSourceType.ds1);
        List<RolePrgRelation> rolePrgRelations = rolePrgRelationMapper.selectAllPrgByRoleId(id);
        List<Privilege> privileges = new ArrayList<>();
        for(RolePrgRelation rolePrgRelation:rolePrgRelations){
            privileges.add(privilegeMapper.selectByPrimaryKey(rolePrgRelation.getPrgId()));
        }
        return privileges;
    }
}
