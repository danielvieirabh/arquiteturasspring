package io.github.danielvieirabh.arquiteturasspring.montadora;

import java.awt.*;

public class Carro {
    private String modelo;
    private Color color;
    private Motor motor;
    private Montadora montadora;


    public Carro(Motor motor) {
        this.motor = motor; //O carro depende do motor
    }

    public Carro(String modelo, Color color, Motor motor, Montadora montadora) {
        this.modelo = modelo;
        this.color = color;
        this.motor = motor;
        this.montadora = montadora;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Montadora getMontadora() {
        return montadora;
    }

    public void setMontadora(Montadora montadora) {
        this.montadora = montadora;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
