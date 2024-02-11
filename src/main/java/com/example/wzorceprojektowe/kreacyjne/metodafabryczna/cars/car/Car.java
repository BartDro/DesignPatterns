package com.example.wzorceprojektowe.kreacyjne.metodafabryczna.cars.car;

abstract public class Car {
    double engineVolume;
    FuelType fuelType;
    int productionYear;

    public Car(double engineVolume, FuelType fuelType, int productionYear) {
        this.engineVolume = engineVolume;
        this.fuelType = fuelType;
        this.productionYear = productionYear;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }
}
