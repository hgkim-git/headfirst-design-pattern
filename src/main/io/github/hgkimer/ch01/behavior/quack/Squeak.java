package io.github.hgkimer.ch01.behavior.quack;

public class Squeak implements QuackBehavior{

  @Override
  public void quack() {
    // squeak: 고무 오리의 삑삑 소리
    System.out.println( "Squeak!");
  }
}
