package ru.aston.hometask_3.strategy.operations;

import ru.aston.hometask_3.strategy.Operation;

public class Sum implements Operation {
    @Override
    public double calculate(double a, double b) {
        return a + b;
    }
}
