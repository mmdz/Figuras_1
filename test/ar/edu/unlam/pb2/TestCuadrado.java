package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCuadrado {

	@Test
	public void testQueCreaCuadrado() {
		//Figura miFigura = new Figura(); No puede instanciarse porque es una clase ABSTRACTA
		
		Cuadrado miCuadrado = new Cuadrado(); 
		miCuadrado.setLadoA(2.0);
		miCuadrado.setLadoB(2.0);		
		
		miCuadrado.dibujarFigura("Rojo");
	
	}
	
	@Test
	public void testQueCalculAreaDeUnCuadrado() {
		Cuadrado miCuadrado = new Cuadrado(); 
		miCuadrado.setLadoA(4.0);
		miCuadrado.setLadoB(4.0);		
		
		Double area = miCuadrado.calcularArea();
	
	assertTrue(area.equals(16.0));
	}	
	
	@Test
	public void testQueCalculaPerimetroDeUnCuadrado() {
		Cuadrado miCuadrado = new Cuadrado(); 
		miCuadrado.setLadoA(3.5);
		miCuadrado.setLadoB(3.5);		
		
		Double perimetro = miCuadrado.calcularPerimetro();
	
		assertTrue(perimetro.equals(14.0));
	}
	

}
