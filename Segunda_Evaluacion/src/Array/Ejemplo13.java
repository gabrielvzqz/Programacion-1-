package Array;

public class Ejemplo13 {

	public static void main(String[] args) {
		
		StringBuffer nombre = new StringBuffer("Pepe");
		
		System.out.println(nombre.length());
		System.out.println(nombre.capacity());
		
		StringBuffer nome = new StringBuffer("Juan Carlos");
		StringBuffer apelidos = new StringBuffer(" Moreno Pérez");
		nome.append(apelidos);
		System.out.println(nome);
		System.out.println(nome.length());
		System.out.println(nome.capacity());
		
		String adress = " Hispanidad 33";
		nome.append(adress);
		
		System.out.println(nome);
		System.out.println(nome.length());
		System.out.println(nome.capacity());

		String otroApe = "one Direction";
		nome.insert(nome.length(), otroApe);
		System.out.println(nome);
		System.out.println(nome.length());
		
		nome.insert(14, "nuevo");
		System.out.println(nome);
		System.out.println(nome.length());
	}
}
