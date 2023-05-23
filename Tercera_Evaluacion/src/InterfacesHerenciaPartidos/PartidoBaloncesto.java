package InterfacesHerenciaPartidos;

public interface PartidoBaloncesto extends MatchDeportivo{
	
	static final int duracionPartidoBaloncesto=40;
	
	void setPuntosEquipoLocal(int marcador);
	
	void setPuntosEquipoVisitante(int marcador);
}
