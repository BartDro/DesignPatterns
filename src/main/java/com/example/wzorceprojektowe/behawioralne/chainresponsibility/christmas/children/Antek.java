package com.example.wzorceprojektowe.behawioralne.chainresponsibility.christmas.children;

import com.example.wzorceprojektowe.behawioralne.chainresponsibility.christmas.mother.MotherRequest;

public class Antek extends Child{
    private final Shelf shelf = Shelf.HIGH;

    @Override
    public void processRequest(MotherRequest motherRequest) {
        if (motherRequest.shelf().equals(shelf)){
            System.out.println("Antek zdjęła słoik !");
        }else {
            System.out.println("Nie ma wyższej półki ani dziecka które mogłoby zdjąć słoik!");
        }
    }
}
