package com.example.service;

import com.example.bean.Action;

import java.util.List;
import java.util.Map;

public interface IFlowerBabyService {
    int saveAction(Action action);

    int deleteAction(Integer id);

    List<Action> getActionList(Map params);

    int updateAction(Action action);

    Integer getActionListCount(Map params);
}
