package com.endes.figuras;

public class Punto {
    private double x;  // Coordenada X
    private double y;  // Coordenada Y

    // Constructor
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getter y Setter para la coordenada X
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    // Getter y Setter para la coordenada Y
    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Método para calcular la distancia entre este punto y otro
    public double distancia(Punto otro) {
        double dx = this.x - otro.x;
        double dy = this.y - otro.y;
        return Math.sqrt(dx * dx + dy * dy);  // Teorema de Pitágoras
    }
}
