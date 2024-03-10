package com.example.service;

import com.example.bean.Action;
import com.example.bean.FlowerBaby;

import java.util.List;

public interface IFlowerBabyService {
    void saveFlowerBaby(FlowerBaby flowerBaby);

    int saveAction(Action action);

    int deleteAction(Integer id);

    List<Action> getActionList(Action action);
}
