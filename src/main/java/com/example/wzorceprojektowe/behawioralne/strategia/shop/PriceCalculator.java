package com.example.wzorceprojektowe.behawioralne.strategia.shop;

import com.example.wzorceprojektowe.behawioralne.strategia.shop.pricing.PriceStrategy;

public class PriceCalculator {
    private PriceStrategy priceStrategy;

    public void setPriceStrategy(PriceStrategy priceStrategy) {
        this.priceStrategy = priceStrategy;
    }

    public void calculate(int price, boolean isSignedForNewsLetter) {
        if (priceStrategy == null) {
            throw new IllegalStateException("Strategia nie została ustawiona !");
        }

        priceStrategy.calculatePrice(price, isSignedForNewsLetter);
    }
}
