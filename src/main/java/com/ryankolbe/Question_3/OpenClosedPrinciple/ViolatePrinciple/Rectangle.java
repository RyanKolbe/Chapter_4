package com.ryankolbe.Question_3.OpenClosedPrinciple.ViolatePrinciple;

public class Rectangle implements CircumferenceInterface{
    private int length;
    private int width;
    private int height;

    public Rectangle(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

    /*
    * Violation as each time different object with varying circumference object is
    * created the calculateCircumference implementation will have to be edited or the
    * interface depending on the variables of the shape.
    * */
    @Override
    public int calculateCircumference(int length, int width) {
        return (2 * length) + (2 * width);
    }
}