package LeerArchivo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class TESTlista {
	
	@SuppressWarnings({"unchecked"})
	public static void main(String[] args) {
		
		//para escribir a fichero
		ArrayList<Asignatura> arrayEscribir = new ArrayList<Asignatura>();
		//para leer de fichero
		ArrayList<Asignatura> arrayleer;
		
		System.out.println("Asignaturas que vamos a escribir en el fichero: ");
		for(int i = 0; i< 5; i++) {
			Asignatura nuevoObjeto = new Asignatura(i, "Cadena " +  i,5*i);
			arrayEscribir.add(nuevoObjeto);
			System.out.println("arrayList1["+i+"] = " + 
			arrayEscribir.get(i).toString());
		}
		
		try {
			System.out.println("Guardamos ArrayList en el fichero objetos.dat...");
			
			//escritura
			ObjectOutputStream escribiendoFichero = new ObjectOutputStream(new FileOutputStream("objetos.dat"));
			//escribe todo el ArrayList
			escribiendoFichero.writeObject(arrayEscribir);
			escribiendoFichero.close();
			
			System.out.println("!ESCRITO¡");
			//Lectura
			System.out.println("Leyendo ArrayList del fichero objetos.dat...");
			
			ObjectInputStream leyendoFichero = new ObjectInputStream(new FileInputStream("objetos.dat"));
			
			//Leemos todos desde el fichero
			arrayleer = ( ArrayList<Asignatura>) leyendoFichero.readObject();
			leyendoFichero.close();
			System.out.println("!LEIDO OK¡");
			
			System.out.println("DATOS LEIDOS DEL FICHERO: ");
			
			for (int i =0;i<arrayleer.size();i++) {
				System.out.println("arrayleer["+i+"]= " + arrayleer.toString());
			}
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
			
	}
}
