package com.example.wzorceprojektowe.kreacyjne.fabrykaabstrakcyjna.car;

import com.example.wzorceprojektowe.kreacyjne.fabrykaabstrakcyjna.car.bwm.BmwType;
import com.example.wzorceprojektowe.kreacyjne.fabrykaabstrakcyjna.car.ford.FordType;

public class CarMain {
    public static void main(String[] args) {
        Factory continentFactory = new ContinentalFactory();
        Factory commonwealthFactory = new CommonwealthFactory();

        Car bmwCommonWeatlh = commonwealthFactory.createBmwCar(BmwType.X5);
        Car bmwContinetCar = continentFactory.createBmwCar(BmwType.X5);

        int v = 10;
    }
}
