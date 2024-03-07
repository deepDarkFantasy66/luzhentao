package com.example.controller;

import com.example.learn.HashSet.utils.SpringLogger;
import com.example.bean.FlowerBaby;
import com.example.service.IFlowerBabyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

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
        flowerBabyService.saveFlowerBaby(flowerBaby);
        return flowerBaby.toString();
    }

}
