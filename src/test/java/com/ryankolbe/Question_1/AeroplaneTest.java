package com.ryankolbe.Question_1;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class AeroplaneTest {
    private static Aeroplane aeroplane;

    @BeforeClass
    public static void setUp() {
        aeroplane = new Aeroplane("Jet", "Firefox", 4, true,
                true, "Jet engine", 2, 1500);
    }

    @Test
    public void getEngineType() {
        String result = aeroplane.getEngineType();
        Assert.assertEquals("Assert result is correct. ", "Jet engine", result);
    }

    @Test
    public void setEngineType() {
        aeroplane.setEngineType("Propeller engine");
        String result = aeroplane.getEngineType();
        Assert.assertEquals("Assert result is correct. ", "Propeller engine", result);
    }

    @Test
    public void getNumberOfEngines() {
        int result = aeroplane.getNumberOfEngines();
        Assert.assertEquals("Assert result is correct. ", 2, result);
    }

    @Test
    public void setNumberOfEngines() {
        aeroplane.setNumberOfEngines(3);
        int result = aeroplane.getNumberOfEngines();
        Assert.assertEquals("Assert result is correct. ", 3, result);
        //Reset model information.
        aeroplane.setNumberOfEngines(2);
    }

    @Test
    public void getEngineCapacity() {
        int result = aeroplane.getEngineCapacity();
        Assert.assertEquals("Assert result is correct. ", 1500, result);
    }

    @Test
    public void setEngineCapacity() {
        aeroplane.setEngineCapacity(350);
        int result = aeroplane.getEngineCapacity();
        Assert.assertEquals("Assert result is correct. ", 350, result);
        //Reset model information.
        aeroplane.setEngineCapacity(1500);
    }

    @Test
    public void refuelVehicle() {
        int result = aeroplane.getEngineCapacity() * aeroplane.getNumberOfEngines();
        Assert.assertEquals("Assert result is correct. ", 3000, result);
    }
}