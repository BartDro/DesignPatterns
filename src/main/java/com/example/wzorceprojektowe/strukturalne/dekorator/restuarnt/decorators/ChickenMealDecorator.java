package com.example.wzorceprojektowe.strukturalne.dekorator.restuarnt.decorators;

import com.example.wzorceprojektowe.strukturalne.dekorator.restuarnt.meals.Meal;

public class ChickenMealDecorator extends MealDecorator{

    public ChickenMealDecorator(Meal meal) {
        super(meal);
    }

    @Override
    public void prepareMeal() {
        super.prepareMeal();
        addChicken();
    }

    private void addChicken() {
        System.out.println("Do dania dodaję kurczaka");
    }
}
