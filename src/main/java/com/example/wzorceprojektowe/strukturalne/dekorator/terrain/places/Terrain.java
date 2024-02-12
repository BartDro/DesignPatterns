package com.example.wzorceprojektowe.strukturalne.dekorator.terrain.places;

public abstract class Terrain {
    private final String description;
    private final int fuelCost;

    public Terrain(String description, int fuelCost) {
        this.description = description;
        this.fuelCost = fuelCost;
    }

    public int getFuelCost(){
        return fuelCost;
    }

    public String getDescription(){
        return description;
    }
}
