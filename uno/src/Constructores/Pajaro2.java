package Constructores;

public class Pajaro2 {

	// *** atributos o propiedades ****
	//atributo DE CLASE
	
	private static int numpajaros = 0;
	
	//Los de siempre
	
	private char color; // propiedad o atributo color
	private int edad; // propiedad o atributo edad

	// *** métodos de la clase ****
	//metodo de clase que incrementa el numero de pajaros existentes en uno
	
	static void nuevopajaro() {
		numpajaros++;
	};

	Pajaro2() {
		color = 'v';
		edad = 0;
		nuevopajaro();
		muestrapajaros();
	}

	Pajaro2(char c, int e) {
		color = c;
		edad = e;
		nuevopajaro();
	}

	
	//metodo dinamico o de objeto
	@Override
	public String toString() {
		return "Pajaro2 [color=" + color + ", edad=" + edad + "]";
	}

	//metodo DE CLASE no necesito ningun metodo para llamarlo
	static void muestrapajaros() {
		System.out.println(numpajaros);
	}

}
