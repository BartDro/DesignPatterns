package com.example.wzorceprojektowe.kreacyjne.metodafabryczna.cars.car.ford;

import com.example.wzorceprojektowe.kreacyjne.metodafabryczna.cars.car.Car;
import com.example.wzorceprojektowe.kreacyjne.metodafabryczna.cars.car.FuelType;

public class Focus extends Car {
    public Focus(double engineVolume, FuelType fuelType, int productionYear) {
        super(engineVolume, fuelType, productionYear);
    }
}
