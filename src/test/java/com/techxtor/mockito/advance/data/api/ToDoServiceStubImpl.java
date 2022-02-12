package com.techxtor.mockito.advance.data.api;

import java.util.Arrays;
import java.util.List;

public class ToDoServiceStubImpl implements ToDoService {

    public List<String> retrieveTodos(String user) {
        return Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");
    }
}