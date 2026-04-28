package io.github.hgkimer.ch01.strategy.duck;

import io.github.hgkimer.ch01.strategy.behavior.fly.FlyBehavior;
import io.github.hgkimer.ch01.strategy.behavior.quack.QuackBehavior;

public abstract class Duck {

  // 유연하도록 다형성을 사용하기 위해 인터페이스 타입을 참조
  QuackBehavior quackBehavior;
  FlyBehavior flyBehavior;

  public void display() {
    System.out.println(this.getClass().getSimpleName() + " displayed!");
  }

  public void swim() {
    System.out.println(this.getClass().getSimpleName() + " swimming!");
  }

  public void performQuack() {
    quackBehavior.quack();
  }

  public void performFly() {
    flyBehavior.fly();
  }

  // 런타임에 변경이 가능하도록 setter 메서드를 제공
  public void setFlyBehavior(FlyBehavior flyBehavior) {
    this.flyBehavior = flyBehavior;
  }

  public void setQuackBehavior(QuackBehavior quackBehavior) {
    this.quackBehavior = quackBehavior;
  }


}
