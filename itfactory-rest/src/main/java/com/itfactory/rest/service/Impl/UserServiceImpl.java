package com.itfactory.rest.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itfactory.rest.dao.TbUserMapper;
import com.itfactory.rest.entity.TbUser;
import com.itfactory.rest.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private TbUserMapper tbUserMapper;

    @Override
    public TbUser selectByPrimaryKey(Integer id) {

        return tbUserMapper.selectByPrimaryKey(id);
    }

}
