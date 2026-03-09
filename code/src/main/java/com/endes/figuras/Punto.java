package com.endes.figuras;

public class Punto {
	
	private double x;
	private double y;	
	
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}

	public void setX(double x) {
		this.x = x;
		
	}
	
	public void setY(double y) {
		this.y = y;
		
	}
	
	public double distancia(Punto otro) {
		double distancia = Math.sqrt(Math.pow(otro.getX() - this.getX(),2) + Math.pow(otro.getY()- this.getY(), 2));
		return distancia;
	}
}