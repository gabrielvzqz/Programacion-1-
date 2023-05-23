package nosequees;

import java.util.Scanner;

public class potencial {

	public static int potIterando(int base, int exponente) {
		int potencia=1;
		for(int i=0;i<exponente; i++) {
			potencia=potencia*base;
			System.out.println(potencia);
		}
		return potencia;
	}
	public static int potRecursiva(int base, int exponente) {
		if (exponente==0)
			return 1;
		else if(exponente==1) 
			return base;
		else 
			return base*potRecursiva(base, exponente-1);
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int base=0;
		int exponente=0;
				;
		
		System.out.println("Introduce base: ");
		base=sc.nextInt();
		System.out.println("Introduce exponente: ");
		exponente=sc.nextInt();
		
		
		/*potencia=(int)Math.pow(base, exponente);*/
		System.out.println("La potencia de " + base + " elevado a " + exponente + " es igual a: " + potIterando(base,exponente));
		System.out.println("__________________________________________________________________________________________________");
		System.out.println("La potencia de " + base + " elevado a " + exponente + " es igual a: " + potRecursiva(base,exponente));

		sc.close();
	}

}
