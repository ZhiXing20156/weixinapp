package com.hqx.weixin.weixinapp.controller;


import com.hqx.weixin.weixinapp.entity.Login;
import com.hqx.weixin.weixinapp.mapper.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/login")
public class AddUser {


    @Autowired(required = true)
    LoginMapper loginMapper;

    @GetMapping("/getUser")
    @ResponseBody
    public List<Login> GetAllUser(){


        List<Login> list = loginMapper.getAllUser();

        return list;

    }

}
