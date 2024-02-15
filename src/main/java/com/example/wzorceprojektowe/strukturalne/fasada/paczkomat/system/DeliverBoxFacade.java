package com.example.wzorceprojektowe.strukturalne.fasada.paczkomat.system;

public class DeliverBoxFacade {
    private final DeliveryBox deliveryBox;
    private final DeliveryBoxSystem deliveryBoxSystem;

    public DeliverBoxFacade() {
        this.deliveryBox = new DeliveryBox();
        this.deliveryBoxSystem = new DeliveryBoxSystem();
    }

    public void pickupPackage() {
        deliveryBox.getUserData();
        if (deliveryBoxSystem.isUserDataValidated() && deliveryBoxSystem.isPaymentSecured()) {
            deliveryBox.openBox();
        }
    }
}
