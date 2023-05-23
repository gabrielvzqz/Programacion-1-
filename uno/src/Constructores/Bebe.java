package Constructores;

public class Bebe {

	Bebe(int i){
		//this con string
		//Construir un objeto haciendo una llamada a otro constructor
		this("Soy un bebe consentido");
		System.out.println("Hola tengo "+ i +" meses.");
	}
	Bebe(String s){
		System.out.println(s);
	}
	public void berrea() {
		System.out.println("BUAAAAAAAAAAAAAAAAAAAAAAA");
	}
	public static void main(String[] args) {
		
		//uno no crea una referencia para manipular elobjeto creado
		new Bebe(8).berrea();
		/*Alternativa:
		 * Bebe tonto = new Bebe(8);
		 * tonto.berrea();*/
	}
}
