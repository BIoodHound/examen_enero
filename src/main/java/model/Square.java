package model;

import Interface.Shape;

public class Square implements Shape {

    private final Double side;

    public Square(Double side) {
        this.side = side;
    }

    @Override
    public Double getArea() {
        return Math.pow(side, 2.0);
    }
}
