package com.example.demo;
import java.lang.reflect.Field;
import java.util.Map;


    public class BeanMapper {
        public static <T> T mapToBean(Map<String, Object> map, Class<T> beanClass) throws IllegalAccessException, InstantiationException {
            T bean = beanClass.newInstance();

            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String fieldName = entry.getKey();
                Object fieldValue = entry.getValue();

                Field field;
                try {
                    field = beanClass.getDeclaredField(fieldName);
                } catch (NoSuchFieldException e) {
                    continue; // 如果Map中的键在Bean中不存在对应的字段，则跳过
                }

                field.setAccessible(true);
                field.set(bean, fieldValue);
            }

            return bean;
        }


    }
