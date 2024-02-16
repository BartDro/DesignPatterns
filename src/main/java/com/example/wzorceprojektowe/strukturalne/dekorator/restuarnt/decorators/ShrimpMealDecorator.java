package com.example.wzorceprojektowe.strukturalne.dekorator.restuarnt.decorators;

import com.example.wzorceprojektowe.strukturalne.dekorator.restuarnt.meals.Meal;

public class ShrimpMealDecorator extends MealDecorator{

    public ShrimpMealDecorator(Meal meal) {
        super(meal);
    }

    @Override
    public void prepareMeal() {
        super.prepareMeal();
        addShrimp();
    }

    private void addShrimp() {
        System.out.println("Do dania dodaję krewetki");
    }
}
