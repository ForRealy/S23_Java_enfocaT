package com.main;

public class Tarjeta {

  private String numero;
  private String titular;
  private int saldo;
  private boolean activa;

  public Tarjeta(String numero, String titular, int saldo, boolean activa) {
    this.numero = numero;
    this.titular = titular;
    this.saldo = saldo;
    this.activa = activa;
  }

  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public String getTitular() {
    return titular;
  }

  public void setTitular(String titular) {
    this.titular = titular;
  }

  public int getSaldo() {
    return saldo;
  }

  public void setSaldo(int saldo) {
    this.saldo = saldo;
  }

  public boolean isActiva() {
    return activa;
  }

  public void setActiva(boolean activa) {
    this.activa = activa;
  }

  public void pagar(int importe) {
    if (activa) {
      if (importe <= saldo) {
        saldo -= importe;
      } else {
        System.out.println("El saldo es insuficiente.");
      }
    } else {
      System.out.println("La tarjeta está anulada.");
    }
  }

  public int getSaldoActual() {
    return saldo;
  }
}
