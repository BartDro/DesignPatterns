package com.example.wzorceprojektowe.behawioralne.visitor.fitnessapp;

import com.example.wzorceprojektowe.behawioralne.visitor.fitnessapp.activity.Activity;
import com.example.wzorceprojektowe.behawioralne.visitor.fitnessapp.activity.Squash;
import com.example.wzorceprojektowe.behawioralne.visitor.fitnessapp.activity.Treadmill;
import com.example.wzorceprojektowe.behawioralne.visitor.fitnessapp.activity.Weights;
import com.example.wzorceprojektowe.behawioralne.visitor.fitnessapp.visitor.Visitor;
import com.example.wzorceprojektowe.behawioralne.visitor.fitnessapp.visitor.VisitorImpl;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Visitor visitor = new VisitorImpl();
        List<Activity> activities = Arrays.asList(new Squash(45), new Treadmill(200), new Weights(50, 10));
        activities.forEach(activity -> activity.accept(visitor));
    }
}
