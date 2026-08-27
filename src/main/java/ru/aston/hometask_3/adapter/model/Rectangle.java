package ru.aston.hometask_3.adapter.model;

public class Rectangle {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getRectangleArea() {
        return a * b;
    }
    public double getRectanglePerimeter() {
        return 2 * (a + b);
    }
}
