import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BubbleSortTest {
    @Test
    public void testSortIntegerInput() {
        List<Comparable> input = Arrays.asList(1, 4, 5, 6, 8, 3, 8);
        List<Comparable> expected = Arrays.asList(1, 3, 4, 5, 6, 8, 8);
        List<Comparable> result = BubbleSort.sort(input);

        assertEquals(expected, result);
    }

    @Test
    public void testSortMixedInput() {
        List<Comparable> input = Arrays.asList(-9.3, 0.2, 4, 0.1, 5, 9);
        List<Comparable> expected = Arrays.asList(-9.3, 0.1, 0.2, 4, 5, 9);
        List<Comparable> result = BubbleSort.sort(input);

        assertEquals(expected, result);
    }

    @Test
    public void testSortEmptyInput() {
        List<Comparable> input = List.of();
        List<Comparable> expected = List.of();
        List<Comparable> result = BubbleSort.sort(input);

        assertEquals(expected, result);
    }

    @Test
    public void testSortContainingNullInput() {
        List<Comparable> input = Arrays.asList(null, 5.0001);
        List<Comparable> expected = List.of(5.0001);
        List<Comparable> result = BubbleSort.sort(input);

        assertEquals(expected, result);
    }

    @Test
    public void testSortNullInput() {
        Exception exception = assertThrows(RuntimeException.class, () -> BubbleSort.sort(null));
        String expectedMessage = "Input is null";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}



