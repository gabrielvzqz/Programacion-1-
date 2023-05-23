package Constructores;

public class rectangulo {
	
	
	private String nombre;
	private int ancho=0;
	private int alto=0;
	
	rectangulo(int an, int al, String nombre){
		this.ancho=an;
		this.alto=al;
		this.nombre=nombre;
	}
	rectangulo(rectangulo r){
		this.ancho=r.getAncho();
		this.alto=r.getAlto();
		this.nombre=r.getNombre();
	}
	
	rectangulo(){
		this.ancho=0;
		this.alto=0;
		this.nombre="";
	}
	public int getAncho() {
		return this.ancho;
	}
	public int getAlto() {
		return this.alto;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String n) {
		this.nombre=n;
	}
	
	public rectangulo incrementaAncho() {
		this.ancho++;
		return this; 
	}
	public rectangulo incrementaAlto() {
		this.alto++;
		return this; 
	}

	@Override
	public String toString() {
		return "rectangulo [ancho=" + ancho + ", alto=" + alto + "]";
	}
	
	public Object clone() {
		Object objeto = null;
		try {
			objeto= super.clone();
		}catch(CloneNotSupportedException nsex) {
			nsex.printStackTrace();
		System.out.println("La cagaste.");	
		}
		return objeto;
	}


}
