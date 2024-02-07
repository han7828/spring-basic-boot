package com.example.springbasicboot.mybatis.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestTodo {
    Long id;
    String content;
    boolean done;
}
