package com.endes.figuras;

public class Punto {
private double x;
private double y;
// Constructor
 public Punto(double x, double y) {
            this.x = x;
	        this.y = y;
	    }

	    // Getters
	    public double getX() {
	        return x;
	    }

	    public double getY() {
	        return y;
	    }

	    // Setters
	    public void setX(double x) {
	        this.x = x;
	    }

	    public void setY(double y) {
	        this.y = y;
	    }

	    // Método para trasladar el punto
	    public void trasladar(double dx, double dy) {
	        this.x += dx;
	        this.y += dy;
	    }

	    // Método para calcular distancia entre puntos
	    public double distancia(Punto otro) {
	        return Math.sqrt(Math.pow(this.x - otro.x, 2) +
	                         Math.pow(this.y - otro.y, 2));
	    }
}
