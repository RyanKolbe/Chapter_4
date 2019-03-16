package com.ryankolbe.Question_3.SingleResponsibilityPrinciple.ObeyPrinciple;

public class Bonus {
    public boolean canGetBonus(Employee employee) {
        return employee.getYearJoined() < 2016;
    }
}
