package com.example.wzorceprojektowe.behawioralne.strategia.restauracja;

import com.example.wzorceprojektowe.behawioralne.strategia.restauracja.chef.Chef;
import com.example.wzorceprojektowe.behawioralne.strategia.restauracja.chef.eggcooker.HardBoiledEggCooker;
import com.example.wzorceprojektowe.behawioralne.strategia.restauracja.chef.eggcooker.SoftEggCooker;

public class Main {
    public static void main(String[] args) {
        // Nowe zamowienie - jajka na twardo
        Chef chef = new Chef("John");
        chef.setEggCooker(new HardBoiledEggCooker());
        chef.cook();
        chef.setEggCooker(new SoftEggCooker());
        chef.cook();
    }
}
