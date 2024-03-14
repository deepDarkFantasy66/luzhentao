package com.example.controller;

import com.example.bean.Action;
import com.example.bean.FlowerBaby;
import com.example.learn.utils.SpringLogger;
import com.example.service.IFlowerBabyService;
import com.example.utils.Pager;
import com.example.utils.Results;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

//处理请求类
@RestController
@CrossOrigin
public class FowlerBabyController {
    @Resource
    private IFlowerBabyService flowerBabyService;

    @RequestMapping("/flowerbaby")
    public String flowerbaby(@RequestBody FlowerBaby flowerBaby) {
        SpringLogger.logger.info(flowerBaby.toString());
        return flowerBaby.toString();
    }

    @RequestMapping("/flowerbaby1")
    public String flowerbaby1(@RequestBody FlowerBaby flowerBaby) {
//        flowerBabyService.saveFlowerBaby(flowerBaby);
        return flowerBaby.toString();
    }

    /**
     * 保存行为
     *
     * @param action
     * @return
     */
    @RequestMapping("/saveAction")
    public Results saveAction(@RequestBody Action action) {
        Results results = new Results();
        try {
            int i = flowerBabyService.saveAction(action);
            results.setData(i);
            results.setSuccess(true);
            results.setMessage("保存成功");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return results;

    }

    /**
     * 更新行为
     *
     * @param action
     * @return
     */
    @RequestMapping("/updateAction")
    public Results updateAction(@RequestBody Action action) {
        Results results = new Results();
        try {
            int i = flowerBabyService.updateAction(action);
            results.setData(i);
            results.setSuccess(true);
            results.setMessage("保存成功");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return results;
    }

    /**
     * 删除欣慰
     */
    @RequestMapping("/deleteAction")
    public Results deleteAction(@RequestParam("id") Integer id) {
        Results results = new Results();
        try {
            int i = flowerBabyService.deleteAction(id);
            results.setData(i);
            results.setSuccess(true);
            results.setMessage("删除成功");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return results;
    }

    /**
     * 获取行为列表
     *
     * @param params
     * @return
     */
    @RequestMapping("/getActionList")
    public Results getActionList(@RequestBody Map params) {
        Results results = new Results();
        try {
            Pager<Action> pager = new Pager<>();
            List<Action> actionList = flowerBabyService.getActionList(params);
            Integer count = flowerBabyService.getActionListCount(params);
            pager.setRows(actionList);
            pager.setTotal(count);
            results.setData(pager);
            results.setSuccess(true);
            results.setMessage("获取成功");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return results;
    }

}