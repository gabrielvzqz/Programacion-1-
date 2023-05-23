package ExamenGabrielVazquez;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ejercicio5A {

	public static void main(String[] args) {

		ArrayList<Alumno> alumno = new ArrayList<Alumno>();

		String NombreIntroducido;
		double NotaIntroducida;
		int opcion;
		Scanner s = new Scanner(System.in);

		// MENÚ
		do {
			System.out.println("\nLISTADO\n=======");
			System.out.println("1. Poblar lista");
			System.out.println("2. Añadir alumno");
			System.out.println("3. Listar nombres y notas");
			System.out.println("4. Listar por orden alfabetico");
			System.out.println("5. Listar por notas");
			System.out.println("6. Eliminar un alumno");
			System.out.println("7. Salir");
			System.out.print("Introduzca una opción: ");
			opcion = Integer.parseInt(s.nextLine());

			switch (opcion) {

			// POBLAR LISTA
			// //////////////////////////////////////////////////////////////////
			case 1:
				do {
					alumno.add(new Alumno("Gabriel", 50));
					alumno.add(new Alumno("Mario", 46));
					alumno.add(new Alumno("Pablo", 42));
					alumno.add(new Alumno("Diego", 36));
					alumno.add(new Alumno("Iago", 12));

				} while (opcion != 7);

				break;

			// AÑADIR ALUMNO //////////////////////////////////////////////////////////////
			case 2:
				System.out.println("\nAñadir alumno\n===========");

				System.out.println("Por favor, introduzca los datos del alumno.");
				System.out.print("Nombre: ");
				NombreIntroducido = s.nextLine();
				System.out.print("Nota: ");
				NotaIntroducida = s.nextInt();

				alumno.add(new Alumno(NombreIntroducido, NotaIntroducida));

				while (opcion != 7);
				
				break;

			// LISTAR NOMBRES Y NOTAS
			// ////////////////////////////////////////////////////////////////
			case 3:
				for (Alumno d : alumno) {
					System.out.println(d);
				}

				while (opcion != 7);
				
				break;
			// LISTAR NOMBRES Y NOTAS POR ORDEN ALFABETICO// ////////////////////////////////////////////////////////////////
			case 4:
				for (Alumno d : alumno) {
					System.out.println(d);
				}

				while (opcion != 7);
				
				break;
			// LISTAR NOMBRES Y NOTAS POR NOTAS// ////////////////////////////////////////////////////////////////
			case 5:
				Collections.sort(alumno);
				for (Alumno d : alumno) {
					System.out.println(d);
				}

				while (opcion != 7);
				
				break;

			// BORRAR ///////////////////////////////////////////////////////////////////
			case 6:
				System.out.println("\nBORRAR\n======");

				System.out.print("Por favor, introduzca el nombre del alumno que desea borrar: ");
				NombreIntroducido = s.nextLine();

				if (!alumno.contains(new Alumno(NombreIntroducido, 0))) {
					System.out.println("Lo siento, el alumno introducido no existe.");
				} else {
					alumno.remove(alumno.indexOf(new Alumno(NombreIntroducido, 0)));
					System.out.println("Album borrado.");
				}
				while (opcion != 7);
				
				break;
			}
			s.close();
		} while (opcion != 7);
	}
}
