package com.example.springbasicboot.mybatis.todo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todos")
public class TodolistController {
    @GetMapping
    public String todolist() {
        return "/todolist/todolist";
    }
}
