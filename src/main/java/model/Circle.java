package model;

import Interface.Shape;


public class Circle implements Shape {
    private final Double PI = Math.PI;
    private final Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double getArea() {
        return 0.0;
    }
}
