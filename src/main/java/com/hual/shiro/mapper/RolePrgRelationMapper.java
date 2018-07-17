package com.hual.shiro.mapper;

import com.hual.shiro.po.RolePrgRelation;

import java.util.List;

public interface RolePrgRelationMapper {
    int deleteByPrimaryKey(RolePrgRelation key);

    int insert(RolePrgRelation record);

    int insertSelective(RolePrgRelation record);

    List<RolePrgRelation> selectAllPrgByRoleId(int roleId);
}