package com.example.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.bean.Action;
import com.example.bean.FlowerBaby;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface FlowerBabyDao extends BaseMapper<FlowerBaby> {



    @Insert("INSERT INTO action (time, action) VALUES (#{time}, #{action})")
    int saveAction(Action action);

//    逻辑删除
    @Update("update action set status = 1 WHERE id = #{id}")
    int deleteAction(Integer id);

    @Select("SELECT * FROM action where status = 0 order by create_time desc limit 100")
    List<Action> getActionList();
}
