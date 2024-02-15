package com.example.wzorceprojektowe.behawioralne.chainresponsibility.army.message;

import com.example.wzorceprojektowe.behawioralne.chainresponsibility.army.officer.OfficerRank;

public record Message(String content, int code, OfficerRank officerRank) {

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
