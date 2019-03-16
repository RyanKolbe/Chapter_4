package com.ryankolbe.Question_1;

public class Aeroplane extends Vehicle implements Refuel {

    private String engineType;
    private int numberOfEngines;
    private int engineCapacity;

    public Aeroplane(String engineType, int numberOfEngines, int engineCapacity) {
        this.engineType = engineType;
        this.numberOfEngines = numberOfEngines;
        this.engineCapacity = engineCapacity;
    }

    public Aeroplane(String make, String model, int numberOfWheels,
                     boolean windows, boolean wheels,
                     String engineType, int numberOfEngines, int engineCapacity) {
        super(make, model, numberOfWheels, windows, wheels);
        this.engineType = engineType;
        this.numberOfEngines = numberOfEngines;
        this.engineCapacity = engineCapacity;
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

    @Override
    public int refuelVehicle() {
        return getEngineCapacity() * getNumberOfEngines();
    }

    @Override
    public String toString() {
        return "Aeroplane{" +
                "make='" + super.getMake() +
                ", model='" + super.getModel() +
                ", numberOfWheels=" + super.getNumberOfWheels() +
                ", windows=" + super.isWindows() +
                ", wheels=" + super.isWheels() +
                ", engineType='" + engineType + '\'' +
                ", numberOfEngines=" + numberOfEngines +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}