package com.endes.figuras;
/**
 * Representa un punto en el plano cartesiano.
 * <p>
 * Un punto se define por sus coordenadas X e Y.
 * Esta clase permite obtener y modificar las coordenadas,
 * así como calcular la distancia a otro punto.
 * </p>
 * 
 * @author Manuel
 * @version 1.0
 * @since 1.0
 */
public class Punto {
	private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distancia(Punto otro) {
        double dx = this.x - otro.x;
        double dy = this.y - otro.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}

