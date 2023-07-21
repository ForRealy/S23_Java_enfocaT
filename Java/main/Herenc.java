package com.main;

class Empleado {

  private String nombre;

  public Empleado(String nombre) {
    this.nombre = nombre;
  }

  protected String getNombre() {
    return nombre;
  }

  public String toString() {
    return "Empleado [nombre=" + nombre + "]";
  }
}

class Operario extends Empleado {

  public Operario(String nombre) {
    super(nombre);
  }

  @Override
  public String toString() {
    return "Operario [nombre=" + getNombre() + "]";
  }
}

class Directivo extends Empleado {

  public Directivo(String nombre) {
    super(nombre);
  }

  @Override
  public String toString() {
    return "Directivo [nombre=" + getNombre() + "]";
  }
}

class Oficial extends Empleado {

  public Oficial(String nombre) {
    super(nombre);
  }

  @Override
  public String toString() {
    return "Oficial [nombre=" + getNombre() + "]";
  }
}

class Tecnico extends Empleado {

  public Tecnico(String nombre) {
    super(nombre);
  }

  @Override
  public String toString() {
    return "Tecnico [nombre=" + getNombre() + "]";
  }
}
