package com.wallace.projectservice.controller;

import com.alibaba.fastjson.JSONObject;
import com.wallace.projectservice.model.Todo;
import com.wallace.projectservice.service.TodoManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    private TodoManagerService todoManagerService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Todo> listTodo() {
        return todoManagerService.getTodoList();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Todo getTodo(
            @PathVariable Long id
    ) {
        return todoManagerService.getTodoById(id);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Todo createTodo(
            @RequestBody String body
    ) {
        JSONObject jsonObject = JSONObject.parseObject(body);
        return todoManagerService.createTodo(json2Todo(jsonObject));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Todo updateTodo(
            @PathVariable Long id,
            @RequestBody String body
    ) {
        JSONObject jsonObject = JSONObject.parseObject(body);
        Todo todo = json2Todo(jsonObject);
        todo.setId(id);
        return todoManagerService.updateTodo(todo);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteTodo(
            @PathVariable Long id
    ) {
        todoManagerService.deleteTodo(id);
    }

    private Todo json2Todo(JSONObject json) {
        Todo todo = new Todo();
        if (json.containsKey("title")) {
            todo.setTitle(json.getString("title"));
        }
        if (json.containsKey("note")) {
            todo.setNote(json.getString("note"));
        }
        return todo;
    }
}
