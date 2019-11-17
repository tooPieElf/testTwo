package org.org;

public class inheritance {
  private int value;
  private int age;
  private long money;
  private double change;

  public inheritance(int value, int age, long money, double change) {
    this.value = value;
    this.age = age;
    this.money = money;
    this.change = change;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public long getMoney() {
    return money;
  }

  public void setMoney(long money) {
    this.money = money;
  }

  public double getChange() {
    return change;
  }

  public void setChange(double change) {
    this.change = change;
  }
}
