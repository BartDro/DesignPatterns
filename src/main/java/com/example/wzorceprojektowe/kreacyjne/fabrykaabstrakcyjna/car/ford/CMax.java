package com.example.wzorceprojektowe.kreacyjne.fabrykaabstrakcyjna.car.ford;

import com.example.wzorceprojektowe.kreacyjne.fabrykaabstrakcyjna.car.Car;
import com.example.wzorceprojektowe.kreacyjne.fabrykaabstrakcyjna.car.FuelType;
import com.example.wzorceprojektowe.kreacyjne.fabrykaabstrakcyjna.car.WheelPosition;

public class CMax extends Car {

    public CMax(double engineVolume, FuelType fuelType, int productionYear, WheelPosition wheelPosition) {
        super(engineVolume, fuelType, productionYear, wheelPosition);
    }
}
