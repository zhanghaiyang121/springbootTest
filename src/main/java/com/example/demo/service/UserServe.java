package com.example.demo.service;

import com.example.demo.entity.Nianj;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServe  {
    @Autowired
    UserMapper userMapper;

    public User Sel(int id){
        return userMapper.Sel(id);
    }

    public List<Map<String,Object>> SelAll(){
        return userMapper.SelAll();
    }

    public Result SelBanji(int id){
        User user=userMapper.Sel(id);
        List<Map<String,Object>> list=userMapper.SelBanji(user.getId());
        Result res=new Result();
        res.user=user;
        res.list=list;
        return res;
    }

}
