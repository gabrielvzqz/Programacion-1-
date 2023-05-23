package Array;

public class Ejemplo14 {

	public static void main(String[] args) {
		
		StringBuffer nome = new StringBuffer("torreon");
		nome.reverse();
		System.out.println(nome);
		
		StringBuffer modulo = new StringBuffer("Lenguaje de marcas y sistemas de gestión de información.");
		modulo.delete(21, 37);
		System.out.println(modulo);
		
		modulo.replace(0, 11, "Lenjuage de");
		System.out.println(modulo);
		
		//OJO al método substring =========> devuelve un STRING
		String inmuta =modulo.substring(0, 23);
		System.out.println(inmuta);
		
		//OJO devuelve un String
		String fin = modulo.toString();
		
		System.out.println("Cadena: '" + fin + "', tiene un tamaño de: " + fin.length());
	}	
}
