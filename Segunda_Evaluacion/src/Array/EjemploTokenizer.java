package Array;

import java.util.StringTokenizer;

public class EjemploTokenizer {

	public static void main(String[] args) {
		
		StringTokenizer str;
		str = new StringTokenizer("UNO DOS TRES PERICO JUANICO Y ANDRES");
		System.out.println("La cadena str tiene " + str.countTokens() + " elementos");
	}
}
