package Ejemplos;

public class TestSemaforo {

	public static void main(String[] args) {

		Semaforo MiSemaforo = new Semaforo();
		Semaforo OtroSemaforo = new Semaforo();
		Semaforo SemaforoDeMiCalle = new Semaforo();

		MiSemaforo.setColor("Rojo");
		OtroSemaforo.setColor("Verde");
		
		System.out.println(OtroSemaforo.getColor());
		System.out.println(SemaforoDeMiCalle.getColor());
		
		if(MiSemaforo.getColor().equals("Rojo")) System.out.println("No pasar.");
	}

}
