package Constructores;

public class testmatematico {
	
	public static void main(String[] args) {
		
		suma s = new suma();
		System.out.println("la suma es " + s.suma(3, 5));
		
		s.suma(3,  5);
		
		potencia p = new potencia();
		System.out.println("La potencia es " + p.potencia(3, 5));
	}

}
