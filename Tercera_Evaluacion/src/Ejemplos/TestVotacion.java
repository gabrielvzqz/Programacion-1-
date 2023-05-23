package Ejemplos;

public class TestVotacion {

	public static void main(String[] args) {

		System.out.println(Votacion.showItToMe());

		// Tenemos tres candidatos en esta votacion
		Votacion Juan = new Votacion("Juan Peire");
		Votacion Ana = new Votacion("Ana Garcia");
		Votacion Adela = new Votacion("Adela Sancho");
		Votacion Susana = new Votacion("Abel Caballero");
		Votacion Gabo = new Votacion("Fernando Alonso");
		Votacion Joaco = new Votacion("Juan Peire");
		Votacion Xurxo = new Votacion("Abel Caballero");
		// empieza la votacion
		Juan.Voto();
		Ana.Voto();
		Gabo.Voto();
		Ana.Voto();
		Adela.Voto();
		Xurxo.Voto();
		Susana.Voto();
		Joaco.Voto();

		System.out.println(Votacion.NombreDelMasVotado() + ": " + Votacion.VotosDelMasVotado());

		Juan.Voto();
		Gabo.Voto();
		Juan.Voto();
		Xurxo.Voto();
		Joaco.Voto();
		Adela.Voto();
		Xurxo.Voto();
		Xurxo.Voto();
		System.out.println(Votacion.NombreDelMasVotado() + ": " + Votacion.VotosDelMasVotado());

		Adela.Voto();
		Gabo.Voto();
		Joaco.Voto();
		Ana.Voto();
		Xurxo.Voto();
		Joaco.Voto();
		Susana.Voto();
		Susana.Voto();
		System.out.println(Votacion.NombreDelMasVotado() + ": " + Votacion.VotosDelMasVotado());

		System.out.println(Juan.getPersona() + ": " + Juan.getVotos());
		System.out.println(Ana.getPersona() + ": " + Ana.getVotos());
		System.out.println(Adela.getPersona() + ": " + Adela.getVotos());

		System.out.println("Fin votación : RESULTADO ---> lo que dice la clase");
		System.out.println(Votacion.NombreDelMasVotado() + ": " + Votacion.VotosDelMasVotado());

	}
}