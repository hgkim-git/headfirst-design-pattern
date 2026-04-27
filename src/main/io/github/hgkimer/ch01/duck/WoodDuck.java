package io.github.hgkimer.ch01.duck;

import io.github.hgkimer.ch01.behavior.fly.FlyNoWay;
import io.github.hgkimer.ch01.behavior.quack.MuteQuack;

public class WoodDuck extends Duck {

  public WoodDuck() {
    quackBehavior = new MuteQuack();
    flyBehavior = new FlyNoWay();
  }
}
