import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void twoPlusThreeIsFive() {
        SimpleCalculator calc = new SimpleCalculator();
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    void threePlusSevenIsTen() {
        SimpleCalculator calc = new SimpleCalculator();
        assertEquals(10, calc.add(3, 7));
    }
}