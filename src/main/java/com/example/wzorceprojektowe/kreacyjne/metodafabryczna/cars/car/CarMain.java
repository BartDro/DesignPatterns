package com.example.wzorceprojektowe.kreacyjne.metodafabryczna.cars.car;

import com.example.wzorceprojektowe.kreacyjne.metodafabryczna.cars.car.bwm.BmwFactory;
import com.example.wzorceprojektowe.kreacyjne.metodafabryczna.cars.car.bwm.BmwFactoryImpl;
import com.example.wzorceprojektowe.kreacyjne.metodafabryczna.cars.car.bwm.BmwType;
import com.example.wzorceprojektowe.kreacyjne.metodafabryczna.cars.car.ford.FordFactory;
import com.example.wzorceprojektowe.kreacyjne.metodafabryczna.cars.car.ford.FordFactoryImpl;
import com.example.wzorceprojektowe.kreacyjne.metodafabryczna.cars.car.ford.FordType;

public class CarMain {
    public static void main(String[] args) {
        FordFactory fordFactory = new FordFactoryImpl();
        BmwFactory bmwFactory = new BmwFactoryImpl();

        Car ford = fordFactory.createFordCar(FordType.FOCUS);
        Car bmw = bmwFactory.createBmwCar(BmwType.X5);
    }
}
