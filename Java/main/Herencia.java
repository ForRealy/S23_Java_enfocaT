package com.main;

class Person {
  private String nombres;
  private String apellidos;
  private String documento;
  private String tipo;

  public Person(String nombres, String apellidos, String documento, String tipo) {
    this.nombres = nombres;
    this.apellidos = apellidos;
    this.documento = documento;
    this.tipo = tipo;
  }

  public String getNombres() {
    return nombres;
  }

  public void setNombres(String nombres) {
    this.nombres = nombres;
  }

  public String getApellidos() {
    return apellidos;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  public String getDocumento() {
    return documento;
  }

  public void setDocumento(String documento) {
    this.documento = documento;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }
}

class Cliente extends Person {
  private String categoria;
  private String codigo;

  public Cliente(String nombres, String apellidos, String documento, String tipo, String categoria, String codigo) {
    super(nombres, apellidos, documento, tipo);
    this.categoria = categoria;
    this.codigo = codigo;
  }

  public String getCategoria() {
    return categoria;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String generarCodigo() {
    // Genera un código aleatorio para el cliente.
    return "XXXX-XXXX-XXXX-XXXX";
  }
}

class Empleados extends Persona {
  private String tipoContrato;
  private double sueldo;

  public Empleados(String nombres, String apellidos, String documento, String tipo, String tipoContrato, double sueldo) {
    super();
    this.tipoContrato = tipoContrato;
    this.sueldo = sueldo;
  }

  public String getTipoContrato() {
    return tipoContrato;
  }

  public void setTipoContrato(String tipoContrato) {
    this.tipoContrato = tipoContrato;
  }

  public double getSueldo() {
    return sueldo;
  }

  public void setSueldo(double sueldo) {
    this.sueldo = sueldo;
  }

  public double calcularSueldo() {
    // Calcula el sueldo mensual del empleado.
    return sueldo * 12;
  }
}

