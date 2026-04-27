package io.github.hgkimer.ch01;

import io.github.hgkimer.ch01.behavior.fly.FlyNoWay;
import io.github.hgkimer.ch01.duck.MallardDuck;

public class StrategyPatternMain {

  public static void main(String[] args) {

    MallardDuck mallardDuck = new MallardDuck();
    mallardDuck.display();
    mallardDuck.performQuack();
    mallardDuck.performFly();

    mallardDuck.setFlyBehavior(new FlyNoWay()); // 이제 못날게 됨
    mallardDuck.performFly();
  }

}
