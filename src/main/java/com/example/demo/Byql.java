package com.example.demo;


import lombok.Data;

import java.util.List;
@Data
public class Byql {
     private String sblx;
     private double zcjz;
     private int nf;
     private int id;
     private  List<Byql> byql;

    public Byql() {
    }

    public Byql(String sblx, double zcjz, int nf, List<Byql> byql) {
        this.sblx = sblx;
        this.zcjz = zcjz;
        this.nf = nf;
        this.byql = byql;
    }

}
