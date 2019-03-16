package com.ryankolbe.Question_2;

public class Aeroplane implements Refuel {

    private String engineType;
    private int numberOfEngines;
    private int engineCapacity;
    private Vehicle vehicle;

    public Aeroplane(String engineType, int numberOfEngines, int engineCapacity, Vehicle vehicle) {
        this.engineType = engineType;
        this.numberOfEngines = numberOfEngines;
        this.engineCapacity = engineCapacity;
        this.vehicle = vehicle;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getNumberOfEngines() {
        return numberOfEngines;
    }

    public void setNumberOfEngines(int numberOfEngines) {
        this.numberOfEngines = numberOfEngines;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Aeroplane{" +
                "engineType='" + engineType + '\'' +
                ", numberOfEngines=" + numberOfEngines +
                ", engineCapacity=" + engineCapacity +
                ", vehicle=" + vehicle +
                '}';
    }

    @Override
    public int refuelVehicle(int numberOfEngines, int engineCapacity) {
        return numberOfEngines * engineCapacity;
    }
}