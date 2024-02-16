package com.example.wzorceprojektowe.strukturalne.dekorator.restuarnt.meals;

public class PotatoMeal extends Meal{

    @Override
    public void prepareMeal() {
        System.out.println("Przygotowuję danie na bazie ziemniaków");
    }
}
