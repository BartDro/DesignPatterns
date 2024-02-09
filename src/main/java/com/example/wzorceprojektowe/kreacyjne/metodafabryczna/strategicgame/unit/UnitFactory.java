package com.example.wzorceprojektowe.kreacyjne.metodafabryczna.strategicgame.unit;

public class UnitFactory extends Factory{

    @Override
    public Unit createUnt(UnitType unitType) {
        return switch (unitType) {
            case TANK -> new Tank(200,0,50);
            case RIFLEMAN -> new Rifleman(50,0,20);
        };
    }
}
