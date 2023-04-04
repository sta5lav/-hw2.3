package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    public final CalculatorServiceImp calculatorServiceImp;
    private CalculatorController(CalculatorServiceImp calculatorServiceImp) {
        this.calculatorServiceImp = calculatorServiceImp;
    }
    @GetMapping(path = "/calculator")
    public String hello(){
        return calculatorServiceImp.hello();
    }
    @GetMapping(path = "/calculator/plus")
    public String plus(@RequestParam("num1")  int num1, @RequestParam("num2") int num2){
        return calculatorServiceImp.plus(num1,num2);
    }
    @GetMapping(path = "/calculator/minus")
    public String minus(@RequestParam("num1")  int num1, @RequestParam("num2") int num2){
        return calculatorServiceImp.minus(num1,num2);
    }
    @GetMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam("num1")  int num1, @RequestParam("num2") int num2){
        return calculatorServiceImp.multiply(num1,num2);
    }
    @GetMapping(path = "/calculator/divide")
    public String divide(@RequestParam("num1")  int num1, @RequestParam("num2") int num2){
        return calculatorServiceImp.divide(num1,num2);

    }

}
