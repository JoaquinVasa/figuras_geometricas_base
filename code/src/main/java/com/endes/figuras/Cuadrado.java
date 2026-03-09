package com.endes.figuras;

/**
 * * Representa un cuadrado en el plano cartesiano. *
 * <p>
 * * Un cuadrado es una figura geométrica que tiene cuatro lados iguales * y
 * cuatro ángulos rectos. Está definido por una esquina (punto de referencia) *
 * y la longitud de su lado. *
 * </p>
 * * * Hereda de la clase FiguraGeometrica. * * @author Manuel * @version 1.0
 * * @since 1.0
 */
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
