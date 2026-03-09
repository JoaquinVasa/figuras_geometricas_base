# Proyecto de Figuras Geométricas

## Descripción del Proyecto

Este proyecto consiste en una implementación en Java de diversas figuras geométricas, específicamente un conjunto de clases que representan puntos y figuras como círculos. Utilizamos la herencia y la orientación a objetos para modelar figuras como el círculo, el cuadrado y el triángulo. Cada figura puede calcular su área, perímetro y ser transformada mediante rotación o translación. 

### Estructura:
- **Punto**: Representa un punto en el plano cartesiano.
- **FiguraGeometrica**: Clase base para todas las figuras geométricas (círculo, cuadrado, triángulo).
- **Circulo**: Una figura geométrica que representa un círculo con centro y radio.
  
## Integrantes del Equipo y Figuras Asignadas

- **Integrante 1**: Gabriel Villegas – *Círculo*.
- **Integrante 2**: Manuel López – *Cuadrado*.
- **Integrante 3**: Joaquín Vázquez – *Triángulo*.

## Instrucciones para Compilar, Ejecutar y Probar el Código

### Requisitos:
- Tener instalado **Java 8** o superior.
- Un editor de código como **Eclipse**, **IntelliJ IDEA** o un editor de texto simple junto con un terminal para compilar.

### Pasos para Compilar y Ejecutar:

1. **Clonar el Repositorio**:
   Si no tienes el repositorio localmente, clónalo usando el siguiente comando:
   ```bash
   git clone <url-del-repositorio>
# Proyecto Figuras Geométricas

## Descripción
Este proyecto implementa un conjunto de clases para representar figuras geométricas en un plano cartesiano.  
Permite calcular áreas y perímetros, manipular posiciones y realizar operaciones básicas como rotación y traslación.  
El proyecto está diseñado para servir como base de un sistema de geometría 2D y prácticas de programación orientada a objetos en Java.

## Integrantes del equipo
| Nombre | Figura asignada |
|--------|----------------|
| Joaquín Vázquez | Triangulo |
| Manuel López | Cuadrado |
| Gabriel Villegas | Círculo) |

## Estructura del proyecto
- `com.endes.figuras.FiguraGeometrica` → Clase abstracta base para todas las figuras.
- `com.endes.figuras.Cuadrado` → Clase que representa un cuadrado.
- `com.endes.figuras.Punto` → Clase que representa un punto en el plano cartesiano.

## Instrucciones de compilación y ejecución

1. **Compilar**
   Abre una terminal en el directorio raíz del proyecto y ejecuta:

   ```bash
   javac -d bin src/com/endes/figuras/*.java
