package com.example.wzorceprojektowe.strukturalne.fasada.paczkomat;

import com.example.wzorceprojektowe.strukturalne.fasada.paczkomat.system.DeliverBoxFacade;

public class Main {
    public static void main(String[] args) {
        var facade = new DeliverBoxFacade();
        facade.pickupPackage();
    }


}
