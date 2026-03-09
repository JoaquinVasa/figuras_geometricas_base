package com.endes.figuras;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CuadradoTest {

    private Cuadrado cuadrado;
    private Punto punto;

    @BeforeEach
    public void setUp() {
        punto = new Punto(0, 0);
        cuadrado = new Cuadrado("Cuadrado1", "Rojo", punto, 4);
    }

    @Test
    public void testArea() {
        double areaEsperada = 16;
        assertEquals(areaEsperada, cuadrado.area());
    }

    @Test
    public void testPerimetro() {
        double perimetroEsperado = 16;
        assertEquals(perimetroEsperado, cuadrado.perimetro());
    }

    @Test
    public void testGetEsquina() {
        assertEquals(0, cuadrado.getEsquina().getX());
        assertEquals(0, cuadrado.getEsquina().getY());
    }

    @Test
    public void testGetLado() {
        assertEquals(4, cuadrado.getLado());
    }

    @Test
    public void testTrasladar() {
        cuadrado.trasladar(2, 3);

        assertEquals(2, cuadrado.getEsquina().getX());
        assertEquals(3, cuadrado.getEsquina().getY());
    }

    @Test
    public void testRotar() {
        // Solo comprobamos que el método se ejecuta sin errores
        assertDoesNotThrow(() -> cuadrado.rotar(90));
    }
}