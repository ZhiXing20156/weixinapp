package com.hqx.weixin.weixinapp.dao;


import org.springframework.stereotype.Component;

import java.beans.JavaBean;

@JavaBean
@Component
public class Helloworld {

    public String getStr(){
        String str = new String();
        str = "xingzhi test code";
        System.out.println(str);
        return str;
    }

}
