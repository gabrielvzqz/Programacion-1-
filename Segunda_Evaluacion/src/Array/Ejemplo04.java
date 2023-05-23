package Array;

public class Ejemplo04 {
	
	public static void mostrarArray( char[] arr) {
		System.out.print("[ ");
		for(int j=0; j<arr.length;j++) {
			System.out.print(arr[j] + " ");
		}
		System.out.print("]");
		System.out.println();
	}
	
	public static void main(String[] args) {

		
		
		char[] nombre1 = {'p', 'e', 'p', 'e'};
		char[] nombre2 = {112, 101, 112, 101};
		char[] nombre3 = new char[4];
		
		mostrarArray(nombre1);
		mostrarArray(nombre2);
		mostrarArray(nombre3);
		
		System.out.println("Longitud de array " + nombre1.length);
		
		System.out.println(nombre1);		
		System.out.println(nombre2);
		System.out.println(nombre3);
		
		String st="Hola me llamo María Victoria";
		System.out.println(st);
		System.out.println(st.length());
		
		System.out.println(st.charAt(12));
	
	}

}