package com.ryankolbe.Question_3.InterfaceSegregationPrinciple.ObeyPrinciple;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CyclistTest {
    private static Cyclist cyclist;

    @BeforeClass
    public void setUp() {
        cyclist = new Cyclist();
    }

    @Test
    public void cyclist() {
        String result = cyclist.cyclist();
        Assert.assertEquals("Cycles in the Cape Argus", result);
    }
}