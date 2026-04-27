package io.github.hgkimer.ch01.behavior.quack;

public class MuteQuack implements QuackBehavior{

  @Override
  public void quack() {
    System.out.println( "Silence!");
  }
}
