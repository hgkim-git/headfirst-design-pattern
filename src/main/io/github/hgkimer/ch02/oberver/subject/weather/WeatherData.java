package io.github.hgkimer.ch02.oberver.subject.weather;

import io.github.hgkimer.ch02.oberver.Observer;
import io.github.hgkimer.ch02.oberver.subject.Subject;
import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

  private final List<Observer> observers = new ArrayList<>();
  private double temperature;
  private double humidity;
  private double pressure;

  @Override
  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  @Override
  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update(temperature, humidity, pressure);
    }
  }

  public void measurementsChanged() {
    notifyObservers();
  }

  public void setMeasurements(double temperature, double humidity, double pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
  }

  public double getTemperature() {
    return temperature;
  }

  public double getHumidity() {
    return humidity;
  }

  public double getPressure() {
    return pressure;
  }
}
