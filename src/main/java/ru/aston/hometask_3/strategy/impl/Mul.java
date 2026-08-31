package ru.aston.hometask_3.strategy.impl;

import ru.aston.hometask_3.strategy.api.Operation;

public class Mul implements Operation {
    @Override
    public double calculate(double a, double b) {
        return a * b;
    }
}
