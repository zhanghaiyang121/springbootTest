package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface UserMapper {
    User Sel(int id);
    List<Map<String,Object>> SelAll();
    List<Map<String,Object>> SelBanji(int id);
}
