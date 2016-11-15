package com.housecenter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.housecenter.common.result.DlfcResult;
import com.housecenter.entity.DlfcUser;
import com.housecenter.service.DlfcUserService;

@RestController
@RequestMapping("/User")
public class UserController {

    @Autowired
    DlfcUserService dlfcUserService;

    @RequestMapping("/id")
    @ResponseBody
    public DlfcResult getUserResult(String id) {

        DlfcUser dlfcUser = dlfcUserService.selectDlfcUserById(id);
        if (dlfcUser != null) {
            return DlfcResult.ok(dlfcUser);
        } else {
            return DlfcResult.build(-1, "无数据");
        }

    }

    @RequestMapping(value = "/put", method = RequestMethod.PUT)
    @ResponseBody
    public DlfcResult putUser(String id) {

        if (id == null) {
            return DlfcResult.build(-2, "未接受到参数");
        } else {
            return DlfcResult.ok();
        }

    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @ResponseBody
    public DlfcResult deleteUser(String id) {

        if (id == null) {
            return DlfcResult.build(-2, "未接受到参数");
        } else {
            return DlfcResult.ok();
        }

    }
}
