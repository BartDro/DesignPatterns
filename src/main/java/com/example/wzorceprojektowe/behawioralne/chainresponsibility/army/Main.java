package com.example.wzorceprojektowe.behawioralne.chainresponsibility.army;

import com.example.wzorceprojektowe.behawioralne.chainresponsibility.army.message.Message;
import com.example.wzorceprojektowe.behawioralne.chainresponsibility.army.officer.*;

public class Main {
    public static void main(String[] args) {
        Message message = new Message("Atakować !", 50, OfficerRank.CAPTAIN);

        Officer sergeant = new Sergeant();
        Officer captain = new Captain();
        Officer general = new General();

        sergeant.setSuperiorOfficer(captain);
        captain.setSuperiorOfficer(general);

        sergeant.processMessage(message);
    }
}
