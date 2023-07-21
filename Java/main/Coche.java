package com.main;

public class Coche {
    private String marca;
    private String modelo;
    private int caballos;
    private Motor motor;

    public Coche(String marca, String modelo, int caballos, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.caballos = caballos;
        this.motor = motor;
    }

    // Getters y setters aquí (sin cambios)

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", caballos=" + caballos +
                ", motor=" + motor +
                '}';
    }
}

class CocheBuilder {
    private String marca;
    private String modelo;
    private int caballos;
    private Motor motor;

    public CocheBuilder() {
    }

    public CocheBuilder setMarca(String marca) {
        this.marca = marca;
        return this;
    }

    public CocheBuilder setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public CocheBuilder setCaballos(int caballos) {
        this.caballos = caballos;
        return this;
    }

    public CocheBuilder setMotor(Motor motor) {
        this.motor = motor;
        return this;
    }

    public Coche build() {
        return new Coche(marca, modelo, caballos, motor);
    }
}
