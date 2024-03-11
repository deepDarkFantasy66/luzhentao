package com.example.bean;

import lombok.Data;

@Data
public class Action {
    private Integer id;
    private String time;
    private String action;
    private boolean daddy;
    private boolean mommy;
    private Integer feedingMethod;
    private String quantity;
    private String daddyQuantity;
    private boolean probiotics;
    private boolean ironSupplement;
    private boolean euthyrox;
    private boolean vitaminAD;
    private boolean vitaminD3;


    public Action(String time, String action, boolean daddy, boolean mommy, Integer feedingMethod, String quantity, String daddyQuantity) {
        this.time = time;
        this.action = action;
        this.daddy = daddy;
        this.mommy = mommy;
        this.feedingMethod = feedingMethod;
        this.quantity = quantity;
        this.daddyQuantity = daddyQuantity;
    }

    public Action() {
    }
}
