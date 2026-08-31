package ru.aston.hometask_3.strategy.impl;

import ru.aston.hometask_3.strategy.api.Operation;

public class Div implements Operation {
    @Override
    public double calculate(double a, double b) {
        if (b != 0) {
            return a / b;
        }
        throw new ArithmeticException("Division by zero");
    }
}
