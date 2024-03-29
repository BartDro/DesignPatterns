package com.example.wzorceprojektowe.strukturalne.dekorator.terrain.decorators;

import com.example.wzorceprojektowe.strukturalne.dekorator.terrain.places.Terrain;

public class SwampDecorator extends TerrainDecorator{

    public SwampDecorator(Terrain terrain) {
        super(terrain);
    }

    @Override
    public int getFuelCost() {
        return terrain.getFuelCost() + 15;
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }
}
