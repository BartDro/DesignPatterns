package com.example.wzorceprojektowe.behawioralne.strategia.shop.pricing;

public class RegularPrice implements PriceStrategy{
    @Override
    public void calculatePrice(int price, boolean isSignedForNewsletter) {
        if (!isSignedForNewsletter){
            System.out.println("Normalna cena: " + price);
        }else {
            System.out.println("Użytkownik jest na newsleterze - wybierz inną strategię");
        }
    }
}
