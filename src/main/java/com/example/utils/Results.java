package com.example.utils;

import lombok.Data;

@Data
public  class Results {
    public boolean success;
    public Object data;
    public String message;

    public Results(boolean success, Object data, String message) {
        this.success = success;
        this.data = data;
        this.message = message;
    }

    public Results() {
    }
}