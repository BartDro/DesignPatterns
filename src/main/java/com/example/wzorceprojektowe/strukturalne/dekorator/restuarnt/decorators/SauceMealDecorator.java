package com.example.wzorceprojektowe.strukturalne.dekorator.restuarnt.decorators;

import com.example.wzorceprojektowe.strukturalne.dekorator.restuarnt.meals.Meal;

public class SauceMealDecorator extends MealDecorator{

    public SauceMealDecorator(Meal meal) {
        super(meal);
    }
    @Override
    public void prepareMeal() {
        super.prepareMeal();
        addSauce();
    }

    private void addSauce() {
        System.out.println("Do dania dodaję sosik");
    }
}
