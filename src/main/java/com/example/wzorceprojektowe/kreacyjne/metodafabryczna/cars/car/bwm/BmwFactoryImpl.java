package com.example.wzorceprojektowe.kreacyjne.metodafabryczna.cars.car.bwm;

import com.example.wzorceprojektowe.kreacyjne.metodafabryczna.cars.car.Car;
import com.example.wzorceprojektowe.kreacyjne.metodafabryczna.cars.car.FuelType;

public class BmwFactoryImpl implements BmwFactory{
    @Override
    public Car createBmwCar(BmwType bmwType) {
        return switch (bmwType) {
            case X5 -> new X5(60.5, FuelType.DIESEL,2009);
            case E60 -> new E60(85.8,FuelType.PETROL, 2015);
        };
    }
}
