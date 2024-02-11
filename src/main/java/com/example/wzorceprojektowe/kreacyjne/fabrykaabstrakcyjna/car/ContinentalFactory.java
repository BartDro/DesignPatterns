package com.example.wzorceprojektowe.kreacyjne.fabrykaabstrakcyjna.car;

import com.example.wzorceprojektowe.kreacyjne.fabrykaabstrakcyjna.car.bwm.BmwType;
import com.example.wzorceprojektowe.kreacyjne.fabrykaabstrakcyjna.car.bwm.E60;
import com.example.wzorceprojektowe.kreacyjne.fabrykaabstrakcyjna.car.bwm.X5;
import com.example.wzorceprojektowe.kreacyjne.fabrykaabstrakcyjna.car.ford.CMax;
import com.example.wzorceprojektowe.kreacyjne.fabrykaabstrakcyjna.car.ford.Focus;
import com.example.wzorceprojektowe.kreacyjne.fabrykaabstrakcyjna.car.ford.FordType;


public class ContinentalFactory implements Factory {

    @Override
    public Car createFordCar(FordType fordType) {
        return switch (fordType) {
            case CMAX -> new CMax(50.5, FuelType.DIESEL, 2008, WheelPosition.LEFT);
            case FOCUS -> new Focus(45.8, FuelType.PETROL, 2010, WheelPosition.LEFT);
        };
    }

    @Override
    public Car createBmwCar(BmwType bmwType) {
        return switch (bmwType) {
            case X5 -> new X5(60.5, FuelType.DIESEL, 2009, WheelPosition.LEFT);
            case E60 -> new E60(85.8, FuelType.PETROL, 2015, WheelPosition.LEFT);
        };
    }
}
