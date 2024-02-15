package com.example.wzorceprojektowe.behawioralne.obserwator.forecast.channels;

import com.example.wzorceprojektowe.behawioralne.obserwator.forecast.center.WeatherForecast;

public interface Observer {
    void updateForecast(WeatherForecast weatherForecast);
}
