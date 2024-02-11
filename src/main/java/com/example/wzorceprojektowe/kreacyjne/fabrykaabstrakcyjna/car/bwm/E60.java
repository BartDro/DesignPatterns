package com.example.wzorceprojektowe.kreacyjne.fabrykaabstrakcyjna.car.bwm;

import com.example.wzorceprojektowe.kreacyjne.fabrykaabstrakcyjna.car.Car;
import com.example.wzorceprojektowe.kreacyjne.fabrykaabstrakcyjna.car.FuelType;
import com.example.wzorceprojektowe.kreacyjne.fabrykaabstrakcyjna.car.WheelPosition;

public class E60 extends Car {
    public E60(double engineVolume, FuelType fuelType, int productionYear, WheelPosition wheelPosition) {
        super(engineVolume, fuelType, productionYear, wheelPosition);
    }
}
