package Constructores;

public class testCoche2 {
	public static void main(String[] args) {
		
		Coche2 bonito = new Coche2();
		bonito.getVelocidad();
		bonito.acelerar(20);
		bonito.frenar(10);
		System.out.println(bonito.toString());
	}
}