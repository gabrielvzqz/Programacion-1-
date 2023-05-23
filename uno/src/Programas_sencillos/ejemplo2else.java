package Programas_sencillos;

import java.util.Scanner;

public class ejemplo2else {
	
	public static void main(String[]args) {

	int matematicas, lengua;
	Scanner sc = new Scanner(System.in);
	System.out.println("Que nota has sacado en lengua? ");
	lengua = sc.nextInt();
	System.out.println("Que nota has sacado en matemáticas? ");
	matematicas = sc.nextInt();

	if (matematicas >= 5){
		if (lengua >= 5){
			System.out.println("Enhorabuena has aprobado lengua y matemáticas." ) ;
		}
			else {
		System.out.println("No has aprobado lengua inútil." ) ;
			}
	}
	else{
		if (lengua >= 5){
			System.out.println("No has aprobado matemáticas inútil." ) ;
		}
		else {
			System.out.println("No has aprobado nada vaya payaso." ) ;
			
			sc.close();
		

}	
}
}
}
