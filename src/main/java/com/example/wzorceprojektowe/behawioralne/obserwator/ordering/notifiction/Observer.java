package com.example.wzorceprojektowe.behawioralne.obserwator.ordering.notifiction;

import com.example.wzorceprojektowe.behawioralne.obserwator.ordering.order.Order;

public interface Observer {
    void update(Order order);
}
