package com;

public class Demo {

  public static void main(String[] args) {
    Chicken cock = new Cock();
    Chicken hen = new Hen();
    Chicken childChicken = new ChildChicken();

    int money = 100;
    countResult(money, cock);
    countResult(money, hen);
    countResult(money, childChicken);
  }

  private static void countResult(int money, Chicken cock) {
    System.out.format("%s元可以买%s %d只\n", money, cock.getType(), (int)(money / cock.getPrice()));
  }

}
