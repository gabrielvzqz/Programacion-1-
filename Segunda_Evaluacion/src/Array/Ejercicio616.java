package Array;

public class Ejercicio616 {

	public static void ObtenerCincoVocales(String[] arr) {
		
		//int posicion=0;
		//int longitud=0;
		for (int k=0; k<arr.length;k++) {
			System.out.println("Cadena " + k + " es " + arr[k]);
			boolean a =false;
			boolean e =false;
			boolean i =false;
			boolean o =false;
			boolean u =false;
			
			for(int j=0; j<arr[k].length();j++){
				
				/*System.out.println("Carácter: " + j + " es: " + arr[k].charAt(j) + " ");*/
				char letra= arr[k].charAt(j);
				if(letra=='a') a = true;
				if(letra=='e') e = true;
				if(letra=='i') i = true;
				if(letra=='o') o = true;
				if(letra=='u') u= true;


		}
			if(a&&e&&i&&o&&u==true) {
				System.out.println("Esta cadena tiene las cinco vocales");
				System.out.println();

			}
			else {
				System.out.println("Esta cadena no tiene las cinco vocales");
				System.out.println();

			}
		}
	}
	public static void main(String[] args) {
		
		String parrafo = "v are uvhj aeiou bkjhkj aeiou   rg";		
		String cads[] = parrafo.split(" ");	
		
		ObtenerCincoVocales(cads);

	}
}
