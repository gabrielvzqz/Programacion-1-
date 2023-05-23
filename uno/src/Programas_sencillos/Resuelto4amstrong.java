package Programas_sencillos;

import java.util.Scanner;

public class Resuelto4amstrong {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num=0, centena=0,decena=0, unidad=0, suma=0, millar =0;
		System.out.println("Dime un número de cuatro cifras: ");
		num=sc.nextInt();
		millar=num/1000;
		centena=(num%1000)/100;
		decena=(num%100)/10;
		unidad=(num%100)%10;
		
		System.out.println("El millar es " + millar +", la centena es "+centena+", la decena es "+decena+" y la unidad es "+unidad+".");
		
		
		suma=(int)(Math.pow(centena, 4)+Math.pow(decena, 4)+Math.pow(unidad, 4)+Math.pow(millar, 4));
		
		if (num == suma)
			System.out.println(num+" es un número Armstrong.");
			else
				System.out.println(num+" no es un número Armstrong.");
				
				
				
		sc.close();
	}

}
