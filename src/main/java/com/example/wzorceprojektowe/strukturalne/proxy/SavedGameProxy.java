package com.example.wzorceprojektowe.strukturalne.proxy;

public class SavedGameProxy implements SavedGame{
    private SavedGameFull savedGameFull;
    private String name;

    @Override
    public void initialize() {
        this.name = "Save Game - " + System.currentTimeMillis();
    }

    @Override
    public void loadGame() {
        this.savedGameFull = new SavedGameFull();
        this.savedGameFull.initialize();
        this.savedGameFull.loadGame();
    }

    @Override
    public String getName() {
        return this.name;
    }
}
