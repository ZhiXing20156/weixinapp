package com.hqx.weixin.weixinapp.controller;

import com.hqx.weixin.weixinapp.dao.Helloworld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Test {

    @Autowired
    public Helloworld helloworld;

    @GetMapping("/test")
    @ResponseBody
    public String responseStr(){
        this.helloworld.getStr();
        System.out.println("wozhixingle");
        String str = new String();
        str = "wozhixingle";
        return str;
    }


}
