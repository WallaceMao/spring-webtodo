package com.wallace.projectservice.service.impl;

import com.wallace.projectservice.mapper.TodoMapper;
import com.wallace.projectservice.model.Todo;
import com.wallace.projectservice.service.TodoManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoManagerServiceImpl implements TodoManagerService {
    @Autowired
    private TodoMapper todoMapper;

    @Override
    public List<Todo> getTodoList() {
        return todoMapper.getAll();
    }

    @Override
    public Todo getTodoById(Long id) {
        return todoMapper.getOne(id);
    }

    @Override
    public Todo createTodo(Todo todo) {
        todoMapper.insert(todo);
        return getTodoById(todo.getId());
    }

    @Override
    public Todo updateTodo(Todo todo) {
        todoMapper.update(todo);
        return getTodoById(todo.getId());
    }

    @Override
    public void deleteTodo(Long id) {
        todoMapper.delete(id);
    }
}
