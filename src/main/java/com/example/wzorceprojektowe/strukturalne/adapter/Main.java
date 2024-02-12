package com.example.wzorceprojektowe.strukturalne.adapter;

public class Main {
    public static void main(String[] args) {
        ContinentalDevice continentRadio = () -> System.out.println("Radio gra muzykę kontynentu");
        ContinentalSocket continentalSocket = new ContinentalSocket();
        continentalSocket.plugIn(continentRadio);

        UKDevice ukRadio = () -> System.out.println("Radio gra wyspiarską muzykę");
        UKSocket ukSocket = new UKSocket();
        ukSocket.plugIn(ukRadio);

        UKToContinentalAdapter adapter = new UKToContinentalAdapter(ukRadio);
        continentalSocket.plugIn(adapter);
    }

}
