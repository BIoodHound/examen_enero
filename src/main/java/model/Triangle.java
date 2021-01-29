package model;

import Interface.Shape;

public class Triangle implements Shape {

    private final Double base;
    private final Double height;

    public Triangle(Double base, Double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public Double getArea() {
        return 0.0;
    }
}
