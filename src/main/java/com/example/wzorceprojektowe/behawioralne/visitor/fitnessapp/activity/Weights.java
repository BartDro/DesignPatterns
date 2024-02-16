package com.example.wzorceprojektowe.behawioralne.visitor.fitnessapp.activity;

import com.example.wzorceprojektowe.behawioralne.visitor.fitnessapp.visitor.Visitor;

public record Weights(int weight, int reps) implements Activity {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
