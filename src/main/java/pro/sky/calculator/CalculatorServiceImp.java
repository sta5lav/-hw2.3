package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImp implements CalculatorService {

    @Override
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String plus(Integer num1, Integer num2) {
        validateRequestParams(num1, num2);
        int sum = num1 + num2;
        return printResult(num1, num2, sum, "+");
    }

    @Override
    public String minus(Integer num1, Integer num2) {
        validateRequestParams(num1, num2);
        int minus = num1 - num2;
        return printResult(num1, num2, minus, "-");
    }

    @Override
    public String multiply(Integer num1, Integer num2) {
        validateRequestParams(num1, num2);
        int multiply = num1 * num2;
        return printResult(num1, num2, multiply, "*");
    }

    @Override
    public String divide(Integer num1, Integer num2) {
        validateRequestParams(num1, num2);
        if (num2 == 0) {
            throw new IllegalArgumentException("Деление на ноль запрещено!");
        }
        int divide = num1 / num2;
        return printResult(num1, num2, divide, "/");
    }

    String printResult(Integer num1, Integer num2, int result, String mathOperation) {
        String num1toString = String.valueOf(num1);
        String num2toString = String.valueOf(num2);
        String resultOfOperation = String.valueOf(result);
        if (num2 < 0) {
            num2toString = "(" + num2toString + ")";
        }
        return num1toString + " " + mathOperation + " " + num2toString + " = " + resultOfOperation;
    }

    void validateRequestParams(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Один(или оба) из параметров не считался!");
        }
    }
}

