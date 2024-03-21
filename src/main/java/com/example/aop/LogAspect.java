package com.example.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.Arrays;

@Slf4j
@Aspect//切面类
@Component
public class LogAspect {

    @Autowired
    private HttpServletRequest request;

    @Around("@annotation(com.example.anno.Log)")
//    @Around("execution(* com.example.controller.*.*(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
//        记录操作人ID，从JWT中获取,解析token
//        String jwt = request.getHeader("token");
//        Claims claims = JwtUtil.parseToken(jwt);
//        claims.get("userId");
//        操作时间
        LocalDateTime now = LocalDateTime.now();
//        操作类名
        String className = joinPoint.getTarget().getClass().getName();
//        操作方法名
        String methodName = joinPoint.getSignature().getName();
//        操作参数
        Object[] args = joinPoint.getArgs();
        String methodParams = Arrays.toString(args);
//        记录操作前时间
        long l1 = System.currentTimeMillis();
        Object result = joinPoint.proceed();
//        记录操作后时间
        long l2 = System.currentTimeMillis();
//        操作耗时
        long time = l2 - l1;
        log.info("操作人ID：{}，操作时间：{}，操作类名：{}，操作方法名：{}，操作参数：{}，操作耗时：{}", "akp", now, className, methodName, methodParams, time);
        return result;
    }
}
