package Constructores;

public class Pajaro {
	private char color; // propiedad o atributo color
	private int edad; // propiedad o atributo edad
	Pajaro(){
		
	}
	
	
	Pajaro(char color,int edad){
		this.color=color;
		if (edad >= 0) {
			this.edad=edad;
		}
		else {
			System.out.println("Nos se admiten edades negativas!!");
			this.edad=0;
		}
	}
	//*** métodos de la clase ****

	public void setedad(int e) {
		edad = e;
	}

	public void printedad() {
		System.out.println(edad);
	}

	public void setcolor(char c){
		color=c;}


	public void printcolor(){
			switch(color){
				//Los pájaros son verdes, amarillos, grises, negros o blancos
				//No existen pájaros de otros colores
		case 'v': System.out.println("Verde.");
			break;
		case 'a': System.out.println("Amarillo.");
			break;
		case 'g': System.out.println("Gris.");
			break;
		case 'n': System.out.println("Negro.");
			break;
		case 'b': System.out.println("Blanco.");
			break;

default: System.out.println("Color no establecido.");
			}
	}

	public char getColor() {
		return color;
	}

	public void setColor(char color) {
		this.color = color;
	}
	public void volar() {
		System.out.println("Me voy volando.");
	}
	public void cantar() {
		System.out.println("pio pio");
	}

	public int getEdad() {
		return edad;
	}


	@Override
	public String toString() {
		return "Pajaro [color=" + color + ", edad=" + edad + "]";
	}
}