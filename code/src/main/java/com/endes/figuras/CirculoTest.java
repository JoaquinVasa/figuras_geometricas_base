package com.endes.figuras;

import static org.junit.Assert.assertEquals;


public class CirculoTest {
    
    private Circulo circulo;
    private Punto centro;

    public void setUp() {
        // Inicializamos el centro y el círculo antes de cada prueba
        centro = new Punto(0, 0);  // Centro en el origen
        circulo = new Circulo("Círculo 1", "Rojo", centro, 5);  // Radio de 5 unidades
    }

    public void testArea() {
        // Área de un círculo = π * r^2
        double areaEsperada = Math.PI * 5 * 5;
        assertEquals(areaEsperada, circulo.area(), "El área calculada no es correcta.");
    }

    public void testPerimetro() {
        // Perímetro de un círculo = 2 * π * r
        double perimetroEsperado = 2 * Math.PI * 5;
        assertEquals(perimetroEsperado, circulo.perimetro(), "El perímetro calculado no es correcto.");
    }

    private void assertEquals(double perimetroEsperado, double perimetro, String string) {
		// TODO Auto-generated method stub
		
	}

    public void testTrasladar() {
        // Trasladamos el centro del círculo 3 unidades en el eje X y 4 en el eje Y
        circulo.trasladar(3, 4);
        
        // Verificamos que el centro se ha movido correctamente
        assertEquals(3, circulo.getCentro().getX(), "La coordenada X del centro no se ha trasladado correctamente.");
        assertEquals(4, circulo.getCentro().getY(), "La coordenada Y del centro no se ha trasladado correctamente.");
    }

    

	private void assertDoesNotThrow(Object object, String string) {
		// TODO Auto-generated method stub
		
	}
}