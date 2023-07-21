package com.main;

class Employee {

  private String nombre;
  private String apellido;
  private int edad;
  private int salario;

  public Employee(String nombre, String apellido, int edad, int salario) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
    this.salario = salario;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public int getSalario() {
    return salario;
  }

  public void setSalario(int salario) {
    this.salario = salario;
  }
}

class Programmer extends Employee {

  private int bonus;

  public Programmer(String nombre, String apellido, int edad, int salario, int bonus) {
    super(nombre, apellido, edad, salario);
    this.bonus = bonus;
  }

  public int getBonus() {
    return bonus;
  }

  public void setBonus(int bonus) {
    this.bonus = bonus;
  }
}
