package com.example.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.bean.Action;
import com.example.bean.FlowerBaby;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface FlowerBabyDao extends BaseMapper<FlowerBaby> {

    @Insert("INSERT INTO demo (name, age) VALUES (#{name}, #{age})")
    int saveFlowerBaby(FlowerBaby flowerBaby);

    @Insert("INSERT INTO action (time, action) VALUES (#{time}, #{action})")
    int saveAction(Action action);

    @Delete("DELETE FROM action WHERE id = #{id}")
    int deleteAction(Integer id);

    @Select("SELECT * FROM action order by create_time desc limit 30")
    List<Action> getActionList();
}
