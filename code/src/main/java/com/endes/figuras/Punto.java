package com.endes.figuras;

/**
 * Representa un punto en el plano cartesiano con coordenadas (x, y).
 * Permite obtener y modificar las coordenadas, así como calcular la distancia
 * entre este punto y otro.
 */
public class Punto {
    private double x;  // Coordenada X
    private double y;  // Coordenada Y

    // Constructor
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

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Método para calcular la distancia entre este punto y otro
    public double distancia(Punto otro) {
        double dx = this.x - otro.x;
        double dy = this.y - otro.y;
        return Math.sqrt(dx * dx + dy * dy);  // Teorema de Pitágoras
    public double distancia(Punto otro) {
        double dx = this.x - otro.x;
        double dy = this.y - otro.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
