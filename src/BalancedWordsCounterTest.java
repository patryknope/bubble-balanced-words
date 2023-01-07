import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BalancedWordsCounterTest {
    @Test
    public void testCountValidInput() {
        int result = BalancedWordsCounter.count("aabbabcccba");
        assertEquals(28, result);
    }

    @Test
    public void testCountEmptyInput() {
        int result = BalancedWordsCounter.count("");
        assertEquals(0, result);
    }

    @Test
    public void testCountInvalidInput() {
        Exception exception = assertThrows(RuntimeException.class, () -> BalancedWordsCounter.count("abababa1"));
        String expectedMessage = "Input contains illegal characters. Use a-z A-Z only.";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));

    }

    @Test
    public void testCountNullInput() {
        Exception exception = assertThrows(RuntimeException.class, () -> BalancedWordsCounter.count(null));
        String expectedMessage = "Input is null";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
}