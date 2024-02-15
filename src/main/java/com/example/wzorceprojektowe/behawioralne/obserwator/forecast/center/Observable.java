package com.example.wzorceprojektowe.behawioralne.obserwator.forecast.center;

import com.example.wzorceprojektowe.behawioralne.obserwator.forecast.channels.Observer;

public interface Observable {
    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();
}
