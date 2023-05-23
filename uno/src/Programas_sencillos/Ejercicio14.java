package Programas_sencillos;

public class Ejercicio14 {

	public static void main(String[] args) {
		 int idato=5;
		 byte bdato;
		 float chico;
		 double grande=3.154D;
		 double despues;
		 
		 bdato=(byte)idato;
		 chico= (float) grande;
		 despues=chico;
		 
		 System.out.println(bdato);//sacará 5 x pantalla
		 System.out.println("Mostrando valor de grande"+ grande);
		 System.out.println("Mostrando valor de chico"+ chico);
		 System.out.println("Mostrando el valor de la variable despues" + despues);
	}

}