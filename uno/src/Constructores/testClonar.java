package Constructores;

public class testClonar {
	
	public static void main(String[] args) {
		
		rectangulo r1 = new rectangulo(5,7, "Alberto");
		rectangulo r2 = (rectangulo) r1.clone();
		r2.incrementaAncho();
		r2.incrementaAlto();
		r1.setNombre("Chiquito");
		r2.setNombre("Grande");
		
		
		
	}

}
