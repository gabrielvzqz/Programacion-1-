package Estructuras_Dinamicas;

import java.util.List;
import java.util.ArrayList;

public class Ejercicio17Lista2 {

	public static void main(String[] args) {
		
		List listOfString = new ArrayList();
		listOfString.add("hola");
		listOfString.add("adios");
		listOfString.add(12);
		
		Ejercicio17ListaClaseAlumno nuevo = new Ejercicio17ListaClaseAlumno("Manolo", 21);
		listOfString.add(nuevo);
		
		List auxListOfString = new ArrayList();
		auxListOfString.addAll(listOfString);
		
		Ejercicio17ListaClaseAlumno alfa = new Ejercicio17ListaClaseAlumno("Carlos", 22);
		Ejercicio17ListaClaseAlumno beta = new Ejercicio17ListaClaseAlumno("Ana", 24);
		Ejercicio17ListaClaseAlumno gamma = new Ejercicio17ListaClaseAlumno("Lucas", 23);
		Ejercicio17ListaClaseAlumno delta = new Ejercicio17ListaClaseAlumno("Marta", 21);

		List otraLista = new ArrayList();
		otraLista.add(nuevo);
		otraLista.add(alfa);
		otraLista.add(beta);
		otraLista.add(gamma);
		otraLista.add(delta);

		
		System.out.println(listOfString);
		System.out.println(auxListOfString);
		
		System.out.println(otraLista);
		
		for(int i =0; i<otraLista.size();i++) {
			System.out.println(((Ejercicio17ListaClaseAlumno)otraLista.get(i)).getNombre());
			System.out.println(((Ejercicio17ListaClaseAlumno)otraLista.get(i)).getEdad());
		}
	}
	
	//clase interna --> inner class

		 
	}