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
    public int del(int id){
        return userMapper.del(id);
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

<<<<<<< HEAD
    public void insertUser(String name, String sex, String age, String userName, String passWord, String realName, int id){
        System.out.println(name);
        System.out.println(sex);
        System.out.println(age);
        System.out.println(userName);
        System.out.println(passWord);
        System.out.println(realName);
        System.out.println(id);
        int uid=3;

        System.out.println(userMapper.insertUser(uid,name,sex,age,userName,passWord,realName,id));
    }

    public void update(int uid, String name,String sex, String age){
        System.out.println(userMapper.update(uid,name,sex,age));
    }
=======
>>>>>>> 3d3d4f1343e32e416c0f7e751df898d29b8e416c
}
