package com.hqx.weixin.weixinapp.mapper;

import com.hqx.weixin.weixinapp.entity.Login;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.beans.JavaBean;
import java.util.List;

@JavaBean
@Component
@Mapper
public interface LoginMapper {


    List<Login> getAllUser();

    Integer addUser(Login login);

    Integer updateUserById(Login login);

    Integer deleteUserById(Integer id);


}
