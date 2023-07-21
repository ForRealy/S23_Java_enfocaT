package com.main;

public class Car {

  private String company;
  private int speed;

  public Car(String company, int speed) {
    this.company = company;
    this.speed = speed;
  }

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public void displaySpeed() {
    System.out.println(company + " car's speed is " + speed + " km/h");
  }
}

