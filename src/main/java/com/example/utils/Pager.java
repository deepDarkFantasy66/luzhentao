package com.example.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pager<T> implements Serializable {
    private Integer limit;
    private Integer start;
    private Integer total;
    private List<T> rows;
}
