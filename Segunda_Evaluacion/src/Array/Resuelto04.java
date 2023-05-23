package Array;

import java.util.Arrays;

public class Resuelto04 {
	
	public static int[] obtenerLongCadenas(String[] arr) {
		int[] largos = new int[arr.length];
		
		for(int i = 0; i<arr.length;i++) {
			//System.out.println("Largo de las cadenas: " + i + " es " + arr[i].length());		
			largos[i]=arr[i].length();
			}
		return largos;
	}
	
	public static int obtenerSumaTotal(String[] arr) {
		
		int total = 0;
		for(int i = 0; i<arr.length;i++) {
			//System.out.println("Largo de las cadenas: " + i + " es " + arr[i].length());
			total+=arr[i].length();
		}
		return total;
	}
	
	public static void main(String[] args) {
		
		String parrafo = "vnrdgaev arehgkjvhadrghkjdrfanbgvkjdhnakjrf   rgauil"
				+ " fidrjsgiedrjs  oigea rgoiñrea goiea oi ioeajui ogeswapo "
				+ "jfilesw j oaswpg po poaw oigp op iore ipoa";
		String cads[] = parrafo.split(" ");
		
		System.out.println("Total de caracteres: " + obtenerSumaTotal(cads));
		
		System.out.println(Arrays.toString(obtenerLongCadenas(cads)));
	}

}