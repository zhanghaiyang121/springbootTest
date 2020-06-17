package com.example.demo.mapper;

import com.example.demo.entity.Classes;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassesMapper {
    Classes Sel(int id);
}
