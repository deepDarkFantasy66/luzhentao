package com.example.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.Map;

public class JwtUtil {
    private static final String signKey = "flower";
    private static final long expireTime = 1000 * 60 * 60 ;
/**
 * 生产JWT令牌
 */
    public static String createToken(Map claims) {
        String jwt =  Jwts.builder()
                .setClaims(claims)
                .setExpiration(new Date(System.currentTimeMillis() + expireTime))
                .signWith(SignatureAlgorithm.HS512, signKey)
                .compact();
        return jwt;
    }
    /**
     * 解析JWT令牌
     */
    public static Claims parseToken(String token) {
        Claims claims = Jwts.parser()
                .setSigningKey(signKey)
                .parseClaimsJws(token)
                .getBody();
        return claims;
    }
}
