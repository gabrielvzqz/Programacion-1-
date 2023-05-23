package TiendaMascotas;

import java.util.ArrayList;


public class TestMascota {

	public static void main(String[] args) {
		ArrayList<Mascota> Mascotas = new ArrayList<Mascota>();

		
	Gatos A = new Gatos("Margarita", 12, "Naranja", 120, 200);
	GatoSinPelo B = new GatoSinPelo("Napolitana", 11, "Blanco", 100, 300, GatoSinPelo.razas.DONSKOY);
	GatoPeloCorto C = new GatoPeloCorto("BBQ", 13, "Negro", 100, 300, GatoPeloCorto.razas.AZULRUSO);
	GatoPeloLargo D = new GatoPeloLargo("4Quesos", 4, "Marron", 100, 300, GatoPeloLargo.razas.HIMALAYO);
	Perros E = new Perros("Margarita", 8, "Marron", "12 Kilos", false);
	PerroPequeño F =new PerroPequeño("Napolitana", 6, "Blanco", "2 Kilos", false, PerroPequeño.razas.CHIHUAHUA);
	PerroMediano G =new PerroMediano("BBQ", 5, "Negro", "8 Kilos", false, PerroMediano.razas.GALGO);
	PerroGrande H =new PerroGrande("4Quesos", 2, "Marron", "20 Kilos", false, PerroGrande.razas.PASTORALEMÁN);
	Mascota I = new Mascota("loro", 12, "azul") {
		
		@Override
		public String sonido() {
			// TODO Auto-generated method stub
			return "Los loros hablan.";
		}
	};
	
	Mascotas.add(A);
	Mascotas.add(B);
	Mascotas.add(C);
	Mascotas.add(D);
	Mascotas.add(E);
	Mascotas.add(F);
	Mascotas.add(G);
	Mascotas.add(H);
	Mascotas.add(I);

	for (Mascota m : Mascotas) {
		System.out.println(m.toString());
		System.out.println(m.sonido());
	}
	
	}
	
	
}
