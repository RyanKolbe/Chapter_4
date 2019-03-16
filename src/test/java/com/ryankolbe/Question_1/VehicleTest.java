package com.ryankolbe.Question_1;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class VehicleTest {
    private static Vehicle vehicle;

    @BeforeClass
    public static void setUp() {
        vehicle = new Vehicle("Tractor", "Big Mover", 4, true, false);
    }

    @Test
    public void getMake() {
        String result = vehicle.getMake();
        Assert.assertEquals("Assert result is correct. ", "Tractor", result);
    }

    @Test
    public void setMake() {
        vehicle.setMake("Steam Roller");
        String result = vehicle.getMake();
        Assert.assertEquals("Assert result is correct. ", "Steam Roller", result);
    }

    @Test
    public void getModel() {
        String result = vehicle.getModel();
        Assert.assertEquals("Assert result is correct. ", "Big Mover", result);
    }

    @Test
    public void setModel() {
        vehicle.setModel("Big Digger");
        String result = vehicle.getModel();
        Assert.assertEquals("Assert result is correct. ", "Big Digger", result);
        //Reset model information.
        vehicle.setModel("Big Mover");
    }

    @Test
    public void getNumberOfWheels() {
        int result = vehicle.getNumberOfWheels();
        Assert.assertEquals("Assert result is correct. ", 4, result);
    }

    @Test
    public void setNumberOfWheels() {
        vehicle.setNumberOfWheels(3);
        int result = vehicle.getNumberOfWheels();
        Assert.assertEquals("Assert result is correct. ", 3, result);
        //Reset model information.
        vehicle.setNumberOfWheels(4);
    }

    @Test
    public void isWindows() {
        boolean result = vehicle.isWindows();
        Assert.assertTrue(result);
    }

    @Test
    public void setWindows() {
        vehicle.setWindows(false);
        boolean result = vehicle.isWindows();
        Assert.assertFalse(result);
        //Reset model information.
        vehicle.setWindows(true);
    }

    @Test
    public void isWheels() {
        boolean result = vehicle.isWheels();
        Assert.assertFalse(result);
    }

    @Test
    public void setWheels() {
        vehicle.setWheels(true);
        boolean result = vehicle.isWheels();
        Assert.assertTrue(result);
        //Reset model information.
        vehicle.setWheels(false);
    }
}