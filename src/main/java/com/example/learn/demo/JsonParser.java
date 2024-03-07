package com.example.learn.demo;

import org.json.JSONException;
import org.json.JSONObject;

public class JsonParser {
    private UserMapper userMapper;
    private ResumeMapper resumeMapper;

    public JsonParser(UserMapper userMapper, ResumeMapper resumeMapper) {
        this.userMapper = userMapper;
        this.resumeMapper = resumeMapper;
    }

    public void parseJson(String jsonString) throws JSONException {
        JSONObject jsonObject = new JSONObject(jsonString);
        JSONObject properties = jsonObject.getJSONObject("properties");

        String name = properties.getJSONObject("name").getString("type");
        int age = properties.getJSONObject("age").getInt("type");

        // 插入User数据并获取生成的ID
        int userId = userMapper.insertUser(name, age);

        JSONObject resume = properties.getJSONObject("resume");
        JSONObject items = resume.getJSONObject("items");
        JSONObject itemProperties = items.getJSONObject("properties");

        String companyName = itemProperties.getJSONObject("companyName").getString("type");
        String startTime = itemProperties.getJSONObject("startTime").getString("type");
        String endTime = itemProperties.getJSONObject("endTime").getString("type");

        // 插入Resume数据
        resumeMapper.insertResume(userId, companyName, startTime, endTime);
    }
}
