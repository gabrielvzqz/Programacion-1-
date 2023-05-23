package Animales;
/*habria que poner los gets en abstracto y las clases canido y felino tambien para en las ultimas 4 clases(lobo,perro,gato,leon poner los gets
 *  y el return que se quiera en cada uno)*/
abstract public class Animal {

	protected String sonido;
	protected String alimento;
	protected String habitat;
	protected String nombreCientifico;
	

	abstract public String getSonido();

	abstract public String getAlimento();

	abstract public String getHabitat();

	abstract public String getNombreCientifico();

	@Override
	public String toString() {
		return "Animal [sonido=" + sonido + ", alimento=" + alimento + ", habitat=" + habitat + ", nombreCientifico="
				+ nombreCientifico + "]";
	}
	
}
