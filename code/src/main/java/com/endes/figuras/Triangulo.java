package com.endes.figuras;

public class Triangulo extends FiguraGeometrica {
	
	private Punto vertice1;
	private Punto vertice2;
	private Punto vertice3;

	public Triangulo(String nombre, String color, Punto v1, Punto v2, Punto v3) {
		super(nombre, color);
		this.vertice1 = v1;
		this.vertice2 = v2;
		this.vertice3 = v3;
	}

	public Punto getVertice1() {
		return vertice1;
	}

	public void setVertice1(Punto vertice1) {
		this.vertice1 = vertice1;
	}

	public Punto getVertice2() {
		return vertice2;
	}

	public void setVertice2(Punto vertice2) {
		this.vertice2 = vertice2;
	}

	public Punto getVertice3() {
		return vertice3;
	}

	public void setVertice3(Punto vertice3) {
		this.vertice3 = vertice3;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}

}
