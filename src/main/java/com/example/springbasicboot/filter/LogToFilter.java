package com.example.springbasicboot.filter;

import jakarta.servlet.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
@Slf4j
public class LogToFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.info("로그 메세지 : doFilter 호출됨");
        chain.doFilter(request, response);
    }
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("로그 메세지 : init() 호출됨");
    }
    @Override
    public void destroy() {
        log.info("로그 메세지 : destroy() 호출됨");
    }
}
