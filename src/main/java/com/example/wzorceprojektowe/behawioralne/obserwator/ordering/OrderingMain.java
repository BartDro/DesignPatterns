package com.example.wzorceprojektowe.behawioralne.obserwator.ordering;

import com.example.wzorceprojektowe.behawioralne.obserwator.ordering.notifiction.EmailMessage;
import com.example.wzorceprojektowe.behawioralne.obserwator.ordering.notifiction.MobileMessage;
import com.example.wzorceprojektowe.behawioralne.obserwator.ordering.notifiction.TextMessage;
import com.example.wzorceprojektowe.behawioralne.obserwator.ordering.order.Order;
import com.example.wzorceprojektowe.behawioralne.obserwator.ordering.order.OrderStatus;

public class OrderingMain {

    public static void main(String[] args) {
        var order = new Order(OrderStatus.RECEIVED);
        order.addObserver(new EmailMessage());
        order.addObserver(new MobileMessage());
        order.addObserver(new TextMessage());

        order.changeOrderStatus(OrderStatus.IN_PROGRESS);
        System.out.println("--------------------------------------");
        order.changeOrderStatus(OrderStatus.COMPLETED);
    }
}
