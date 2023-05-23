package Constructores;

public class testCoche {
	public static void main(String[] args) {
		
		Ejemplocoche npi = new Ejemplocoche();
		Ejemplocoche feo = new Ejemplocoche(4, "marron", "ni_se_sabe", "antiguo", 2, 7.32, 14);
		Ejemplocoche molon =new Ejemplocoche(7, "rojo", "nesquik", "wall-e", 0, 0.34, 4050);
		
		feo.acelerar(100);
		feo.arrancar();
		feo.frenar();
		feo.pasarITV();
		System.out.println(feo.equals(molon));
		
		System.out.println(feo.toString());
		System.out.println(molon.toString());
		feo.color="dorado que lo flipas";
		System.out.println(feo.toString());
			
		System.out.println(npi.toString());
	}

}
