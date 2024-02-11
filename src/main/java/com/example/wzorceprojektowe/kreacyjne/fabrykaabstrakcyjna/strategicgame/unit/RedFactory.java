package com.example.wzorceprojektowe.kreacyjne.fabrykaabstrakcyjna.strategicgame.unit;

public class RedFactory extends Factory{

    @Override
    public InfantryUnit createInfantryUnit(UnitType unitType) {
        return switch (unitType) {
            case RIFLEMAN -> new Rifleman(30, 0, 20);
            default -> throw new UnsupportedOperationException("There is no such infantry unit");
        };
    }

    @Override
    public MechanizedUnit createMechanizedUnit(UnitType unitType) {
        return switch (unitType) {
            case TANK -> new Tank(70, 0, 40);
            default -> throw new UnsupportedOperationException("There is no such infantry unit");
        };
    }
}
