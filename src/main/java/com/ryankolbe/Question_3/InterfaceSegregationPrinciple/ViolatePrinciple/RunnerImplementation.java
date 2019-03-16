package com.ryankolbe.Question_3.InterfaceSegregationPrinciple.ViolatePrinciple;

public class RunnerImplementation implements AthleteInterface{
    @Override
    public String runner() {
        return "Runs the comrades marathon";
    }

    /*
    * Too many unnecessary methods to implement in interface.
    * Athlete interface relevant only to some athletes and
    * all methods have to be implemented.
    */

    @Override
    public String swimmer() {
        return null;
    }

    @Override
    public String cyclist() {
        return null;
    }

    @Override
    public String gymnist() {
        return null;
    }
}
