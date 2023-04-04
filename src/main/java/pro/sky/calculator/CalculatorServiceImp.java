package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImp implements CalculatorService {
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }
    //*************************************************************************
    //
    //Если какой-то из двух параметров (или оба) не поданы, нужно вернуть ошибку.
    //
    //Не стал ломать голову, т.к. итак выдается ошибка без передачи хотя бы одного из параметров
    //
    //**************************************************************************
    public String plus(int num1, int num2) {
        int sum = num1 + num2;
        String num1toString = String.valueOf(num1);
        String num2toString = String.valueOf(num2);
        String num1PlusNum2 = String.valueOf(sum);
        return num1toString + " + " + num2toString + " = " + num1PlusNum2;
    }

    public String minus(int num1, int num2) {
        int minus = num1 - num2;
        String num1toString = String.valueOf(num1);
        String num2toString = String.valueOf(num2);
        String num1MinusNum2 = String.valueOf(minus);
        return num1toString + " - " + num2toString + " = " + num1MinusNum2;
    }

    public String multiply(int num1, int num2) {
        int multiply = num1 * num2;
        String num1toString = String.valueOf(num1);
        String num2toString = String.valueOf(num2);
        String num1MultiplyNum2 = String.valueOf(multiply);
        return num1toString + " * " + num2toString + " = " + num1MultiplyNum2;
    }

    public String divide(int num1, int num2) {
        int divide = num1 / num2;
        if (num2 == 0) {
            throw new ArithmeticException();
        }
        String num1toString = String.valueOf(num1);
        String num2toString = String.valueOf(num2);
        String num1DivideNum2 = String.valueOf(divide);
        return num1toString + " / " + num2toString + " = " + num1DivideNum2;
    }

}

