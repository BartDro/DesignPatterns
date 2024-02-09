package com.example.wzorceprojektowe.behawioralne.obserwator.ordering.order;

import com.example.wzorceprojektowe.behawioralne.obserwator.ordering.notifiction.Observer;

public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
