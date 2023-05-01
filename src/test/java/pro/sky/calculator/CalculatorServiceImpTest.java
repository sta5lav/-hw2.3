package pro.sky.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImpTest {

    private CalculatorService calculatorService;

    @BeforeEach
    void setup() {
        calculatorService = new CalculatorServiceImp();
    }

    @Test
    public void testReturnHelloMessage() {
        assertEquals("Добро пожаловать в калькулятор", calculatorService.hello());
    }

    @Test
    public void plusTest() {
        assertEquals("5 + 4 = 9",calculatorService.plus(5,4));
        assertThrows(IllegalArgumentException.class, () -> calculatorService.plus(null, null));

    }

    @Test
    public void minusTest() {
        assertEquals("5 - 4 = 1",calculatorService.minus(5,4));
        assertThrows(IllegalArgumentException.class, () -> calculatorService.minus(2, null));
    }

    @Test
    public void multiplyTest() {
        assertEquals("5 * 4 = 20",calculatorService.multiply(5,4));
        assertThrows(IllegalArgumentException.class, () -> calculatorService.multiply(null, 3));
    }

    @Test
    public void divideTest() {
        assertEquals("5 / 4 = 1",calculatorService.divide(5,4));
        assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(null, 5));
        assertThrows(IllegalArgumentException.class,
                () -> calculatorService.divide(5, 0));

    }
}
