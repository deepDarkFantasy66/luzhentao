package com.example.bean;

import lombok.Data;

import java.util.List;

/**
 * @Author: luzhentao
 * @Date: 2025/02/10/10:02
 * @Description:
 */
@Data
public class DeepSeekRequest {
    private String model;
    private List<Message> messages;

    @Data
    public static class Message {
        private String role;
        private String content;
    }

    @Data
    public class DeepSeekResponse {
        private List<Choice> choices;

        @Data
        public class Choice {
            private Message message;

            @Data
            public  class Message {
                private String role;
                private String content;
            }
        }
    }
}
