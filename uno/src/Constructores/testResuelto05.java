package Constructores;

public class testResuelto05 {

	public static void main(String[] args) {
		
		//Creo un satelite sin atributos
		
		Resuelto05 satelite = new Resuelto05();
		
	
		//Doy atributos al satélite
		
		satelite.setPosicion(3.5, 4.5, 12.7);

		//Uso un syso para mostrar los atributos del satélite por consola
		
		System.out.println(satelite.toString());
		
		//Creo un satelite con atributos

		Resuelto05 sateliteroto = new Resuelto05(4, 5, 6);
			
		//Uso un syso para mostrar los atributos del satélite por consola
		
		System.out.println(sateliteroto.toString());
		
	}

}
