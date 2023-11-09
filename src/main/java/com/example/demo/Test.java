package com.example.demo;

import org.json.JSONException;

public class Test {
        public static void main(String[] args) throws JSONException {
            UserMapper userMapper = new UserMapper();
            ResumeMapper resumeMapper = new ResumeMapper();
            JsonParser parser = new JsonParser(userMapper, resumeMapper);

            String jsonString = "{\n" +
                    "  \"type\": \"object\",\n" +
                    "  \"properties\": {\n" +
                    "    \"name\": {\n" +
                    "      \"type\": \"John Doe\"\n" +
                    "    },\n" +
                    "    \"age\": {\n" +
                    "      \"type\": 30,\n" +
                    "      \"minimum\": 1,\n" +
                    "      \"maximum\": 150\n" +
                    "    },\n" +
                    "    \"resume\": {\n" +
                    "      \"type\": \"array\",\n" +
                    "      \"items\": {\n" +
                    "        \"type\": \"object\",\n" +
                    "        \"properties\": {\n" +
                    "          \"companyName\": {\n" +
                    "            \"type\": \"Company A\"\n" +
                    "          },\n" +
                    "          \"startTime\": {\n" +
                    "            \"type\": \"2020-01-01\"\n" +
                    "          },\n" +
                    "          \"endTime\": {\n" +
                    "            \"type\": \"2022-01-01\"\n" +
                    "          }\n" +
                    "        }\n" +
                    "      }\n" +
                    "    }\n" +
                    "  }\n" +
                    "}";

            parser.parseJson(jsonString);
    }
}
