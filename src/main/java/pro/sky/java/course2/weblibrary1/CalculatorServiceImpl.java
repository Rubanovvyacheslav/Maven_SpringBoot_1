package pro.sky.java.course2.weblibrary1;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculateService {

    public String calculator() {
        return "Добро пожаловать в калькулятор";
    }

    public String plus(int num1, int num2) {
        int result = num1 + num2;
        return num1 + "+" + num2 + "=" + result;
    }

    public String minus(int num1, int num2) {
        int result = num1 - num2;
        return num1 + "-" + num2 + "=" + result;
    }

    public String multiply(int num1, int num2) {
        int result = num1 * num2;
        return num1 + "*" + num2 + "=" + result;
    }

    public String divide(int num1, int num2) {
        int result = num1 / num2;
        return num1 + "/" + num2 + "=" + result;
    }

}
