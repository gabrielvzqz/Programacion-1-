package Mapas;

import java.util.HashMap;
import java.util.Scanner;

public class Ejemplo4UsuarioContraseña {

	public static HashMap<String, String> login = new HashMap();

	public static void poblarMap() {
		login.put("Amalia Núñez", "2645");
		login.put("Cindy Nero", "5296");
		login.put("César Vázquez", "5309");
		login.put("Víctor Tilla", "6375");
		login.put("Alan Brito", "1634");
		login.put("Esteban Quito", "3628");
	}
	
	public static void main(String[] args) {
		
		poblarMap();
		
		Scanner sc = new Scanner(System.in);
		
		String usuario,contraseña="";
		int veces=0;
		boolean seguir = true;
	
		do{
			
			System.out.println("Usuario: ");
			usuario= sc.nextLine();
			System.out.println("Contraseña: ");
			contraseña= sc.nextLine();
			
			if((login.containsKey(usuario)) && login.get(usuario).equals(contraseña)) {
				System.out.println("Bienvenido.:)");
				seguir=false;
		}
			if((!login.containsKey(usuario))) {
				System.out.println("Usuario no existente.");	
				veces++;
		}
			if((login.containsKey(usuario)) && !login.get(usuario).equals(contraseña)) {
				System.out.println("Contraseña incorrecta.");	
				veces++;
		}

		}while(seguir=true && veces<3);
			System.out.println("INTENTADO TRES VECES adios.");
		
		
		sc.close();
	}
}
