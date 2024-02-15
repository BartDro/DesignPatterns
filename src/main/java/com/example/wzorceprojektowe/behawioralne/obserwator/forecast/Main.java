package com.example.wzorceprojektowe.behawioralne.obserwator.forecast;

import com.example.wzorceprojektowe.behawioralne.obserwator.forecast.center.WeatherForecast;
import com.example.wzorceprojektowe.behawioralne.obserwator.forecast.channels.InternetChannel;
import com.example.wzorceprojektowe.behawioralne.obserwator.forecast.channels.RadioChannel;
import com.example.wzorceprojektowe.behawioralne.obserwator.forecast.channels.TvChannel;

public class Main {
    public static void main(String[] args) {
        WeatherForecast forecast = new WeatherForecast(28, 1023);
        forecast.registerObserver(new TvChannel());
        forecast.registerObserver(new InternetChannel());
        forecast.registerObserver(new RadioChannel());

        forecast.notifyObservers();
        System.out.println("-----------------------------------------");
        forecast.updateWeather(24, 1020);
    }
}
