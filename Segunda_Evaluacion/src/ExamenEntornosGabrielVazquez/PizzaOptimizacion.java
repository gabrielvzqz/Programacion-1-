package ExamenEntornosGabrielVazquez;

public class PizzaOptimizacion {
	String frutas[] = { "platano", "fresa", "pomelo", "limon", "naranja", "pera" };

	/*
	 * Este método busca si una fruta está en la lista de frutas
	 * 
	 */

	/*
	 * He quitado los dos booleans innecesarios
	 */

	boolean busca(String frutaABuscar) {

		for (String fruta : frutas) {
			if (fruta.equals(frutaABuscar)) {
				return true;
			}
		}
		return false;
	}

	// Función que determine si hay alguna fruta repetida en la lista 
	 /*
	  * He cambiado el método para que funcione correctamente
	  */
	public boolean hayFrutaRepetida() {
        for (String fruta : frutas) {
            for (String j : frutas) {
                if (fruta == j) {
                    return true;
                }
            }
        }
		return false;
	}

	/* Este cuenta cuntas frutas hay de como minimo X letras */
	/*
	 *He quitado la variable num porque era innecesaria y 
	 *la division final de antes del return porque era errónea
	 */
	int cuentaFrutasConMinimoLetras(int minimoLetras) {
		int contador = 0;
		for (String fruta : frutas) {
			if (fruta.length() >= minimoLetras) {
				contador++;
			}
		}
		return contador;
	}

	/* Calcula la media de caracteres de todas las frutas */
	// En el ejemplo la media de todos los caracteres es 7+5+6+5+7+4 / 6 = 5.66^
	//Esta clase está bien
	float mediaCaracteres() {
		float suma = 0;
		for (String frase : frutas) {
			suma += frase.length();
		}
		return suma / frutas.length;
	}
	

	/*
	 * Por cada fruta, devuelve el numero de caracteres de cada fruta dividido por
	 * la media de caracteres totales
	 */
	/*
	 * Dividimos el numero de caracteres de cada fruta por la media total de
	 * caracteres
	 * 
	 * / [0.22, 1.16, 0.19, 0.16, 0.22, 0.13]
	 */
	/*Este método está bien*/
	float[] numerosCaracteresDivididoEntreMediaTotal() {
		float[] resultado = new float[frutas.length];
		for (int i = 0; i < frutas.length; i++) {
			resultado[i] = frutas[i].length() / mediaCaracteres();
		}
		return resultado;
	}
}