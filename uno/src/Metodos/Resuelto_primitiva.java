package Metodos;

public class Resuelto_primitiva {

	public static int dameUnNumero() {
		int numero=0;
		numero=(int) (1+ Math.random() * ((49+1)-1));
		return numero;
	}

	public static void main(String[] args) {

		// llamamos seis veces al método obteniendo 6 números enteros.
		
		for(int i=0;i<100;i++) {
		System.out.println("generando: " + dameUnNumero());
	}
	}
}