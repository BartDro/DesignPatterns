package com.example.wzorceprojektowe.behawioralne.chainresponsibility.christmas;

import com.example.wzorceprojektowe.behawioralne.chainresponsibility.christmas.children.*;
import com.example.wzorceprojektowe.behawioralne.chainresponsibility.christmas.mother.MotherRequest;

public class Main {
    public static void main(String[] args) {
        Child ania = new Ania();
        Child tomek = new Tomek();
        Child antek = new Antek();

        ania.setTallerChild(tomek);
        tomek.setTallerChild(antek);

        MotherRequest motherRequest = new MotherRequest(Shelf.MEDIUM);
        ania.processRequest(motherRequest);
    }
}
