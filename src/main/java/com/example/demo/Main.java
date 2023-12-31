package com.example.demo;

    import java.util.HashMap;
import java.util.Map;

    public class Main {
        public static void main(String[] args) throws IllegalAccessException, InstantiationException {
            Map<String, Object> map = new HashMap<>();
            map.put("username", "John");
            map.put("age", 25);
            map.put("salary", 50000.0);

            User user = BeanMapper.mapToBean(map, User.class);
            System.out.println(user.getUsername()); // 输出: John
            System.out.println(user.getAge()); // 输出: 25
            System.out.println(user.getSalary()); // 输出: 50000.0
        }
        public static void main(String str) {
            str = "welcome";
            int i = 130;
            byte b = (byte) i;
            System.out.printf("str = %s, i = %d, b = %d", str, i, b);
        }

    }
