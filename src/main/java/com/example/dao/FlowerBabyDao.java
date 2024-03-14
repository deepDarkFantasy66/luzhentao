package com.example.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.bean.Action;
import com.example.bean.FlowerBaby;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface FlowerBabyDao extends BaseMapper<FlowerBaby> {


    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("INSERT INTO action(time, action, daddy, mommy, feedding_method, quantity, daddy_quantity, probiotics, iron_supplement,\n" +
            "                   euthyrox, vitamianAD, vitaminD3)\n" +
            "values (\n" +
            "           #{time}, #{action}, #{daddy}, #{mommy}, #{feedingMethod}, #{quantity}, #{daddyQuantity}, #{probiotics}, #{ironSupplement}, #{euthyrox}, #{vitaminAD}, #{vitaminD3}\n" +
            "       )")
    int saveAction(Action action);

//    逻辑删除
    @Update("update action set status = 1 WHERE id = #{id}")
    int deleteAction(Integer id);

    @Select("SELECT * FROM action where status = 0 order by time desc limit 100")
    List<Action> getActionList();
}
