package Programas_sencillos;

import java.util.Scanner;

public class ejercicioluckynumber {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int dia, mes,ano;
		int ln=0;

		System.out.println("Día: ");
		dia=sc.nextInt();
		System.out.println("Mes: ");
		mes=sc.nextInt();		
		System.out.println("Año: ");
		ano=sc.nextInt();
		ln=dia+mes+ano;
		
		System.out.println("Tu lucky number es: "+ln);
		sc.close();
	}
}
