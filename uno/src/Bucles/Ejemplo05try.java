package Bucles;

public class Ejemplo05try {
	
	
	public static void main(String[]args) {
		int a=10, b=0,c = 0;
		try{
			c=a/b;
		} catch (Exception e) { 
			System.out.println("BOOOOOOOOOOOMBA");
		}
		System.out.println("El resultado es: "+c);
	}
}
