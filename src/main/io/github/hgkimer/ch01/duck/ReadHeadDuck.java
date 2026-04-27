package io.github.hgkimer.ch01.duck;

import io.github.hgkimer.ch01.behavior.fly.FlyWithWings;
import io.github.hgkimer.ch01.behavior.quack.Quack;

public class ReadHeadDuck extends Duck {

  public ReadHeadDuck() {
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }

}
