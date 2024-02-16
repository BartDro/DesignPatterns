package com.example.wzorceprojektowe.behawioralne.visitor.fitnessapp.visitor;

import com.example.wzorceprojektowe.behawioralne.visitor.fitnessapp.activity.Squash;
import com.example.wzorceprojektowe.behawioralne.visitor.fitnessapp.activity.Treadmill;
import com.example.wzorceprojektowe.behawioralne.visitor.fitnessapp.activity.Weights;

public interface Visitor {
    void visit(Treadmill treadmill);
    void visit(Squash squash);
    void visit(Weights weights);
}
