package com.housecenter.dao;

import com.housecenter.entity.DlfcUser;

public interface DlfcUserMapper {
    int deleteByPrimaryKey(String id);

    int insert(DlfcUser record);

    int insertSelective(DlfcUser record);

    DlfcUser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(DlfcUser record);

    int updateByPrimaryKey(DlfcUser record);
}