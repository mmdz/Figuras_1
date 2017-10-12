package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTriangulo {

	@Test
	public void testQueCreaTriangulo() {
		Triangulo miTriangulo = new Triangulo();
		miTriangulo.setAltura(2.5);
		miTriangulo.setBase(4.9);
		
		miTriangulo.dibujarFigura("amarillo");
	}
	
	@Test
	public void testQueCreaTrianguloConParametros() {
		Triangulo miTriangulo = new Triangulo(2.5,4.1,3.0);
		
		Double area = miTriangulo.calcularArea();
		Double perimetro = miTriangulo.calcularPerimetro();
		
		miTriangulo.dibujarFigura("amarillo");
		
		assertTrue(area.equals(5.125));
		assertTrue(perimetro.equals(9.6));
	}
		
	@Test
	public void testQueCalculaAreaDeUnTriangulo() {
		Triangulo miTriangulo = new Triangulo();
		miTriangulo.setAltura(4.0);
		miTriangulo.setBase(2.2);
		Double area = miTriangulo.calcularArea();
		
		miTriangulo.dibujarFigura("amarillo");
		
		assertTrue(area.equals(4.4));
	}	
	
	@Test
	public void testQueCalculaPerimetroDeUnTriangulo() {
		
		Triangulo miTriangulo = new Triangulo(7.0,2.0,3.0); //con parametros
		Double perimetro = miTriangulo.calcularPerimetro();
		miTriangulo.dibujarFigura("amarillo");
		
		assertTrue(perimetro.equals(12.0));
	}	

}
