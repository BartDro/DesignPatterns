package com.example.wzorceprojektowe.behawioralne.obserwator.ordering.order;

import com.example.wzorceprojektowe.behawioralne.obserwator.ordering.notifiction.Observer;

import java.util.HashSet;
import java.util.Set;

public class Order implements Observable{
    private OrderStatus orderStatus;
    private final Set<Observer> observers = new HashSet<>();

    public Order(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(this));
    }

    public void changeOrderStatus(OrderStatus orderStatus){
        this.orderStatus = orderStatus;
        this.notifyObservers();
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Set<Observer> getObservers() {
        return observers;
    }
}
