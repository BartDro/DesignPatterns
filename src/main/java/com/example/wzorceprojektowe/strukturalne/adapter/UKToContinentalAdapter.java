package com.example.wzorceprojektowe.strukturalne.adapter;

public class UKToContinentalAdapter implements ContinentalDevice{

    private final UKDevice ukDevice;

    public UKToContinentalAdapter(UKDevice ukDevice) {
        this.ukDevice = ukDevice;
    }

    @Override
    public void on() {
        ukDevice.powerOn();
    }
}
