package com.ryankolbe.Question_3.InterfaceSegregationPrinciple.ObeyPrinciple;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class GymnistTest {

    private static Gymnist gymnist;

    @BeforeClass
    public static void setUp() {
        gymnist = new Gymnist();
    }

    @Test
    public void gymnist() {
        String result = gymnist.gymnist();
        Assert.assertEquals("Performs in the Olympics",result);
    }
}