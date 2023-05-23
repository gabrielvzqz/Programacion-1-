package Metodos;

public class testMetodo {
	
	public int dato=0;
	public static int datoestatico=0;
	
	public void metodo() {
		/*no se puede utilizar this en estatico: this.datosestatico++;*/
		datoestatico++;
		testMetodo.datoestatico++;

	}
	
	public static void metodoestatico() {
		/*no se puede utilizar this en estatico: this.datosestatico++;*/
		datoestatico++;
		testMetodo.datoestatico++;

	}
	
	public static void main(String[] args) {
		
		/*dato++; no has creado un objeto */
		datoestatico++;
		metodoestatico();
		//metodo(); no has creado un objeto para usarlo
		
		testMetodo tm= new testMetodo();
		tm.dato++;
	}

}
