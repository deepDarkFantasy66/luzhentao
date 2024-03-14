package com.example.service;

import com.example.bean.Action;

import java.util.List;

public interface IFlowerBabyService {

    int saveAction(Action action);

    int deleteAction(Integer id);

    List<Action> getActionList(Action action);
}
