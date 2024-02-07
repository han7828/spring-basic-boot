package com.example.springbasicboot.cookie;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cookie")
public class CookieController {
    @PostMapping
    public String makeCookie(HttpServletRequest request, HttpServletResponse response) {
        Cookie cookie = new Cookie("id",request.getParameter("id"));
        cookie.setMaxAge(60); // 초 단위
        response.addCookie(cookie);
        return cookie.getValue();
    }
    @GetMapping
    public String readCookie(HttpServletRequest request, HttpServletResponse response) {
        Cookie [] cookies = request.getCookies();
        for ( Cookie cookie : cookies ) {
            if ( cookie.getName().equals("id")) return cookie.getValue();
        }
        return  null;
    }
    @GetMapping("/read")
    public String readCookie2(@CookieValue(name = "id") String id) {
        return id;
    }
//    @DeleteMapping
//    public void delCookie(HttpServletRequest request, HttpServletResponse response) {
//        Cookie [] cookies = request.getCookies();
//        for ( Cookie cookie : cookies ) {
//            if ( cookie.getName().equals("id"){
//                cookie.getMaxAge();
//            }
//        }
//    }
}

