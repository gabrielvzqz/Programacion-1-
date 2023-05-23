package Medicina;

import java.util.ArrayList;

public class TEST {

	public static void main(String[] args) {
		
		ArrayList<Medico> listaMedicos = new ArrayList<>();
		
		Medico medico1 = new Medico("Gabo");
		listaMedicos.add(medico1);
		
		Ortopedista ortopedista1 = new Ortopedista("Doc Gabo", Ortopedista.Tipologia.MAXILOFACIAL);
		listaMedicos.add(ortopedista1);
		
		Pediatra pediatra1 = new Pediatra("Doctor Gabonetas", Pediatra.Tipologia.NEUROLOGO);
		listaMedicos.add(pediatra1);
		
		System.out.println("Con instanceof: ");
		System.out.println("");
		for(int i = 0; i<listaMedicos.size();i++) {
			Medico a = (Medico) listaMedicos.get(i);
			if(a instanceof Ortopedista) {
				System.out.println("El objeto de indice " + i + " es de la clase Ortopedista");
				continue;
			}
			if(a instanceof Pediatra) {
				System.out.println("El objeto de indice " + i + " es de la clase Pediatra");
				continue;
			}
			if(a instanceof Medico) {
				System.out.println("El objeto de indice " + i + " es de la clase Medico");
				continue;
			}
		}
		System.out.println("");
		System.out.println("Con foreach: ");
		System.out.println("");
		for (Medico medico : listaMedicos) {
			System.out.println(medico.toString());
		}
		
	}
}
