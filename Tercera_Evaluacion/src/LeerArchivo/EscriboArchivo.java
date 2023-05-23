package LeerArchivo;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class EscriboArchivo {

	public static void main(String[] args) throws Exception{
		FileWriter archivo = null;
		PrintWriter impresor =null;
		String nombre = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nombre del fichero: ");
		nombre=sc.nextLine();
		
		try {
			archivo = new FileWriter("C:\\Users\\Primero DAM\\Documents\\Programacion\\Tercera_Evaluacion\\src\\LeerArchivo\\"+nombre+".txt");
			//Definicion del archivo a crear
			impresor = new PrintWriter(archivo);
			for (int i = 0; i<10; i++) {
				System.out.println("Estamos imprimiendo.");
				impresor.println("Ronda " + i);
			}
			}catch(Exception e){
				e.printStackTrace();
			}finally {
				try {
				if(archivo != null) archivo.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	sc.close();
	}
}
