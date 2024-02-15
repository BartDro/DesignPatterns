package com.example.wzorceprojektowe.behawioralne.obserwator.forecast.center;

import com.example.wzorceprojektowe.behawioralne.obserwator.forecast.channels.Observer;

import java.util.HashSet;
import java.util.Set;

public class WeatherForecast implements Observable{
    private int temperature;
    private int pressure;
    private Set<Observer> observers = new HashSet<>();

    public WeatherForecast(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        this.observers.forEach(observer -> observer.updateForecast(this));
    }

    public void updateWeather(int temperature, int pressure){
        this.temperature = temperature;
        this.pressure = pressure;
        this.notifyObservers();
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public Set<Observer> getObservers() {
        return observers;
    }

    public void setObservers(Set<Observer> observers) {
        this.observers = observers;
    }
}
