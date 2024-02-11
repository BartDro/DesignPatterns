package com.example.wzorceprojektowe.kreacyjne.metodafabryczna.cars.car.ford;

import com.example.wzorceprojektowe.kreacyjne.metodafabryczna.cars.car.Car;
import com.example.wzorceprojektowe.kreacyjne.metodafabryczna.cars.car.FuelType;

public class FordFactoryImpl implements FordFactory{
    @Override
    public Car createFordCar(FordType fordType) {
        return switch (fordType) {
            case CMAX -> new CMax(50.5, FuelType.DIESEL,2008);
            case FOCUS -> new Focus(45.8,FuelType.PETROL, 2010);
        };
    }
}
