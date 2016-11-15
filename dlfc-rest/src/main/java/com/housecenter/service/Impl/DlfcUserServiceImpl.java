package com.housecenter.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.housecenter.dao.DlfcUserMapper;
import com.housecenter.entity.DlfcUser;
import com.housecenter.service.DlfcUserService;

@Service("dlfcUserService")
public class DlfcUserServiceImpl implements DlfcUserService {

    @Autowired
    DlfcUserMapper dlfcUserMapper;

    @Override
    public DlfcUser selectDlfcUserById(String id) {

        DlfcUser dlfcUser = dlfcUserMapper.selectByPrimaryKey(id);

        return dlfcUser;
    }
}
