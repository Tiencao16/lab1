import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private final Calculator calc = new Calculator();

    @Test
    void testSumEvenNumbers_withNullArray() {
        assertEquals(0, calc.sumEvenNumbers(null));
    }

    @Test
    void testSumEvenNumbers_withEmptyArray() {
        assertEquals(0, calc.sumEvenNumbers(new int[]{}));
    }

    @Test
    void testSumEvenNumbers_withEvenNumbers() {
        int[] input = {1, 2, 3, 4, 5};
        assertEquals(6, calc.sumEvenNumbers(input)); // 2 + 4 = 6
    }

    @Test
    void testSumEvenNumbers_withNoEvenNumbers() {
        int[] input = {1, 3, 5};
        assertEquals(0, calc.sumEvenNumbers(input));
    }
}

