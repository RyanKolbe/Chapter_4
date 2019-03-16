package com.ryankolbe.Question_2;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InterfaceImplementationTest {
    private static InterfaceImplementation interfaceImplementation;
    private static Aeroplane aeroplane;

    @BeforeClass
    public static void setUp() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(VehicleConfig.class);
        interfaceImplementation = (InterfaceImplementation) applicationContext.getBean("Refuel");
        Vehicle vehicle = new Vehicle("Jet", "Fire Fox", 3, true, true);
        aeroplane = new Aeroplane("Jet Engine", 2, 750, vehicle);
    }

    @Test
    public void refuelVehicle() {
        int result = interfaceImplementation.refuelVehicle(aeroplane.getNumberOfEngines(), aeroplane.getEngineCapacity());
        Assert.assertEquals("Assert result is correct. ", 1500, result);
    }
}