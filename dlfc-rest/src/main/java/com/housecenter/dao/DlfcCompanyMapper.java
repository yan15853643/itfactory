package com.housecenter.dao;

import com.housecenter.entity.DlfcCompany;

public interface DlfcCompanyMapper {
    int deleteByPrimaryKey(String id);

    int insert(DlfcCompany record);

    int insertSelective(DlfcCompany record);

    DlfcCompany selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(DlfcCompany record);

    int updateByPrimaryKey(DlfcCompany record);
}