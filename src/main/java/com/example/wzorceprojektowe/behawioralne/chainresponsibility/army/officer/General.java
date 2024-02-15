package com.example.wzorceprojektowe.behawioralne.chainresponsibility.army.officer;

import com.example.wzorceprojektowe.behawioralne.chainresponsibility.army.message.Message;

public class General extends Officer{
    private static final int CODE = 100;
    private static final String NAME = "Generał Zaborski";

    @Override
    public void processMessage(Message message) {
        if (message.getOfficerRank().equals(OfficerRank.GENERAL) && message.getCode() == CODE){
            System.out.println(NAME + " otrzymał wiadomość: " + message.getContent());
        }else {
            System.out.println("Zły adrest wiadomości lub zły kod szyfrujacy");
        }
    }
}
