package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.bean.Action;
import com.example.bean.FlowerBaby;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface FlowerBabyMapper extends BaseMapper<FlowerBaby> {


    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("INSERT INTO action(time, action, feeding,daddy, mommy, feeding_method, quantity, daddy_quantity, probiotics, iron_supplement,\n" +
            "                   euthyrox, vitamianAD, vitaminD3)\n" +
            "values (\n" +
            "           #{time}, #{action},#{feeding}, #{daddy}, #{mommy}, #{feedingMethod}, #{quantity}, #{daddyQuantity}, #{probiotics}, #{ironSupplement}, #{euthyrox}, #{vitaminAD}, #{vitaminD3}\n" +
            "       )")
    int saveAction(Action action);

    //    逻辑删除
    @Update("update action set status = 1 WHERE id = #{id}")
    int deleteAction(Integer id);

    @Select("SELECT * FROM action where status = 0 order by time desc limit #{start},#{pageSize}")
    @Results({
            @Result(property = "feedingMethod", column = "feeding_method"),
            @Result(property = "daddyQuantity", column = "daddy_quantity"),
            @Result(property = "ironSupplement", column = "iron_supplement")
    })
    List<Action> getActionList(Map params);

//    @Update("update action set time = #{time}, action = #{action}, feeding = #{feeding}, daddy = #{daddy}, mommy = #{mommy}, feeding_method = #{feedingMethod}, quantity = #{quantity}, daddy_quantity = #{daddyQuantity}, probiotics = #{probiotics}, iron_supplement = #{ironSupplement}, euthyrox = #{euthyrox}, vitamianAD = #{vitaminAD}, vitaminD3 = #{vitaminD3} WHERE id = #{id}")
    int updateAction(Action action);

    @Select("SELECT count(1) FROM action where status = 0")
    Integer getActionListCount(Map params);
}
