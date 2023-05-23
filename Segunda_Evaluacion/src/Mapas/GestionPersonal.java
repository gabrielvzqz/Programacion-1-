package Mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GestionPersonal {

	static HashMap<Integer, String> gp = new HashMap<Integer, String>();

	public static void poblarMap() {
		gp.put(924, "Amalia Núñez");
		gp.put(921, "Cindy Nero");
		gp.put(700, "César Vázquez");
		gp.put(219, "Víctor Tilla");
		gp.put(537, "Alan Brito");
		gp.put(605, "Esteban Quito ");
	}
	
	public static void listar() {
		for (Map.Entry pareja : gp.entrySet()) {
			System.out.println(pareja);
		}
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opc = 0;
		boolean seguir = true;

		poblarMap();
		do {
		System.out.println("Gestion de personal");
		System.out.println("____________________");
		System.out.println("Seleccione una opcion");
		System.out.println("1 - Listar");
		System.out.println("2 - Añadir");
		System.out.println("3 - Modificar");
		System.out.println("4 - Borrar");
		System.out.println("5 - Salir");
		opc = Integer.parseInt(sc.nextLine());

			switch (opc) {

			// Listar
			case (1):
				listar();
				break;

			// Añadir
			case (2):
				System.out.println("Introduce una clave: ");
			int clave = Integer.parseInt(sc.nextLine());
			if(gp.containsKey(clave))
				System.out.println("Clave ya existente.");
			else
			System.out.println("Introduce nombre persona: ");
			String nombre = sc.nextLine();
			gp.put(clave, nombre);
			listar();
			break;

			// Modificar
			case (3):
				System.out.println("Introduce una clave: ");
			int claveN = Integer.parseInt(sc.nextLine());
			if(gp.containsKey(claveN)) {
				System.out.println("Valor actual: " + gp.get(claveN));
				System.out.println("Introduce nuevo valor: ");
				String nombreN = sc.nextLine();
				gp.put(claveN, nombreN);
			}
			else
				System.out.println("Clave no existente.");
			listar();
				break;

			// Borrar
			case (4):
				System.out.println("Introduce una clave: ");
			int claveB = Integer.parseInt(sc.nextLine());
			if(gp.containsKey(claveB)) {
			gp.remove(claveB);
			}else
				System.out.println("Clave no existente.");
			listar();
				break;

			// Salir
			case (5):
				seguir = false;
				System.out.println("Gracias por usar gestión.");
				break;
			}
		} while (seguir);
		sc.close();

	}
}
