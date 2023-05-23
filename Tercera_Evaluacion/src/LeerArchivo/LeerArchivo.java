package LeerArchivo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeerArchivo {

	public static void main(String[] args) throws Exception{
		
		String nombreArchivo = "C:\\Users\\Primero DAM\\Documents\\Programacion\\Tercera_Evaluacion\\src\\LeerArchivo\\prueba.txt";
		
		FileInputStream archivo;
		InputStreamReader conversor;
		BufferedReader filtro;
		String linea;
		
		try {
			archivo = new FileInputStream(nombreArchivo);
			conversor = new InputStreamReader(archivo);
			filtro = new BufferedReader(conversor);
			linea = filtro.readLine();
			while(linea != null) {
				System.out.println(linea);
				linea=filtro.readLine();
			}
			filtro.close();
		} catch (IOException e) {
			System.out.println("No se pudo leer el archivo.");
			e.printStackTrace();
		}
	}
}
	