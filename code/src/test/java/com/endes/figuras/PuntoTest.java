package com.endes.figuras;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PuntoTest {
	
	private Punto punto;
	
	@BeforeEach
	void setUp() throws Exception {
		punto = new Punto(1.0, 2.0);
	}

	@Test
	void testConstructor() {
		double y_esperado = 2.0;
		double x_esperado = 1.0;
		double x = punto.getX();
		double y = punto.getY();
		
		assertEquals(y_esperado, y);
		assertEquals(x_esperado, x);
	}
	
	@Test
	void testSetPunto() {
		double y_esperado = 3.0;
		double x_esperado = 3.0;
		
		punto.setX(3.0);
		punto.setY(3.0);
		
		double x = punto.getX();
		double y = punto.getY();
		
		assertEquals(y_esperado, y);
		assertEquals(x_esperado, x);
	}
	
	@Test
	void testDistancia() {
		double valor_esperado = 2.23606797749979; //Raíz de 5
		Punto otro = new Punto(0,0);
		double valor = punto.distancia(otro);
		assertEquals(valor_esperado, valor);
	}
}
