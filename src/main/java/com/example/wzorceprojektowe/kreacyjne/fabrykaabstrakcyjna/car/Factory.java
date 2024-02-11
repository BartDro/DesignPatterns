package com.example.wzorceprojektowe.kreacyjne.fabrykaabstrakcyjna.car;

import com.example.wzorceprojektowe.kreacyjne.fabrykaabstrakcyjna.car.bwm.BmwType;
import com.example.wzorceprojektowe.kreacyjne.fabrykaabstrakcyjna.car.ford.FordType;

public interface Factory {
    Car createFordCar(FordType fordType);
    Car createBmwCar(BmwType bmwType);
}
