package com.example.wzorceprojektowe.behawioralne.chainresponsibility.christmas.children;

import com.example.wzorceprojektowe.behawioralne.chainresponsibility.christmas.mother.MotherRequest;

public class Tomek extends Child{
    private final Shelf shelf = Shelf.MEDIUM;

    @Override
    public void processRequest(MotherRequest motherRequest) {
        if (motherRequest.shelf().equals(shelf)){
            System.out.println("Tomek zdjęła słoik !");
        }else {
            getTallerChild().processRequest(motherRequest);
        }
    }
}
