package ar.edu.unlam.pb2;

public abstract class Figura { //creo clase abstracta

	protected String color; //atributo
	
	//creo metodo abstracto de la clase super
	
	public abstract Double calcularArea();
	public abstract void dibujarFigura(String color);

	
	//Que el mismo objeto se comporte de diferentes maneras se llama polimorfismo
	
	//Para que pueda heredar de otra clase, usa una interfaz
	
	
	//constructores
	public Figura(){
		this.color = "Azul";
	}
	
	public Figura(String color){
		this.color = color;
	}
	
	//getter y setter de color
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
}
