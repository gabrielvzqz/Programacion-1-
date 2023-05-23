package Examen;

public class Ejercicio4ATest {
	
	public static void main(String[] args) {
		
		Ejercicio4A uno = new Ejercicio4A(0, 100, 50, 30, "Gabriel", 12345);
		System.out.println(uno.toString());
		Ejercicio4A dos = new Ejercicio4A(0, 200, 100, 30, "Pepe", 45631);
		System.out.println(dos.toString());
		Ejercicio4A tres = new Ejercicio4A(0, 300, 150, 30, "Mario", 23451);
		System.out.println(tres.toString());


		System.out.println("Numero de curentas creadas: " + Ejercicio4A.countCuentas());
	}

}
