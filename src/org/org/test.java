package org.org;

public class test extends inheritance {
  private int mine;
  private long body;
  private String them;

  public test(int value, int age, long money, double change, int mine, long body,
      String them) {
    super(value, age, money, change);
    this.mine = mine;
    this.body = body;
    this.them = them;
  }

  public int getMine() {
    return mine;
  }

  public void setMine(int mine) {
    this.mine = mine;
  }

  public long getBody() {
    return body;
  }

  public void setBody(long body) {
    this.body = body;
  }

  public String getThem() {
    return them;
  }

  public void setThem(String them) {
    this.them = them;
  }
}
