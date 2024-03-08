package com.example.service.impl;

import com.example.bean.FlowerBaby;
import com.example.dao.FlowerBabyDao;
import com.example.service.IFlowerBabyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FlowerBabyService implements IFlowerBabyService{
   @Autowired
    private FlowerBabyDao flowerBabyDao;
    @Override
    public void saveFlowerBaby(FlowerBaby flowerBaby) {
        flowerBabyDao.saveFlowerBaby(flowerBaby);
    }
}
