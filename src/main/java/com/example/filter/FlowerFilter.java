package com.example.filter;

import com.alibaba.fastjson.JSONObject;
import com.example.utils.JwtUtil;
import com.example.utils.Results;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
//@WebFilter(urlPatterns = "/*")
public class FlowerFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
       HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;
        //        获取请求URL
        String requestURL = req.getRequestURL().toString();
        log.info("请求URL:{}", requestURL);
//        判断URL中是否包含login，如果包含则说明是登录请求，直接放行
        if (requestURL.contains("login")) {
            filterChain.doFilter(req, resp);
            return;
        }
//        获取请求头中的token
        String token = req.getHeader("token");
//        判断token是否为空，如果为空则说明没有登录，返回未登录信息
        if (null==token || "".equals(token)) {
            log.info("请求头中token信息为空，返回未登录信息");
            Results results = new Results(false, null, "no_login");
            String no_login = JSONObject.toJSONString(results);
            resp.getWriter().write(no_login);
            return;
        }
//        如果token不为空，则解析token，判断token是否过期
        try {
            JwtUtil.parseToken(token);
        } catch (Exception e) {
            log.info("请求头中token信息为空，返回未登录信息");
            Results results = new Results(false, null, "no_login");
            String no_login = JSONObject.toJSONString(results);
            resp.getWriter().write(no_login);
            return;
        }
//        如果token没有过期，则放行
        filterChain.doFilter(req, resp);
    }
}
