package com.example.config;

import com.example.bean.DeepSeekRequest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: luzhentao
 * @Date: 2025/02/10/10:03
 * @Description:
 */
@Service
public class DeepSeekService {
    private String apiKey = "";

    private String apiUrl = "http://122.51.133.131:11434";

    private final RestTemplate restTemplate = new RestTemplate();

    public String callDeepSeek(String userMessage) {
        // 设置请求头
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");
        headers.set("Authorization", "Bearer " + apiKey);

        // 构建请求体
        DeepSeekRequest request = new DeepSeekRequest();
        request.setModel("deepseek-chat");
        List<DeepSeekRequest.Message> messages = new ArrayList<>();
        DeepSeekRequest.Message message = new DeepSeekRequest.Message();
        message.setRole("user");
        message.setContent(userMessage);
        messages.add(message);
        request.setMessages(messages);

        // 发送请求
        HttpEntity<DeepSeekRequest> entity = new HttpEntity<>(request, headers);
        ResponseEntity<DeepSeekRequest.DeepSeekResponse> response = restTemplate.exchange(
                apiUrl, HttpMethod.POST, entity, DeepSeekRequest.DeepSeekResponse.class);

        // 解析响应
        if (response.getStatusCode().is2xxSuccessful() && response.getBody() != null) {
            return response.getBody().getChoices().get(0).getMessage().getContent();
        } else {
            throw new RuntimeException("Failed to call DeepSeek API: " + response.getStatusCode());
        }
    }
}
