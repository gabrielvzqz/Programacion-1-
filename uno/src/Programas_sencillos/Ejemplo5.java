package Programas_sencillos;

import java.util.Scanner;

public class Ejemplo5 {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		int Di=0;
		int d=0; 
	    int cociente;
        int resto;
        System.out.println("porfavor introduzca el dividendo");
        Di=sc.nextInt();
        System.out.println("Introduzca el divisor" );
        d=sc.nextInt();
        cociente=Di/d;
        resto= Di%d;
        System.out.println(Di+" entre " + d + " es "+ cociente+ " y el resto es "+ resto);
        sc.close();
	}

}
