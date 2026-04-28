package io.github.hgkimer.ch01.strategy.behavior.fly;

public class FlyWithWings implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println( "I'm flying with wings!");
  }
}
