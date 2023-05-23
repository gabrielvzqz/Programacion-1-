package Constructores;

public class testrectangulo {
	
	public static void main(String[] args) {

		rectangulo otro = null;
		rectangulo r1 = new rectangulo(8, 10, "Manolo");
		System.out.println("r1: " + r1.toString());
		
		otro = r1.incrementaAlto();
		
		System.out.println("Son r1 y otro el mismo objeto? " + r1.equals(otro));
		System.out.println("r1: " + r1.toString());
		System.out.println("otro: " + otro.toString());
		
		r1.incrementaAncho();
		System.out.println("r1: " + otro.toString());
		System.out.println("otro: " + otro.toString());
		
		System.out.println("r1: " + r1.hashCode());
		System.out.println("otro: " + otro.hashCode());

		//voy a probar el método clone
		rectangulo clo = (rectangulo) (r1.clone());
		System.out.println("clo: " + clo.toString());
	}

}
