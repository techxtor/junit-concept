package com.techxtor.mockito.advance.business;


import com.techxtor.mockito.advance.data.api.ToDoService;

import java.util.ArrayList;
import java.util.List;

// ToDoBusinessImpl -> Subject Under Test
// ToDoService -> Dependency [eg. external service or WIP]
public class ToDoBusinessImpl {
    // we just have service and not the implementation -> its implemetation exists somewhere in the wilds :)
    public ToDoService toDoService;

    public ToDoBusinessImpl(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    public List<String> retrieveTodosRelatedToSpring(String user) {
        List<String> filteredTodos = new ArrayList<String>();
        List<String> todos = toDoService.retrieveTodos(user);
        for (String todo : todos) {
            if (todo.contains("Spring")) filteredTodos.add(todo);
        }
        return filteredTodos;
    }
}
