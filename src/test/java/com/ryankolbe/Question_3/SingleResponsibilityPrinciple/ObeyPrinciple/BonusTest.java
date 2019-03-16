package com.ryankolbe.Question_3.SingleResponsibilityPrinciple.ObeyPrinciple;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class BonusTest {
    private static Employee employee;
    private static Bonus bonus;

    @BeforeClass
    public static void setUp() {
        employee = new Employee(0001, "Ryan","Kolbe", 2015);
        bonus = new Bonus();
    }

    @Test
    public void canGetBonus() {
        boolean result = bonus.canGetBonus(employee);
        Assert.assertTrue(result);
    }
}