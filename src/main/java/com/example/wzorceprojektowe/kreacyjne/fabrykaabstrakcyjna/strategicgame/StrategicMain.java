package com.example.wzorceprojektowe.kreacyjne.fabrykaabstrakcyjna.strategicgame;

import com.example.wzorceprojektowe.kreacyjne.fabrykaabstrakcyjna.strategicgame.unit.*;

public class StrategicMain {

    public static void main(String[] args) {
        Factory blueFactory = new BlueFactory();
        Factory redFactory = new RedFactory();

        MechanizedUnit redTank = redFactory.createMechanizedUnit(UnitType.TANK);
        InfantryUnit redRifleman = redFactory.createInfantryUnit(UnitType.RIFLEMAN);

        MechanizedUnit blueTank = blueFactory.createMechanizedUnit(UnitType.TANK);
        InfantryUnit blueRifleman = redFactory.createInfantryUnit(UnitType.RIFLEMAN);
    }
}
