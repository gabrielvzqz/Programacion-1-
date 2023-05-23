package Constructores;
import java.util.Scanner;

public class testconstructor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String m;
		double v;
		while(true) {
		System.out.println("Valor: ");
		v=sc.nextDouble();
		System.out.println("¿Que unidad es? ");
		m=sc.next();
		peso uno=new peso(v,m);
		
		System.out.println("¿A que unidad desea convertirlo? ");
		m=sc.next();
		
		System.out.println(uno.toString()+" en kilos");
		sc.close();
	}
}
}
