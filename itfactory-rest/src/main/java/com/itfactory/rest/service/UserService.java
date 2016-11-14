package com.itfactory.rest.service;

import com.itfactory.rest.entity.TbUser;

public interface UserService {

    public TbUser selectByPrimaryKey(Integer id);
}
