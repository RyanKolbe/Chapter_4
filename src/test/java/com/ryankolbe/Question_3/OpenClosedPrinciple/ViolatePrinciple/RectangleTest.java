package com.ryankolbe.Question_3.OpenClosedPrinciple.ViolatePrinciple;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class RectangleTest {
    private static Rectangle rectangle;

    @BeforeClass
    public static void setUp() {
        rectangle = new Rectangle(2, 4, 6);

    }

    @Test
    public void calculateCircumference() {
        int result = rectangle.calculateCircumference(rectangle.getLength(),rectangle.getWidth());
        Assert.assertEquals("Assert result is correct. ",12,result,0.1);
    }
}