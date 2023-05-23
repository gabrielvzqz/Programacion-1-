package InterfacesHerenciaPartidos;

public class PartidoFutbolLiga implements PartidoFutbol{

	String equipoLocal;
	String equipoVisitante;
	
	int golesEquipoLocal;
	
	int golesEquipoVisitante;
	
	public void setEquipoLocal(String nombreEquipo) {
		this.equipoLocal=nombreEquipo;
	}
	
	public void setEquipoVisitante(String nombreEquipo) {
		this.equipoVisitante=nombreEquipo;
	}	
	public void setGolesEquipoLocal(int marcador) {
		this.golesEquipoLocal=marcador;
	}
	
	public void setGolesEquipoVisitante(int marcador) {
		this.golesEquipoVisitante=marcador;
	}

	@Override
	public String toString() {
		return "PartidoFutbolLiga [equipoLocal=" + equipoLocal + ", equipoVisitante=" + equipoVisitante
				+ ", golesEquipoLocal=" + golesEquipoLocal + ", golesEquipoVisitante=" + golesEquipoVisitante + "]";
	}

	
	
}
