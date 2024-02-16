package com.example.wzorceprojektowe.behawioralne.visitor.fitnessapp.visitor;

import com.example.wzorceprojektowe.behawioralne.visitor.fitnessapp.activity.Squash;
import com.example.wzorceprojektowe.behawioralne.visitor.fitnessapp.activity.Treadmill;
import com.example.wzorceprojektowe.behawioralne.visitor.fitnessapp.activity.Weights;

public class VisitorImpl implements Visitor{
    @Override
    public void visit(Treadmill treadmill) {
        System.out.println("Calories burned running on treadmill: " + (treadmill.distance() * 3));
    }

    @Override
    public void visit(Squash squash) {
        System.out.println("Calories burned playing squash: " + (squash.minutesPlayed() * 20));
    }

    @Override
    public void visit(Weights weights) {
        System.out.println("Calories burned lifting wieghts: " + (weights.weight() * weights.reps() * 2));
    }
}
