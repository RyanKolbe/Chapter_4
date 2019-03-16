package com.ryankolbe.Question_3.DependencyInversionPrinciple.ObeyPrinciple;

public class SoftServeImplementation implements ServeSoftServe {
    @Override
    public String serveSoftServe() {
        return "Serve Soft Serve Ice Cream";
    }
}
