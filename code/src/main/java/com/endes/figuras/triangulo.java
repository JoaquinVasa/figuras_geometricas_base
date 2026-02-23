package com.endes.figuras;

public class triangulo extends FiguraGeometrica{
	private Punto vertice1;
    private Punto vertice2;
    private Punto vertice3;
    
	public triangulo(String nombre, String color, Punto v1, Punto v2, Punto v3) {
		super(nombre, color);
		this.vertice1 = v1;
        this.vertice2 = v2;
        this.vertice3 = v3;
	}

	@Override
	public double area() {
		 // Fórmula del determinante
	       
        double x1 = vertice1.getX();
        double y1 = vertice1.getY();
        double x2 = vertice2.getX();
        double y2 = vertice2.getY();
        double x3 = vertice3.getX();
        double y3 = vertice3.getY();

        return Math.abs(
                (x1*(y2 - y3) +
                 x2*(y3 - y1) +
                 x3*(y1 - y2)) / 2.0
        );
	}

	@Override
	public double perimetro() {
		 double lado1 = vertice1.distancia(vertice2);
	        double lado2 = vertice2.distancia(vertice3);
	        double lado3 = vertice3.distancia(vertice1);

	        return lado1 + lado2 + lado3;
	}
    @Override
    public void rotar(double angulo) {
        rotarPunto(vertice1, angulo);
        rotarPunto(vertice2, angulo);
        rotarPunto(vertice3, angulo);
    }

    private void rotarPunto(Punto p, double angulo) {
        double rad = Math.toRadians(angulo);

        double xNuevo = p.getX() * Math.cos(rad) - p.getY() * Math.sin(rad);
        double yNuevo = p.getX() * Math.sin(rad) + p.getY() * Math.cos(rad);

        p.setX(xNuevo);
        p.setY(yNuevo);
    }

    @Override
    public void trasladar(double dx, double dy) {
        vertice1.trasladar(dx, dy);
        vertice2.trasladar(dx, dy);
        vertice3.trasladar(dx, dy);
    }

}
