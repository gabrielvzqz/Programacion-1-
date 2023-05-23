package nosequees;

import java.util.Scanner;

public class contar {
	
	public static int Contardigitos(int numero) {
		if(numero/10==0)
			return 1;
		else
			return 1 + Contardigitos(numero/10);
	}
	
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		int numero=0;
		
		System.out.println("Introduce numero: ");
		numero=sc.nextInt();


		System.out.println("El numero " + numero + " tiene " + Contardigitos(numero) + " cifras.");
		System.out.println("__________________________________________________________________________________________________");
	
		int res=0;
		int inv=0;
		int aux=numero;
		int cifras=Contardigitos(numero);
		
		while(aux!=0) {
			res=aux%10;
			aux=aux/10;
			inv= (int) (inv + (res*Math.pow(10, cifras-1)));
			cifras--;
			
			
			
		}			
		sc.close();
			

}
}