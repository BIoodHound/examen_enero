package model;

import Interface.Shape;

public class Rectangle implements Shape {
    private final Double width;
    private final Double length;

    public Rectangle(Double width, Double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public Double getArea() {
        return 0.0;
    }
}
