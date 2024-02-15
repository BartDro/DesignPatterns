package com.example.wzorceprojektowe.strukturalne.proxy;

public class SavedGameFull implements SavedGame{
    private String name;
    private String gameData;

    public void initialize() {
        this.name = "Save Game - " + System.currentTimeMillis();
        this.gameData = loadFromStorage();
    }

    public void loadGame() {
        System.out.println("Game loaded");
    }

    public String getName(){
        return this.name;
    }

    private String loadFromStorage() {
        try {
            Thread.sleep(500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        return "Loaded json";
    }
}
