package ru.aston.hometask_3.strategy.model;

import ru.aston.hometask_3.strategy.api.Operation;

public class Calculator {
    private Operation operation;

    public Calculator() {
    }

    public double calculate(double a, double b) {
        return operation.calculate(a, b);
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }
}
