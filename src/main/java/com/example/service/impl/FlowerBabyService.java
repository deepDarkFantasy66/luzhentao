package com.example.service.impl;

import com.example.bean.FlowerBaby;
import com.example.dao.FlowerBabyDao;
import com.example.service.IFlowerBabyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class FlowerBabyService implements IFlowerBabyService{
@Resource
private FlowerBabyDao flowerBabyDao;
    @Override
    public void saveFlowerBaby(FlowerBaby flowerBaby) {
        flowerBabyDao.saveFlowerBaby(flowerBaby);
    }
}
