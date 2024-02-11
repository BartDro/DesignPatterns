package com.example.wzorceprojektowe.kreacyjne.fabrykaabstrakcyjna.strategicgame.unit;

public class BlueFactory extends Factory {

    @Override
    public InfantryUnit createInfantryUnit(UnitType unitType) {
        return switch (unitType) {
            case RIFLEMAN -> new Rifleman(20, 0, 30);
            default -> throw new UnsupportedOperationException("There is no such infantry unit");
        };
    }

    @Override
    public MechanizedUnit createMechanizedUnit(UnitType unitType) {
        return switch (unitType) {
            case TANK -> new Tank(50, 0, 70);
            default -> throw new UnsupportedOperationException("There is no such infantry unit");
        };
    }
}
