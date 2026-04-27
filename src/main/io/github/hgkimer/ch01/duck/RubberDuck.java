package io.github.hgkimer.ch01.duck;

import io.github.hgkimer.ch01.behavior.fly.FlyNoWay;
import io.github.hgkimer.ch01.behavior.quack.Squeak;

public class RubberDuck extends Duck {

  public RubberDuck() {
    quackBehavior = new Squeak();
    flyBehavior = new FlyNoWay();
  }
}
