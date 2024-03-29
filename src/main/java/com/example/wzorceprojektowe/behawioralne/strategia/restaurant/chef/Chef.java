package com.example.wzorceprojektowe.behawioralne.strategia.restaurant.chef;

import com.example.wzorceprojektowe.behawioralne.strategia.restaurant.chef.eggcooker.EggCooker;

public class Chef {
    private String name;
    private EggCooker eggCooker;

    public Chef(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void cook() {
        this.eggCooker.cookEgg();
    }

    public EggCooker getEggCooker() {
        return eggCooker;
    }

    public void setEggCooker(EggCooker eggCooker) {
        this.eggCooker = eggCooker;
    }
}
