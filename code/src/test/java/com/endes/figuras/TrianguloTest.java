package com.endes.figuras;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TrianguloTest {
	
	private Triangulo triangulo;
	
	@BeforeEach
	void setUp() throws Exception {
		//String nombre, String color, vertice1, vertice2, vertice3
		Punto v1 = new Punto(0,1);
		Punto v2 = new Punto(0,0);
		Punto v3 = new Punto(2,0);
				
		triangulo = new Triangulo("trieangulo", "negro", v1, v2, v3);
	}

	@Disabled
	@Test
	void testConstructor() {
		Punto v1_esperado = new Punto(0,1);
		Punto v2_esperado = new Punto(0,0);
		Punto v3_esperado = new Punto(2,0);
	
		assertEquals(v1_esperado, triangulo.getVertice1());
	}

}
