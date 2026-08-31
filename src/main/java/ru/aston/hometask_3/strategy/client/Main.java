package ru.aston.hometask_3.strategy.client;

import ru.aston.hometask_3.strategy.impl.Div;
import ru.aston.hometask_3.strategy.impl.Sub;
import ru.aston.hometask_3.strategy.model.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setOperation(new Div());
        try {
            double result = calculator.calculate(10.0, -2.0);
            System.out.println(result);
            calculator.setOperation(new Sub());
            result = calculator.calculate(10.0, 90.0);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }
    }
}
