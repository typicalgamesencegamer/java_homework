package ru.aston.hometask_3.adapter.impl;

import ru.aston.hometask_3.adapter.model.Circle;
import ru.aston.hometask_3.adapter.api.Shape;

public class CircleAdapter implements Shape {
    private Circle circle;

    public CircleAdapter(Circle circle) {
        this.circle = circle;
    }

    @Override
    public double getArea() {
        return circle.calculateArea();
    }

    @Override
    public double getPerimeter() {
        return circle.calculatePerimeter();
    }
}
