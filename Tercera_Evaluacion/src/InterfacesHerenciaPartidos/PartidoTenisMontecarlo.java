package InterfacesHerenciaPartidos;

public class PartidoTenisMontecarlo implements PartidoTenis{

	
	String jugadorLocal;
	String jugadorVisitante;
	
	int juegosJugadorLocal;
	int juegosJugadorVisitante;
	
	public void setEquipoLocal(String nombreEquipo) {
		this.jugadorLocal=nombreEquipo;
	}
	
	public void setEquipoVisitante(String nombreEquipo) {
		this.jugadorVisitante=nombreEquipo;
	}	
	public void setJuegosJugadorLocal(int marcador) {
		this.juegosJugadorLocal=marcador;
	}
	
	public void setJuegosJugadorVisitante(int marcador) {
		this.juegosJugadorVisitante=marcador;
	}

	@Override
	public String toString() {
		return "PartidoTenisMontecarlo [jugadorLocal=" + jugadorLocal + ", jugadorVisitante=" + jugadorVisitante
				+ ", juegosJugadorLocal=" + juegosJugadorLocal + ", juegosJugadorVisitante=" + juegosJugadorVisitante
				+ "]";
	}
	
}
