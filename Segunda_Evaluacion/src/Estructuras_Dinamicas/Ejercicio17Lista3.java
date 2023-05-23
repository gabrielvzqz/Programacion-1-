package Estructuras_Dinamicas;

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class Ejercicio17Lista3 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Hola");
		list.add("Adios");
		list.add("Hi");
		Iterator itr = list.iterator();// getting the Iterator
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		// también se puede hacer con lambda
		list.forEach(str -> System.out.println(str));

		ArrayList<Ejercicio17ListaClaseAlumno> clase = new ArrayList<Ejercicio17ListaClaseAlumno>();

		Ejercicio17ListaClaseAlumno nuevo = new Ejercicio17ListaClaseAlumno("Manolo", 21);
		clase.add(nuevo);

		List auxListOfString = new ArrayList();
		clase.add(nuevo);
		
		Ejercicio17ListaClaseAlumno alfa = new Ejercicio17ListaClaseAlumno("Carlos", 22);
		Ejercicio17ListaClaseAlumno beta = new Ejercicio17ListaClaseAlumno("Ana", 24);
		Ejercicio17ListaClaseAlumno gamma = new Ejercicio17ListaClaseAlumno("Lucas", 23);
		Ejercicio17ListaClaseAlumno delta = new Ejercicio17ListaClaseAlumno("Marta", 21);
		
		clase.add(nuevo);
		clase.add(alfa);
		clase.add(beta);
		clase.add(gamma);
		clase.add(delta);
		
		Iterator it= clase.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}
