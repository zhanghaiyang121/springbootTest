package com.example.demo.controller;

import com.example.demo.entity.Classes;
import com.example.demo.entity.User;
import com.example.demo.service.ClassesServe;
import com.example.demo.service.UserServe;
import com.example.demo.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private UserServe userService;
    @Autowired
    private ClassesServe classesServe;


    @RequestMapping("getUser/{id}")
    public User GetUser(@PathVariable int id){
        System.out.println(userService);
        return userService.Sel(id);
    }

    @RequestMapping("getUsers")
    public List<Map<String,Object>> GetUsers(){
        return userService.SelAll();
    }


    @RequestMapping("getclasses/{id}")
    public Classes GetClasses(@PathVariable int id){
        System.out.println(classesServe);
        return classesServe.Sel(id);
    }

    //查询年级信息和对应年级所有班级的信息
    @RequestMapping("getBanji/{id}")
    public Result getBanji(@PathVariable int id){
        System.out.println(userService);
        return userService.SelBanji(id);
    }
}
