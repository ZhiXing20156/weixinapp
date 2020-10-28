package com.hqx.weixin.weixinapp.vo;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.beans.JavaBean;
import java.util.Map;


@Slf4j
@JavaBean
@Component
public class MoniterVo {

    public String message;
    public String code;
    public Map<String,String> body;
}
