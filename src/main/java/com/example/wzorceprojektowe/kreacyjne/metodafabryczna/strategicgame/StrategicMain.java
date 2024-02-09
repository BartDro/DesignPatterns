package com.example.wzorceprojektowe.kreacyjne.metodafabryczna.strategicgame;

import com.example.wzorceprojektowe.kreacyjne.metodafabryczna.strategicgame.unit.Factory;
import com.example.wzorceprojektowe.kreacyjne.metodafabryczna.strategicgame.unit.Unit;
import com.example.wzorceprojektowe.kreacyjne.metodafabryczna.strategicgame.unit.UnitFactory;
import com.example.wzorceprojektowe.kreacyjne.metodafabryczna.strategicgame.unit.UnitType;

public class StrategicMain {

    public static void main(String[] args) {
        Factory factory = new UnitFactory();
        Unit tank = factory.createUnt(UnitType.TANK);
        Unit rifleman = factory.createUnt(UnitType.RIFLEMAN);
    }
}
