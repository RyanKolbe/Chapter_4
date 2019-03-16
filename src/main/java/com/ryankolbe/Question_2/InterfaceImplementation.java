package com.ryankolbe.Question_2;

public class InterfaceImplementation implements Refuel {

    @Override
    public int refuelVehicle(int numberOfEngines, int engineCapacity) {
        return numberOfEngines * engineCapacity;
    }
}
