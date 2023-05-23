package InterfacesHerenciaPartidos;

public class TEST {

	public static void main(String[] args) {
		
		System.out.println("Tiempo de juego: " + PartidoFutbol.duracionPartidoFutbol);
		PartidoFutbolLiga partido = new PartidoFutbolLiga();
		partido.setEquipoLocal("Celta");
		partido.setEquipoVisitante("Deportivo");
		partido.setGolesEquipoLocal(3);
		partido.setGolesEquipoVisitante(4);
		System.out.println(partido.toString());
		
		
		System.out.println("");
		System.out.println("Tiempo de juego: " + PartidoBaloncesto.duracionPartidoBaloncesto);
		PartidoBaloncestoEuroLiga partido2 = new PartidoBaloncestoEuroLiga();
		partido2.setEquipoLocal("Barcelona");
		partido2.setEquipoVisitante("Real Madrid");
		partido2.setPuntosEquipoLocal(89);
		partido2.setPuntosEquipoVisitante(88);
		System.out.println(partido2.toString());
		
		System.out.println("");
		PartidoTenisMontecarlo partido3 = new PartidoTenisMontecarlo();
		partido3.setEquipoLocal("Gabo");
		partido3.setEquipoVisitante("Anti-Gabo");
		partido3.setJuegosJugadorLocal(3);
		partido3.setJuegosJugadorVisitante(2);
		System.out.println(partido3.toString());
	}
}
