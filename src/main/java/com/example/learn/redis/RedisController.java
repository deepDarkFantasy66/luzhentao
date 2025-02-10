package com.example.learn.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {
    @Autowired
    private RedisService redisService;

    @GetMapping("/set")
    public void setRedisValue() {
        redisService.setValue("myKey", "Hello Redis!");
    }

    @GetMapping("/get")
    public String getRedisValue() {
        return redisService.getValue("myKey");
    }
}