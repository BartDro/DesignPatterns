package com.example.wzorceprojektowe.behawioralne.obserwator.ordering.notifiction;

import com.example.wzorceprojektowe.behawioralne.obserwator.ordering.order.Order;

public class TextMessage implements Observer{

    @Override
    public void update(Order order) {
        System.out.println("TextMessage message: Order change to following status: " + order.getOrderStatus());
    }
}
