package io.github.hgkimer.ch02.oberver;

import io.github.hgkimer.ch02.oberver.display.CurrentConditionsDisplay;
import io.github.hgkimer.ch02.oberver.subject.weather.WeatherData;

public class ObserverPatternMain {

  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();

    CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

    weatherData.setMeasurements(80, 65, 30.4);
    weatherData.setMeasurements(82, 70, 29.2);
    weatherData.setMeasurements(78, 90, 29.2);
  }

}
