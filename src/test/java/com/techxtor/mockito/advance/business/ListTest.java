package com.techxtor.mockito.advance.business;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;

public class ListTest {

    @Test
    public void letsMockListSizeMethod() {
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(2);
        assertEquals(2, listMock.size());
    }

    @Test
    public void letsMockListSizeMethod_ReturnMultipleValues() {
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(2).thenReturn(3);
        assertEquals(2, listMock.size());
        assertEquals(3, listMock.size());
    }

    @Test
    public void letsMockListGetMethod() {
        List listMock = mock(List.class);
        when(listMock.get(0)).thenReturn("Hello Boy");
        assertEquals("Hello Boy", listMock.get(0));
        assertEquals(null, listMock.get(1));
        assertNull(listMock.get(2));
    }

    @Test
    public void letsMockListGetMethod_anyInt() {
        List listMock = mock(List.class);
        when(listMock.get(anyInt())).thenReturn("Hello Boy");
        assertEquals("Hello Boy", listMock.get(0));
        assertEquals("Hello Boy", listMock.get(1));
    }

    @Test(expected = RuntimeException.class)
    public void letsMockListGetMethod_throwsException() {
        List listMock = mock(List.class);
        when(listMock.get(anyInt())).thenThrow(new RuntimeException("Something went wrong"));
        listMock.get(0);
    }
}
