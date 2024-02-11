package com.example.wzorceprojektowe.kreacyjne.fabrykaabstrakcyjna.car;

abstract public class Car {
    private final double engineVolume;
    private final FuelType fuelType;
    private final int productionYear;
    private final WheelPosition wheelPosition;

    public Car(double engineVolume, FuelType fuelType, int productionYear, WheelPosition wheelPosition) {
        this.engineVolume = engineVolume;
        this.fuelType = fuelType;
        this.productionYear = productionYear;
        this.wheelPosition = wheelPosition;
    }

    public double getEngineVolume() {
        return engineVolume;
    }


    public FuelType getFuelType() {
        return fuelType;
    }


    public int getProductionYear() {
        return productionYear;
    }

}
