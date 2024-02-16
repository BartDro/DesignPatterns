package com.example.wzorceprojektowe.strukturalne.dekorator.restuarnt;

import com.example.wzorceprojektowe.strukturalne.dekorator.restuarnt.decorators.ChickenMealDecorator;
import com.example.wzorceprojektowe.strukturalne.dekorator.restuarnt.decorators.SauceMealDecorator;
import com.example.wzorceprojektowe.strukturalne.dekorator.restuarnt.meals.Meal;
import com.example.wzorceprojektowe.strukturalne.dekorator.restuarnt.meals.RiceMeal;

public class Main {
    public static void main(String[] args) {
        Meal riceMeal = new RiceMeal();
        riceMeal.prepareMeal();

        Meal chickenRiceMealWithSauce = new SauceMealDecorator(new ChickenMealDecorator(new RiceMeal()));
        chickenRiceMealWithSauce.prepareMeal();
    }
}
