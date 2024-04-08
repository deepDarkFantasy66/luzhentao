package com.example.utils;

import org.springframework.core.io.InputStreamResource;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.util.StreamUtils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64ToMultipartFileConverter {

    public static MockMultipartFile base64ToMultipartFile(String base64String, String fileName) throws IOException {
        byte[] fileContentBytes = Base64.getDecoder().decode(base64String);
        try (ByteArrayInputStream inputStream = new ByteArrayInputStream(fileContentBytes)) {
            InputStreamResource resource = new InputStreamResource(inputStream);
            return new MockMultipartFile(fileName, resource.getInputStream());
        }
    }

    public static void main(String[] args) throws IOException {
        String base64String = "SGVsbG8gV29ybGQh"; // Base64 编码的字符串
        String fileName = "example.txt"; // 文件名

        MockMultipartFile file = base64ToMultipartFile(base64String, fileName);
        System.out.println("文件名: " + file.getOriginalFilename());
        System.out.println("文件大小: " + file.getSize());
        System.out.println("文件内容: " + StreamUtils.copyToString(file.getInputStream(), StandardCharsets.UTF_8));
    }
}