package com.example.wzorceprojektowe.behawioralne.chainresponsibility.army.message;

import com.example.wzorceprojektowe.behawioralne.chainresponsibility.army.officer.OfficerRank;

public class Message {

    private final String content;
    private final int code;
    private final OfficerRank officerRank;

    public Message(String content, int code, OfficerRank officerRank) {
        this.content = content;
        this.code = code;
        this.officerRank = officerRank;
    }

    public String getContent() {
        return content;
    }

    public int getCode() {
        return code;
    }

    public OfficerRank getOfficerRank() {
        return officerRank;
    }
}
