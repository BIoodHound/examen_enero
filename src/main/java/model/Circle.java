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
        Double radius_squared =  Math.pow(radius, 2.0);
        return PI * radius_squared;
    }
}
