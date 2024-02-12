package com.example.wzorceprojektowe.strukturalne.dekorator.terrain;

import com.example.wzorceprojektowe.strukturalne.dekorator.terrain.decorators.ForestDecorator;
import com.example.wzorceprojektowe.strukturalne.dekorator.terrain.places.Plain;
import com.example.wzorceprojektowe.strukturalne.dekorator.terrain.places.Terrain;

public class Main {
    public static void main(String[] args) {
        Terrain plainWithForest = new ForestDecorator(new Plain());
        System.out.println(" Koszt przebycia lesistej równiny: " + plainWithForest.getFuelCost());
    }
}
