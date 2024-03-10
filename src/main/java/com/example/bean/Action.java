package com.example.bean;

import lombok.Data;

import java.sql.Date;
@Data
public class Action {
    private Integer id;
    private Date time;
    private String action;

    public Action(Date time, String action) {
        this.time = time;
        this.action = action;
    }

    public Action() {
    }
}
