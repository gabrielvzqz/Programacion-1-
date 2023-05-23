package LeerArchivo;

public class TEST {

	public static void main(String[] args) throws Exception {
		Asignatura asignatura = new Asignatura(45684, "DAM", 5464);
		asignatura.escribirAsignatura();
		asignatura.leerAsignatura();
	}
}
