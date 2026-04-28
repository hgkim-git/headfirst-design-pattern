package io.github.hgkimer.ch02.oberver.subject;

import io.github.hgkimer.ch02.oberver.Observer;

public interface Subject {

  void registerObserver(Observer observer);

  void removeObserver(Observer observer);

  void notifyObservers();
}
