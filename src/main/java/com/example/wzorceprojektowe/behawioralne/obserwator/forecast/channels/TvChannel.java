package com.example.wzorceprojektowe.behawioralne.obserwator.forecast.channels;

import com.example.wzorceprojektowe.behawioralne.obserwator.forecast.center.WeatherForecast;

public class TvChannel implements Observer{
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Television weather update: temp - " + weatherForecast.getTemperature() +
                " pressure - " + weatherForecast.getPressure());
    }
}
