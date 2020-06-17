package com.example.demo.service;

import com.example.demo.entity.Classes;
import com.example.demo.mapper.ClassesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassesServe {
    @Autowired
    ClassesMapper classesMapper;
    public Classes Sel(int id){
        return classesMapper.Sel(id);
    }
}
