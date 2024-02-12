package com.example.wzorceprojektowe.strukturalne.dekorator.terrain.decorators;

import com.example.wzorceprojektowe.strukturalne.dekorator.terrain.places.Terrain;

public class ForestDecorator extends TerrainDecorator{

    public ForestDecorator(Terrain terrain) {
        super(terrain);
    }

    @Override
    public int getFuelCost() {
        return terrain.getFuelCost() + 5;
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }
}
