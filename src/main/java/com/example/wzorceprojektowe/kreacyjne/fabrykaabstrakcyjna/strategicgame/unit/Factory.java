package com.example.wzorceprojektowe.kreacyjne.fabrykaabstrakcyjna.strategicgame.unit;

abstract public class Factory {
    abstract public InfantryUnit createInfantryUnit(UnitType unitType);
    abstract public MechanizedUnit createMechanizedUnit(UnitType unitType);
}
