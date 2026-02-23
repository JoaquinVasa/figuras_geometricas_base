package com.endes.figuras;

public class Circulo extends FiguraGeometrica {
    private Punto centro;  // El centro del círculo
    private double radio;  // El radio del círculo

    // Constructor
    public Circulo(String nombre, String color, Punto centro, double radio) {
        super(nombre, color);  // Llamada al constructor de la clase base FiguraGeometrica
        this.centro = centro;
        this.radio = radio;
    }

    // Getter y Setter para centro
    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    // Getter y Setter para radio
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Implementación del método area() de la clase base
    @Override
    public double area() {
        return Math.PI * radio * radio;  // Fórmula para el área de un círculo
    }

    // Implementación del método perimetro() de la clase base
    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;  // Fórmula para el perímetro de un círculo
    }

    // Implementación del método rotar() de la clase base
    @Override
    public void rotar(double angulo) {
        // En un círculo, rotar no cambia su forma, así que no es necesario hacer nada.
    }

    // Implementación del método trasladar() de la clase base
    @Override
    public void trasladar(double dx, double dy) {
        // Movemos el centro del círculo
        centro.setX(centro.getX() + dx);
        centro.setY(centro.getY() + dy);
    }
}