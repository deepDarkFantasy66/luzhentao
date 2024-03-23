package com.example;

import com.example.utils.JwtUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
@Slf4j
public class JwtTest {
    /**
     * 生成token
     */
    @Test
    public void testCreateToken() {
        Map<String, Object> claims = new HashMap<>();
        claims.put("username", "玛卡巴卡");
        claims.put("password", "123456");
        log.info("token:{}", JwtUtil.createToken(claims));
    }

    /**
     * 解析token
     */
    @Test
    public void testParseToken() {
        String token = "eyJhbGciOiJIUzUxMiJ9.eyJwYXNzd29yZCI6IjEyMzQ1NiIsImV4cCI6MTcxMDgxNDA1NSwidXNlcm5hbWUiOiLnjpvljaHlt7TljaEifQ.DJxjpj_-Uga9tfR9vcS7ZkttsrRKOZMcTr9L6PCvm9yoBL6BDxG39EQ5AAWk1qTkpU8H9Sk_qehW3xQEr2EriA";
//        log.info("claims:{}", JwtUtil.parseToken(token));
    }
}
