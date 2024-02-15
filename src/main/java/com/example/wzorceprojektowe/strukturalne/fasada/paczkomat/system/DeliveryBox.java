package com.example.wzorceprojektowe.strukturalne.fasada.paczkomat.system;

class DeliveryBox {

    boolean isDeliveryBoxFull() {
        System.out.println("Delivery Box is not full.");
        return false;
    }

    boolean isDeliveryBoxBroken() {
        System.out.println("DeliveryBox is not broken");
        return false;
    }

    void getUserData() {
        System.out.println("User data entered");
    }

    void openBox() {
        System.out.println("Box opened");
    }
}
