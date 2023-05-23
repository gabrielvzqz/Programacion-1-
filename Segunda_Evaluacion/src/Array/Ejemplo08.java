package Array;

public class Ejemplo08 {

	public static void main(String[] args) {
		
		String cad1 = "EMMA";
		String cad2 = new String("EMMA");
		
		//con equals

		if (cad1.equals(cad2)) {
			System.out.println("Son iguales.");
		}
		else {
			System.out.println("No son iguales.");	
		}
		//con ==
		if (cad1==cad2) {
			System.out.println("Son iguales.");
		}
		else {
			System.out.println("No son iguales.");	
		}
	}
}
