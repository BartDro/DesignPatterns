package com.example.wzorceprojektowe.behawioralne.strategia.shop.pricing;

public interface PriceStrategy {
    void calculatePrice(int price, boolean isSignedForNewsletter);
}
