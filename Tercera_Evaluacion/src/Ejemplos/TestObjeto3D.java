package Ejemplos;

public class TestObjeto3D {

	public static void main(String[] args) {
		
		Objeto3D Caja = new Objeto3D();
		Objeto3D Esfera = new Objeto3D();
		Objeto3D Bicicleta = new Objeto3D();

		Caja.Dimensiones(20.0,12.5,30.2,"Centimetros");
		Esfera.Dimensiones(10.0,22.5,16.2,"Centimetros");
		Bicicleta.Dimensiones(11.0,34.5,67.2,"Centimetros");

		System.out.println(Bicicleta.getTipoMedida());
		System.out.println(Bicicleta.getX());
		
		Bicicleta.Dimensiones("pulgadas");
		
		System.out.println(Bicicleta.getTipoMedida());
		System.out.println(Bicicleta.getY());
		
		System.out.println(Caja);
		System.out.println(Esfera);
		System.out.println(Bicicleta);
	}
	
}
