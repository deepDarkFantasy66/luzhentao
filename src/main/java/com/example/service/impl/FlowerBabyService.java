package com.example.service.impl;

import com.example.bean.Action;
import com.example.bean.FlowerBaby;
import com.example.dao.FlowerBabyDao;
import com.example.service.IFlowerBabyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FlowerBabyService implements IFlowerBabyService{
   @Autowired
    private FlowerBabyDao flowerBabyDao;
    @Override
    public void saveFlowerBaby(FlowerBaby flowerBaby) {
        flowerBabyDao.saveFlowerBaby(flowerBaby);
    }

    @Override
    public int saveAction(Action action) {
        return flowerBabyDao.saveAction(action);
    }

    @Override
    public int deleteAction(Integer id) {
        return flowerBabyDao.deleteAction(id);
    }

    @Override
    public List<Action> getActionList(Action action) {
        return flowerBabyDao.getActionList();
    }
}
