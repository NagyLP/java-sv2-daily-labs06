package day02.numbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PerfectNumbersTest {

    public PerfectNumbers numbers;
    public PerfectNumbersMain numbersMain;


    @BeforeEach
    void init() {
        numbers = new PerfectNumbers();
        numbersMain = new PerfectNumbersMain();
    }

    @Test
    void testEqual() {
        int number = 6;
        int number2 = 9;
        assertEquals(true, numbers.isPerfectNumber(number));
        assertNotEquals(true, numbers.isPerfectNumber(number2));
    }

    @Test
    void testNull() {
        PerfectNumbers anotherNumbers = null;

        assertNotNull(numbers);
        assertNull(anotherNumbers);
    }

    @Test
    void testSameObjects() {
        PerfectNumbers anotherNumbers = numbers;

        assertSame(numbers, anotherNumbers);
    }

    @Test
    void testNotSameObjects() {
        PerfectNumbers anotherNumbers = new PerfectNumbers();

        assertNotSame(numbers, anotherNumbers);
    }
}
