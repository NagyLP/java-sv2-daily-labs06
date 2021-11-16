package day02.numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PerfectNumbersTest {

    PerfectNumbers numbers = new PerfectNumbers();

    @Test
    void testEqual() {
        PerfectNumbers numbers = new PerfectNumbers();

        boolean result = numbers.isPerfectNumber(6);
        assertTrue(numbers.isPerfectNumber(8128));
        assertTrue(numbers.isPerfectNumber(8128));
        assertFalse(numbers.isPerfectNumber(4));
        assertFalse(numbers.isPerfectNumber(4));
    }


    @Test
    void testNull() {
        PerfectNumbers anotherNumbers = null;

        assertNotNull(numbers);
        assertNull(anotherNumbers);
    }
}
