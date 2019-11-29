package com.wallace.projectservice.service;

import com.wallace.projectservice.model.Todo;

import java.util.List;

public interface TodoManagerService {
    List<Todo> getTodoList();

    Todo getTodoById(Long id);

    Todo createTodo(Todo todo);

    Todo updateTodo(Todo todo);

    void deleteTodo(Long id);
}
