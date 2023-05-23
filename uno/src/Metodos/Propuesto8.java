package Metodos;
/*Realiza un programa que genere letras de manera aleatoria 
 *y determine si son vocales o consonantes*/

public class Propuesto8 {
	
	
	public static char getLetras() {
		return (char) (Math.random()*26+'a');
		

	}
	public static void main(String[] args) {
	int numero=0;
	char c;
		
	for(int i=0; i<15;i++) {
		
		c=getLetras();
		System.out.println("Generados: "+ c);
		 if (   (c=='a') || (c=='e') || (c=='i') || (c=='o') || (c=='u')  ) {
			 	numero++;  //numero=numero+1; contamos una vocal más//
			 	System.out.println("Vocal");
		 }
		else {
			System.out.println("Consonante");
		 	}
		}
	System.out.println("Hemos generado "+numero+" vocales");
	System.out.println("Hemos generado "+(15-numero)+" consonantes");

	}
}