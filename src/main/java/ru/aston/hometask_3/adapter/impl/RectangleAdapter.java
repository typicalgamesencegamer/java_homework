package ru.aston.hometask_3.adapter.impl;

import ru.aston.hometask_3.adapter.model.Rectangle;
import ru.aston.hometask_3.adapter.api.Shape;

public class RectangleAdapter implements Shape {
    private Rectangle rect;

    public RectangleAdapter(Rectangle rect) {
        this.rect = rect;
    }

    @Override
    public double getArea() {
        return rect.getRectangleArea();
    }

    @Override
    public double getPerimeter() {
        return rect.getRectanglePerimeter();
    }
}
