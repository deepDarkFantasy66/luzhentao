package com.example.controller;

import com.example.config.DeepSeekService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: luzhentao
 * @Date: 2025/02/10/10:11
 * @Description:
 */
@RestController
@RequestMapping("/api/deepseek")
public class DeepSeekController {
    @Autowired
    private DeepSeekService deepSeekService;

    @GetMapping("/chat")
    public String chat(@RequestParam(required = false) String message) {
        return deepSeekService.callDeepSeek(message);
    }
}
