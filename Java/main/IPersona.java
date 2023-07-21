package com.main;

interface Personas {

  String getNombre();

  void setNombre(String nombre);

}

class Profesor implements Personas {

  private String nombre;
  private int salario;

  public Profesor(String nombre, int salario) {
    this.nombre = nombre;
    this.salario = salario;
  }

  @Override
  public String getNombre() {
    return nombre;
  }

  @Override
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getSalario() {
    return salario;
  }

  public void setSalario(int salario) {
    this.salario = salario;
  }

}

class Alumno implements Personas {

  private String nombre;
  private String curso;

  public Alumno(String nombre, String curso) {
    this.nombre = nombre;
    this.curso = curso;
  }

  @Override
  public String getNombre() {
    return nombre;
  }

  @Override
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getCurso() {
    return curso;
  }

  public void setCurso(String curso) {
    this.curso = curso;
  }

}
