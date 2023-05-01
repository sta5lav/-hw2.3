package pro.sky.calculator;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImParametrizedTest {

    private CalculatorService calculatorServiceImParametrizedTest;

    @BeforeEach
    void setup() {
        calculatorServiceImParametrizedTest = new CalculatorServiceImp();
    }

    @ParameterizedTest
    @MethodSource("provideMethodPlusParamsForTests")
    public void testServiceMethodPlus(Integer num1, Integer num2, String resultMathOfOperation) {
        assertEquals(calculatorServiceImParametrizedTest.plus(num1, num2), resultMathOfOperation);
    }

    public static Stream<Arguments> provideMethodPlusParamsForTests() {
        return Stream.of(
                Arguments.of(-1, 2, "-1 + 2 = 1"),
                Arguments.of(-44, -44, "-44 + -44 = -88"),
                Arguments.of(0, 0, "0 + 0 = 0")
        );
    }

    @ParameterizedTest
    @MethodSource("provideMethodMinusParamsForTests")
    public void testServiceMethodMinus(Integer num1, Integer num2, String resultMathOfOperation) {
        assertEquals(calculatorServiceImParametrizedTest.minus(num1, num2), resultMathOfOperation);
    }

    public static Stream<Arguments> provideMethodMinusParamsForTests() {
        return Stream.of(
                Arguments.of(-1, 2, "-1 - 2 = -3"),
                Arguments.of(-44, -44, "-44 - (-44) = 0"),
                Arguments.of(0, 0, "0 - 0 = 0")
        );
    }

    @ParameterizedTest
    @MethodSource("provideMethodMultiplyParamsForTests")
    public void testServiceMethodMultiply(Integer num1, Integer num2, String resultMathOfOperation) {
        assertEquals(calculatorServiceImParametrizedTest.multiply(num1, num2), resultMathOfOperation);
    }

    public static Stream<Arguments> provideMethodMultiplyParamsForTests() {
        return Stream.of(
                Arguments.of(-1, 2, "-1 * 2 = -2"),
                Arguments.of(-44, -44, "-44 * (-44) = 1936"),
                Arguments.of(0, 0, "0 * 0 = 0")
        );
    }

    @ParameterizedTest
    @MethodSource("provideMethodDivideParamsForTests")
    public void testServiceMethodDivide(Integer num1, Integer num2, String resultMathOfOperation) {
        assertEquals(calculatorServiceImParametrizedTest.divide(num1, num2), resultMathOfOperation);
    }

    public static Stream<Arguments> provideMethodDivideParamsForTests() {
        return Stream.of(
                Arguments.of(-1, 2, "-1 / 2 = 0"),
                Arguments.of(-44, -44, "-44 / (-44) = 1"),
                Arguments.of(0, 5, "0 / 5 = 0")
        );
    }

}