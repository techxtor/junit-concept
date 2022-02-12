import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class GraderTest {
    @Test
    void fiftyNineShouldReturnF() {
        Grader g = new Grader();
        assertEquals('F', g.determineGrade(59));
    }

    @Test
    void sixtyNineShouldReturnD() {
        Grader g = new Grader();
        assertEquals('D', g.determineGrade(69));
    }

    @Test
    void seventyNineShouldReturnC() {
        Grader g = new Grader();
        assertEquals('C', g.determineGrade(79));
    }

    @Test
    void eightyNineShouldReturnB() {
        Grader g = new Grader();
        assertEquals('B', g.determineGrade(89));
    }

    @Test
    void ninetyNineShouldReturnA() {
        Grader g = new Grader();
        assertEquals('A', g.determineGrade(99));
    }

    @Test
    void negativeOneReturnIllegalArgumentException() {
        Grader g = new Grader();
//        assertEquals('A', g.determineGrade(-1));
        assertThrows(IllegalArgumentException.class,
                () -> {
                    g.determineGrade(-1);
                });
    }

    //  edge cases
    @Test
    void eightyShouldReturnB() {
        Grader g = new Grader();
        assertEquals('B', g.determineGrade(80));
    }

    @Test
    void seventyShouldReturnC() {
        Grader g = new Grader();
        assertEquals('C', g.determineGrade(70));
    }

}