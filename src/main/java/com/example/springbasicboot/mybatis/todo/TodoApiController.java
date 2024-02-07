package com.example.springbasicboot.mybatis.todo;

import com.example.springbasicboot.mybatis.dto.RequestTodo;
import com.example.springbasicboot.mybatis.dto.ResponseTodo;
import com.example.springbasicboot.mybatis.mappers.TodoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/todos")
public class TodoApiController {

    @Autowired
    TodoMapper todoMapper;

    @GetMapping("")
    public ArrayList<ResponseTodo> todos() {
        return (ArrayList<ResponseTodo>) todoMapper.findAll();
    }
    @PostMapping
    public boolean add(@RequestBody RequestTodo todo) {
        todoMapper.save(todo);
        return todo.getContent() != null ? true : false;
    }
    @PutMapping("/{id}")
    public void done(@PathVariable Long id) {
        todoMapper.update(id);
    }
    @DeleteMapping("/{id}")
    public void todoDel(@PathVariable Long id) {
        todoMapper.deleteById(id);
    }
}
