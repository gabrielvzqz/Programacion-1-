package Array;

public class Ejemplo09 {
	public static void mostrarArray(char[] arr) {
		System.out.print("[ ");
		for(int j=0; j<arr.length;j++) {
			System.out.print(arr[j] + " ");
		}
		System.out.print("]");
		System.out.println();
	}
	

	public static void main(String[] args) {
		
		String cad1 = "        MAYKA es mi TIA";
		
		System.out.println(cad1.trim());
		
		String cad2 = "Pedro ruiz";
		System.out.println(cad2.toLowerCase());
		
		System.out.println(cad2.toUpperCase());
		
		
		//Conversion de un objeto String en un ARRAY DE CARACTERES
		String cad5 = "Hola mundo";
		
		char[] arr = cad5.toCharArray();
		mostrarArray(arr);
		
		//Como convertir un ARRA DE CARACTERES en un objeto String
		
		String nuevo = new String(arr);
		
		System.out.println(nuevo);
	}
}
