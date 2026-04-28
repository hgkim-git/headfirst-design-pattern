package io.github.hgkimer.ch02.oberver.display;

import io.github.hgkimer.ch02.oberver.Observer;
import io.github.hgkimer.ch02.oberver.subject.weather.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

  private WeatherData weatherData;
  private double temperature;
  private double humidity;

  public CurrentConditionsDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  @Override
  public void update(double temperature, double humidity, double pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    display();
  }

  @Override
  public void display() {
    System.out.println(
        "Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
  }
}
