package Programas_sencillos;

import java.util.Scanner;

public class Propuesto6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ladomayor=0;
		int ladomenor=0;
	    System.out.println("Porfavor introduzca el lado mayor ");
	    ladomayor=sc.nextInt();

	    System.out.println("Porfavor introduzca el lado menor ");
	    ladomenor=sc.nextInt();

	    System.out.println("El perimetro vale "+(2*ladomayor+2*ladomenor)+"m y el area "+ladomayor*ladomenor+"m^2.");
	    sc.close();

	}

}
