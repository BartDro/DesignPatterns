package com.example.wzorceprojektowe.strukturalne.dekorator.restuarnt.decorators;

import com.example.wzorceprojektowe.strukturalne.dekorator.restuarnt.meals.Meal;

public abstract class MealDecorator extends Meal {
    protected Meal meal;

    public MealDecorator(Meal meal) {
        this.meal = meal;
    }

    @Override
    public void prepareMeal() {
        this.meal.prepareMeal();
    }
}
