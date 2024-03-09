package com.example.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.bean.FlowerBaby;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FlowerBabyDao extends BaseMapper<FlowerBaby> {

//        @Insert("INSERT INTO demo (name, age) VALUES (#{name}, #{age})")
        int saveFlowerBaby(FlowerBaby flowerBaby);
}
