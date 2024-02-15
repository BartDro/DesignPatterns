package com.example.wzorceprojektowe.behawioralne.strategia.shop;

import com.example.wzorceprojektowe.behawioralne.strategia.shop.pricing.RegularPrice;
import com.example.wzorceprojektowe.behawioralne.strategia.shop.pricing.SalePrice;

public class Main {
    public static void main(String[] args) {
        PriceCalculator priceCalculator = new PriceCalculator();
        priceCalculator.setPriceStrategy(new RegularPrice());
        priceCalculator.calculate(100, false);
        priceCalculator.setPriceStrategy(new SalePrice());
        priceCalculator.calculate(100, true);
    }
}
