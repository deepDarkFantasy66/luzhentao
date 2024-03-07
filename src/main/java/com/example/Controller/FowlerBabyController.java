package com.example.Controller;

import com.example.Learn.HashSet.utils.SpringLogger;
import com.example.bean.FlowerBaby;
import org.springframework.web.bind.annotation.*;

//处理请求类
@RestController
@CrossOrigin
public class FowlerBabyController {
    @RequestMapping("/flowerbaby")
    public String flowerbaby(@RequestBody FlowerBaby flowerBaby) {
        SpringLogger.logger.info(flowerBaby.toString());
        return flowerBaby.toString();
    }

}
