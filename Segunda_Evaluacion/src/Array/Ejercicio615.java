package Array;

public class Ejercicio615 {

	public static String obtenerCadenaMasLarga(String[] arr) {
		int posicion=0;
		int longitud=0;
		for (int i=0; i<arr.length;i++) {
			if(arr[i].length()>longitud){
				posicion=i;
				longitud=arr[i].length();
			}
		}
			System.out.println("La cadena mas larga es " + posicion + " con " + longitud + " letras.");
			return arr[posicion];
	}
	
	public static void main(String[] args) {
		
		String parrafo = "v are uvhj bkhbk bkjhkj bjkjrf   rgauil"
				+ " fidrjsgiedrjs  oigea rgoiñrea goiea oi ioeajui ogesw mvmhjhbjhapo "
				+ "jfilesw j oaswpg po poaw oigp op iore ipoa";		
		String cads[] = parrafo.split(" ");
		
		
		System.out.println(obtenerCadenaMasLarga(cads));
	}
}
