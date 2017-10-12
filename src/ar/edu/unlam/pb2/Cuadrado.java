package ar.edu.unlam.pb2;

public class Cuadrado extends Figura implements Perimetro{ //lo asocio a interface 

	private Double ladoA;
	private Double ladoB;
	
	//constructores
	public Cuadrado(){
		//super();
		this.ladoA = 0.0;
		this.ladoB = 0.0;
	}	
	public Cuadrado(Double ladoA, Double ladoB){
		//super(color);
		this.ladoA = ladoA;
		this.ladoB = ladoB;
	}
	
 //metodos abstractos	
	@Override
	public Double calcularPerimetro() { //per = (suma lados) o (lado*4)
		   
		Double perimetro;		//variables locales
		perimetro = (this.ladoA*2)+(this.ladoB*2);
		
		return perimetro;
	}

	@Override
	public Double calcularArea() { //area= lado^2
		Double area; 
		area = (this.ladoA * this.ladoB);  
		return area;		
	}

	@Override
	public void dibujarFigura(String color) {
		
		System.out.println("Se dibuja un cuadrado de color "+color+" ,con un area de "+ calcularArea() + " y un perimetro de " + calcularPerimetro());		
	}	
	
//getter setter lado A y B	
	public Double getLadoA() {
		return ladoA;
	}

	public void setLadoA(Double ladoA) {
		this.ladoA = ladoA;
	}

	public Double getLadoB() {
		return ladoB;
	}

	public void setLadoB(Double ladoB) {
		this.ladoB = ladoB;
	}

	
}
