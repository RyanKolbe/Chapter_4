package com.ryankolbe.Question_3.OpenClosedPrinciple.ObeyPrinciple;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CircumferenceCalculatorTest {
    private static Triangle triangle;

    @BeforeClass
    public static void setUp() {
        triangle = new Triangle(3, 3, 3);
    }

    @Test
    public void calculateShapeCircuference() {
        double result = triangle.calculateCircumference();
        Assert.assertEquals("Assert result is correct. ",9,result,0.1);
    }
}