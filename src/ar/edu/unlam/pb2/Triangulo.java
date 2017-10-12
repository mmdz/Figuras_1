package ar.edu.unlam.pb2;

import java.math.MathContext;

public  class Triangulo extends Figura implements Perimetro{
	
	private Double ladoA;
	private Double ladoB;
	private Double ladoC;
	
	//constructor
	public Triangulo(){
		super();
		this.ladoA = 0.0; 
		this.ladoB = 0.0; 
		this.ladoC = 0.0; 
	}

	public Triangulo(Double ladoA,Double ladoB,Double ladoC){
		//super(color); //llamo atrib del padre
		this.ladoA = ladoA; 
		this.ladoB = ladoB; 
		this.ladoC = ladoC; 
	}
	
	
	//metodos de abstracta
	@Override
	public Double calcularPerimetro() { //per = lA+lB+lC
		Double perimetro;		
		perimetro = this.ladoA + this.ladoB + this.ladoC;
			return perimetro;
	}
	
	//uso override para sobreescritura
	
	@Override  									
	public Double calcularArea() { //area = (base*altura)/2
		Double area; 		
		area = ((this.ladoA * this.ladoB)/2);
			return area;
	}

	@Override
	public void dibujarFigura(String color) {
		System.out.println("Se dibuja un triangulo de color "+ color +" ,con un area de "+ calcularArea() + " y un perimetro de " + calcularPerimetro());				
	}
	
	//metodos getter y setter para base y altura propios de  clase triangulo
	
	public Double getAltura(){
		return ladoB;
	}
	public void setAltura(Double altura){
		this.ladoB = altura;
	}
	
	public Double getBase(){
		return ladoA;
	}
	
	public void setBase(Double base){
		this.ladoA = base;
	}

//	public Double getLadoC() {
//		return ladoC;
//	}
//
//	public void setLadoC(Double ladoC) {
//		this.ladoC = ladoC;
//	}
//	
	

}
