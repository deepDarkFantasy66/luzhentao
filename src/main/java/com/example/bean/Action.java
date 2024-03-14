package com.example.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
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



}
