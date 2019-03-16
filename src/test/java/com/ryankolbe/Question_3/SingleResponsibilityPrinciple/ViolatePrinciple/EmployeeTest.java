package com.ryankolbe.Question_3.SingleResponsibilityPrinciple.ViolatePrinciple;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class EmployeeTest {
    private static Employee employee;

    @BeforeClass
    public static void setUp() {
        employee = new Employee(0001, "Ryan", "Kolbe", 2017);
    }

    @Test
    public void canGetBonus() {
        boolean result = employee.canGetBonus(employee.getYearJoined());
        Assert.assertFalse(result);
    }
}