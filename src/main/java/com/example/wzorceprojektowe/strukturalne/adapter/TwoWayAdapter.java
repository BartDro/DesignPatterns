package com.example.wzorceprojektowe.strukturalne.adapter;

public class TwoWayAdapter implements ContinentalDevice, UKDevice{

    private final ContinentalDevice continentalDevice;
    private final UKDevice ukDevice;

    public TwoWayAdapter(ContinentalDevice continentalDevice, UKDevice ukDevice) {
        this.continentalDevice = continentalDevice;
        this.ukDevice = ukDevice;
    }


    @Override
    public void on() {
        ukDevice.powerOn();
    }

    @Override
    public void powerOn() {
        continentalDevice.on();
    }
}
