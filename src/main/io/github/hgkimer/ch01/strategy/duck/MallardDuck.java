package io.github.hgkimer.ch01.strategy.duck;

import io.github.hgkimer.ch01.strategy.behavior.fly.FlyWithWings;
import io.github.hgkimer.ch01.strategy.behavior.quack.Quack;

public class MallardDuck extends Duck {

  public MallardDuck() {
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }

}
