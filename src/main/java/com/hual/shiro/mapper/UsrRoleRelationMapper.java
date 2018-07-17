package com.hual.shiro.mapper;

import com.hual.shiro.po.UsrRoleRelation;

import java.util.List;

public interface UsrRoleRelationMapper {
    int deleteByPrimaryKey(UsrRoleRelation key);

    int insert(UsrRoleRelation record);

    int insertSelective(UsrRoleRelation record);

    List<UsrRoleRelation> selectAllRolesByUsrId(int userId);
}