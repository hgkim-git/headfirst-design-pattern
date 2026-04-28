package io.github.hgkimer.ch01.strategy.duck;

import io.github.hgkimer.ch01.strategy.behavior.fly.FlyNoWay;
import io.github.hgkimer.ch01.strategy.behavior.quack.MuteQuack;

public class WoodDuck extends Duck {

  public WoodDuck() {
    quackBehavior = new MuteQuack();
    flyBehavior = new FlyNoWay();
  }
}
