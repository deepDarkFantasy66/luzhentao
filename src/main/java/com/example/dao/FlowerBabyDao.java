package com.example.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.bean.FlowerBaby;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FlowerBabyDao extends BaseMapper<FlowerBaby> {
    void saveFlowerBaby(FlowerBaby flowerBaby);
}
