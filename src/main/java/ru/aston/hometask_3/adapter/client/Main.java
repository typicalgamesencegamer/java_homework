package ru.aston.hometask_3.adapter.client;

import ru.aston.hometask_3.adapter.api.Shape;
import ru.aston.hometask_3.adapter.impl.CircleAdapter;
import ru.aston.hometask_3.adapter.impl.RectangleAdapter;
import ru.aston.hometask_3.adapter.model.Circle;
import ru.aston.hometask_3.adapter.model.Rectangle;

public class Main {
    public static void main(String[] args) {
        Shape rect = new RectangleAdapter(new Rectangle(1.0, 3.0));
        Shape circle = new CircleAdapter(new Circle(9.45));

        System.out.println(rect.getArea());
        System.out.println(rect.getPerimeter() + "\n");
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
    }
}
