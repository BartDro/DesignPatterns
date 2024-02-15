package com.example.wzorceprojektowe.behawioralne.obserwator.forecast.channels;

import com.example.wzorceprojektowe.behawioralne.obserwator.forecast.center.Observable;
import com.example.wzorceprojektowe.behawioralne.obserwator.forecast.center.WeatherForecast;

public class InternetChannel implements Observer {
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Internet weather update: temp - " + weatherForecast.getTemperature() +
                " pressure - " + weatherForecast.getPressure());
    }
}
