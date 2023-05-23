package LeerArchivoPersona;

public class TEST {

	public static void main(String[] args) {
		
		ListaPersona alumnos = new ListaPersona();
		
		alumnos.añadirPersona(new Persona("Paco", "cojones", "1234", "Rúa P 8"));
		alumnos.añadirPersona(new Persona("joaco", "bobo", "234", "Rúa P 8"));
		alumnos.añadirPersona(new Persona("fer", "bobo", "124", "Rúa P 8"));
		alumnos.añadirPersona(new Persona("gabo", "bobo", "12", "Rúa P 8"));
		alumnos.listar();
		
		alumnos.eliminarPersona(5);
		alumnos.listar();
		alumnos.borrarLista();
		
	}
}
