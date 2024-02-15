package com.example.wzorceprojektowe.behawioralne.strategia.shop.pricing;

public class SalePrice implements PriceStrategy{
    @Override
    public void calculatePrice(int price, boolean isSignedForNewsletter) {
        if (isSignedForNewsletter){
            System.out.println("Cena po obniżce : " + price * 0.5);
        }else {
            System.out.println("Użytkownik nie jest na newsleterze - wybierz inną strategię");
        }
    }
}
