package com.techxtor.mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


class CalculatorTest {
    Calculator c = null;
/*
    CalculatorService calcService = new CalculatorService() {
        @Override
        public int add(int a, int b) {
            return 0;
        }
    };
    */

    CalculatorService calcService = mock(CalculatorService.class);


    @BeforeEach
    void setup() {
        c = new Calculator(calcService);
    }

    @Test
    public void testPerformServiceAdd() {
        when(calcService.add(2, 3)).thenReturn(5);
        assertEquals(10, c.performServiceAdd(2, 3));
        verify(calcService).add(2, 3);
    }

}

/*
    when(calcService.add(2,3)).thenReturn(5);
    When " <CalculatorService's object>.add(<params>) " is encountered OR
    say, When " <CalculatorService's object>.add(<params>) " is called,
    it will return 5;
*/
