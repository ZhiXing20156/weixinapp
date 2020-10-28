package com.hqx.weixin.weixinapp.service;

import com.hqx.weixin.weixinapp.vo.MoniterVo;
import org.apache.http.client.methods.HttpPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.beans.JavaBean;
import java.io.IOException;

@Component
@JavaBean
public class CheckMq extends HttpServlet {

    @Autowired
    MoniterVo moniterVo;

    public MoniterVo checkMqHealthOnce(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpPost httpPost = new HttpPost("127.0.0.1:80");
        return moniterVo;
    }
}
