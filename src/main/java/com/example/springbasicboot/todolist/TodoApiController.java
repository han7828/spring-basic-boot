package com.example.springbasicboot.todolist;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;

//@RestController
//@RequestMapping("/api/todos")
public class TodoApiController {
    static HashMap<Integer, Todo> todos = new HashMap<>() ;
    static int id = 1;
    static {
//        todos.put(1, new Todo(1, "집 가기", false));
//        todos.put(2, new Todo(2, "저녁 먹기", false));
//        todos.put(3, new Todo(3, "발더스 게이트3 하기", false));
    }
    @GetMapping("")
    public ArrayList<Todo> todos() {
        return new ArrayList<>(todos.values());
    }
    @PostMapping
    public boolean add(@RequestBody Todo todo) {
        todo.setId(id);
        return todos.put(id++, todo) != null ? true : false;
    }
    @PutMapping("/{id}")
    public void done(@PathVariable int id) {
        todos.get(id).setDone();
    }
    @DeleteMapping("/{id}")
    public void todoDel(@PathVariable int id) {
        todos.remove(id);
    }
}
