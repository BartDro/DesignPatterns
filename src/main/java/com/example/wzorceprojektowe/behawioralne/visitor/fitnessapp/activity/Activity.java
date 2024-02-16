package com.example.wzorceprojektowe.behawioralne.visitor.fitnessapp.activity;

import com.example.wzorceprojektowe.behawioralne.visitor.fitnessapp.visitor.Visitor;

public interface Activity {
    void accept(Visitor visitor);
}
