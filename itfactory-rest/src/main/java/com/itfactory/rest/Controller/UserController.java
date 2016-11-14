package com.itfactory.rest.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.itfactory.rest.entity.TbUser;
import com.itfactory.rest.service.UserService;

@RestController
@RequestMapping("/tbUser")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/selectOne")
    @ResponseBody
    public TbUser selectOneById(Integer id) {

        return userService.selectByPrimaryKey(id);
    }
}
