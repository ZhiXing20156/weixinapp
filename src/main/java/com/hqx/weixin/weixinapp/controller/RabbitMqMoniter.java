package com.hqx.weixin.weixinapp.controller;


import com.hqx.weixin.weixinapp.vo.MoniterVo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/moniter")
public class RabbitMqMoniter {

    @PostMapping("/rabbitmq")
    public MoniterVo checkHealth(){

            return new MoniterVo();
    }

}
