package com.ryankolbe.Question_3.OpenClosedPrinciple.ObeyPrinciple;

public class Circle implements ShapeInterface {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public double calculateCircumference() {
        return (2 * Math.PI + radius);
    }
}