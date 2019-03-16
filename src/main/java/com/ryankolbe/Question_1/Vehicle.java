package com.ryankolbe.Question_1;

public class Vehicle {


    private String make;
    private String model;
    private int numberOfWheels;
    private boolean windows;
    private boolean wheels;

    public Vehicle() {
    }

    public Vehicle(String make, String model, int numberOfWheels, boolean windows, boolean wheels) {
        this.make = make;
        this.model = model;
        this.numberOfWheels = numberOfWheels;
        this.windows = windows;
        this.wheels = wheels;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public boolean isWindows() {
        return windows;
    }

    public void setWindows(boolean windows) {
        this.windows = windows;
    }

    public boolean isWheels() {
        return wheels;
    }

    public void setWheels(boolean wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", numberOfWheels=" + numberOfWheels +
                ", windows=" + windows +
                ", wheels=" + wheels +
                '}';
    }
}
