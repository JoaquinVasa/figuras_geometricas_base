package com.endes.figuras;

public class Cuadrado extends FiguraGeometrica {
	private Punto esquina;
    private double lado;

	public Cuadrado(String nombre, String color, Punto esquina, double lado) {
		super(nombre, color);
		this.esquina = esquina;
        this.lado = lado;
	}

	@Override
	public double area() {
		return lado * lado;
	}

	@Override
	public double perimetro() {
		return 4 * lado;
	}
	
	public void rotar(double angulo) {
		System.out.println("Rotando el cuadrado " + angulo + " grados.");
	}
	
	public void trasladar(double dx, double dy) {
		esquina.setX(esquina.getX() + dx);
        esquina.setY(esquina.getY() + dy);
	}
	
	 public Punto getEsquina() {
	        return esquina;
	    }

	    public double getLado() {
	        return lado;

	    }
}
