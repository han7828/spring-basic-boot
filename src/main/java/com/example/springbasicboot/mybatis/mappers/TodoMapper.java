package com.example.springbasicboot.mybatis.mappers;

import com.example.springbasicboot.mybatis.dto.RequestTodo;
import com.example.springbasicboot.mybatis.dto.ResponseTodo;
import com.example.springbasicboot.mybatis.todo.Todo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TodoMapper {
    List<ResponseTodo> findAll();
    Todo findById(Long id);
    void save(RequestTodo todo);
    void update(Long id);
    void deleteById(Long id);
}

