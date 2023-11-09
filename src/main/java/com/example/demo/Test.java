package com.example.demo;


import org.json.JSONException;

public class Test {
        public static void main(String[] args) throws JSONException {
            UserMapper userMapper = new UserMapper();
            ResumeMapper resumeMapper = new ResumeMapper();
            JsonParser parser = new JsonParser(userMapper, resumeMapper);

            String jsonString = "";

            parser.parseJson(jsonString);
    }
}
