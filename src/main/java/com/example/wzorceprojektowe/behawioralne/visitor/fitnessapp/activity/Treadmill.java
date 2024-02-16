package com.example.wzorceprojektowe.behawioralne.visitor.fitnessapp.activity;

import com.example.wzorceprojektowe.behawioralne.visitor.fitnessapp.visitor.Visitor;

public record Treadmill(int distance) implements Activity {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
