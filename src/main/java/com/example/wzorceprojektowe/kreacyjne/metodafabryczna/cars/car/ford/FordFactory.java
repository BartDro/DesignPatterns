package com.example.wzorceprojektowe.kreacyjne.metodafabryczna.cars.car.ford;

import com.example.wzorceprojektowe.kreacyjne.metodafabryczna.cars.car.Car;

public interface FordFactory {
    Car createFordCar(FordType fordType);
}
