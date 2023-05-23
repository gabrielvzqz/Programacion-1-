package Ejemplos2;

class Publicacion {
	protected  int NumeroDePaginas;
	protected float Precio;
	
	public Publicacion() {
		this.NumeroDePaginas=0;
	}
	
	public Publicacion(int numeroDePaginas, float precio) {
		NumeroDePaginas = numeroDePaginas;
		Precio = precio;
	}
	public int getNumeroDePaginas() {
		return NumeroDePaginas;
	}
	public void setNumeroDePaginas(int numeroDePaginas) {
		NumeroDePaginas = numeroDePaginas;
	}
	public float getPrecio() {
		return Precio;
	}
	public void setPrecio(float precio) {
		Precio = precio;
	}
	@Override
	public String toString() {
		return "Publicacion [NumeroDePaginas=" + NumeroDePaginas + ", Precio=" + Precio + "]";
	}
	
}