package io.github.hgkimer.ch01.strategy.duck;

import io.github.hgkimer.ch01.strategy.behavior.fly.FlyNoWay;
import io.github.hgkimer.ch01.strategy.behavior.quack.Squeak;

public class RubberDuck extends Duck {

  public RubberDuck() {
    quackBehavior = new Squeak();
    flyBehavior = new FlyNoWay();
  }
}
