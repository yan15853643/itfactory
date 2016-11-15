package com.housecenter.dao;

import com.housecenter.entity.DlfcUserCompany;

public interface DlfcUserCompanyMapper {
    int deleteByPrimaryKey(String id);

    int insert(DlfcUserCompany record);

    int insertSelective(DlfcUserCompany record);

    DlfcUserCompany selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(DlfcUserCompany record);

    int updateByPrimaryKey(DlfcUserCompany record);
}