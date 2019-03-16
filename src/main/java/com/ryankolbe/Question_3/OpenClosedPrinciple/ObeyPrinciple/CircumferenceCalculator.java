package com.ryankolbe.Question_3.OpenClosedPrinciple.ObeyPrinciple;

public class CircumferenceCalculator {
    /*
    * Depending on object passed, if the model exists with an implemented interface
    * the circumference will be calculated with having to edit the model. A new
    * model only need be created if another shape is required.
    */
    public double calculateShapeCircuference(Triangle triangle)
    {
        return triangle.calculateCircumference();
    }
}