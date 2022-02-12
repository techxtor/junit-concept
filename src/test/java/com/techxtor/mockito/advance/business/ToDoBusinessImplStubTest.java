package com.techxtor.mockito.advance.business;

import com.techxtor.mockito.advance.data.api.ToDoService;
import com.techxtor.mockito.advance.data.api.ToDoServiceStubImpl;
import org.junit.Test;
import java.util.List;

import static org.junit.Assert.*;

public class ToDoBusinessImplStubTest {

    @Test
    public void testRetrieveTodosRelatedToSpring_usingAStub() {
        ToDoService toDoService = new ToDoServiceStubImpl();

        ToDoBusinessImpl toDoBusinessImpl = new ToDoBusinessImpl(toDoService);
        List<String> filteredTodos = toDoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
        assertEquals(2, filteredTodos.size());
    }

}