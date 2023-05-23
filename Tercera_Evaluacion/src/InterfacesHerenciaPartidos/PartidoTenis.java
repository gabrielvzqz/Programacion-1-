package  InterfacesHerenciaPartidos;

public interface PartidoTenis extends MatchDeportivo{
	
	static final int duracionPartidoTenis=40;
	
	void setJuegosJugadorLocal(int marcador);
	
	void setJuegosJugadorVisitante(int marcador);
}
