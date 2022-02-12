package com.techxtor.mockito.advance.business;


import com.techxtor.mockito.advance.data.api.ToDoService;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ToDoBusinessImplMockTest {

    @Test
    public void testRetrieveTodosRelatedToSpring_usingMockito_shouldReturnListOfSizeTwo() {
        ToDoService mockToDoService = mock(ToDoService.class);
        List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");
        when(mockToDoService.retrieveTodos("Dummy")).thenReturn(todos);

        ToDoBusinessImpl toDoBusinessImpl = new ToDoBusinessImpl(mockToDoService);
        List<String> filteredTodos = toDoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
        assertEquals(2, filteredTodos.size());
    }

    @Test
    public void testRetrieveTodosRelatedToSpring_usingMockito_shouldReturnEmptyList() {
        ToDoService mockToDoService = mock(ToDoService.class);
        List<String> todos = Arrays.asList();
        when(mockToDoService.retrieveTodos("Dummy")).thenReturn(todos);

        ToDoBusinessImpl toDoBusinessImpl = new ToDoBusinessImpl(mockToDoService);
        List<String> filteredTodos = toDoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
        assertEquals(0, filteredTodos.size());
    }
}