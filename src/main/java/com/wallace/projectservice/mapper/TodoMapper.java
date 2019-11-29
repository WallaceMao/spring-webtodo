package com.wallace.projectservice.mapper;

import com.wallace.projectservice.model.Todo;

import java.util.List;

public interface TodoMapper {
    List<Todo> getAll();

    Todo getOne(Long id);

    void insert(Todo todo);

    void update(Todo todo);

    void delete(Long id);
}
