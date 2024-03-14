package com.example.service.impl;

import com.example.bean.Action;
import com.example.dao.FlowerBabyDao;
import com.example.learn.utils.SpringLogger;
import com.example.service.IFlowerBabyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class FlowerBabyService implements IFlowerBabyService{
   @Autowired
    private FlowerBabyDao flowerBabyDao;

    @Override
    public int saveAction(Action action) {
        doAction(action);
        int i = flowerBabyDao.saveAction(action);
        SpringLogger.logger.info("saveAction:"+i);
        return i;
    }

    private static void doAction(Action action) {
        StringBuilder sb = new StringBuilder();
        if (null!= action.getFeedingMethod()&& action.getFeedingMethod() == 1) {
            sb.append("母乳瓶喂").append(action.getQuantity()).append("ml");
        }else if (null!= action.getFeedingMethod()&& action.getFeedingMethod() == 2) {
            sb.append("母乳亲喂");
        }
        else if (null!= action.getFeedingMethod()&& action.getFeedingMethod() == 3) {
            sb.append("吸奶").append(action.getQuantity()).append("ml");
        }
        if(action.isDaddy()){
            sb.append("拉粑粑").append(action.getDaddyQuantity());
        }
        if (action.isMommy()) {
            sb.append("嘘嘘");
        }
        if (action.isProbiotics()) {
            sb.append("加益生菌");
        }
        if (action.isIronSupplement()) {
            sb.append("加铁剂");
        }
        if (action.isEuthyrox()){
            sb.append("喂优甲乐");
        }
        if (action.isVitaminAD()){
            sb.append("喂维生素AD");
        }
        if (action.isVitaminD3()){
            sb.append("喂维生素D3");
        }
        action.setAction(sb.toString());
    }

    @Override
    public int deleteAction(Integer id) {
        return flowerBabyDao.deleteAction(id);
    }

    @Override
    public List<Action> getActionList(Map params) {
        Integer page = Integer.valueOf(params.get("page").toString());
        Integer pageSize = Integer.valueOf(params.get("pageSize").toString());
        params.put("start",(page-1)*pageSize);
        return flowerBabyDao.getActionList(params);
    }

    @Override
    public int updateAction(Action action) {
        doAction(action);
        return flowerBabyDao.updateAction(action);
    }

    @Override
    public Integer getActionListCount(Map params) {
        return flowerBabyDao.getActionListCount(params);
    }
}
