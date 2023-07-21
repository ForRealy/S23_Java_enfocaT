package com.main;

public class Cars {
  public static void main(String[] args) {
    Car honda = new Car("Honda", 100);
    Car jeep = new Car("Jeep", 500);
    Car bmw = new Car("BMW", 800);

    honda.displaySpeed();
    jeep.displaySpeed();
    bmw.displaySpeed();
  }
}
