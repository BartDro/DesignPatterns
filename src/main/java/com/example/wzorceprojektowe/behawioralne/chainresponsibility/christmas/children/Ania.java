package com.example.wzorceprojektowe.behawioralne.chainresponsibility.christmas.children;

import com.example.wzorceprojektowe.behawioralne.chainresponsibility.christmas.mother.MotherRequest;

public class Ania extends Child{
    private final Shelf shelf = Shelf.LOW;

    @Override
    public void processRequest(MotherRequest motherRequest) {
        if (motherRequest.shelf().equals(shelf)){
            System.out.println("Ania zdjęła słoik !");
        }else {
            getTallerChild().processRequest(motherRequest);
        }
    }
}
