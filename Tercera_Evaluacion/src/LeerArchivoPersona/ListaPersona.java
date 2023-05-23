package LeerArchivoPersona;

import java.util.ArrayList;

public class ListaPersona {

	ArrayList<Persona> listaPersonas;

	public ListaPersona() {
		listaPersonas = new ArrayList<>(); // Crea el vector de la persona
	}

	public void añadirPersona(Persona p) {
		listaPersonas.add(p); // Crea el vector de la persona
	}

	public void eliminarPersona(int i) {
		if (i < listaPersonas.size()) {
			listaPersonas.remove(i);
		} // Crea el vector de la persona
		else {
			System.out.println("Indice erroneo");
		}
	}

	public void borrarLista() {
		listaPersonas.removeAll(listaPersonas); // Crea el vector de la persona
		System.out.println("Lista vacia");
	}

	public void listar() {
		for (int i = 0; i < listaPersonas.size(); i++) {
			System.out.println("Posicion: " + i + listaPersonas.get(i).toString());
		}
	}
}
