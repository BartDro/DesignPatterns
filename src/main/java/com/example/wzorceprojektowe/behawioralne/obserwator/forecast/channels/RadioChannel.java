package com.example.wzorceprojektowe.behawioralne.obserwator.forecast.channels;

import com.example.wzorceprojektowe.behawioralne.obserwator.forecast.center.WeatherForecast;

public class RadioChannel implements Observer{
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Radio weather update: temp - " + weatherForecast.getTemperature() +
                " pressure - " + weatherForecast.getPressure());
    }
}
