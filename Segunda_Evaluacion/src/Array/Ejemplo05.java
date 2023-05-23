package Array;

public class Ejemplo05 {
	
	public static void main(String[] args) {
		
		String cad1 = "Pepe";
		String cad2 = new String("Lionel");
		String cad3 = new String(cad2);
		
		System.out.println(cad1);
		System.out.println(cad2);
		System.out.println(cad3);
		
		System.out.println(cad2.hashCode());
		System.out.println(cad3.hashCode());

		System.out.println(cad2.equals(cad3));
		String cad4 = "CHELO";
		System.out.println(cad4.length());
		
		//Como concatenar cadenas
		
		String cad5 = "Andy";
		cad5 = cad5.concat(" y Lucas");
		System.out.println(cad5.toString());
		System.out.println(cad5);

	}

}
