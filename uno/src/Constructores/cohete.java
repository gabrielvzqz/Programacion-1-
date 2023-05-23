package Constructores;

public class cohete {
	private static int numcohetes=0;
	cohete(){
		numcohetes++;
	}
	public int dimecohetes(){
		return numcohetes;
	}
	public static int getNumcohetes() {
		return numcohetes;
	}
	public static void setNumcohetes(int numcohetes) {
		//en vez de usar this, que es una referencia a un objeto
		//usa el nombre de la clase
		cohete.numcohetes = numcohetes;
	}
	public static void main(String[] args) {
		cohete c1= new cohete();
		cohete c2= new cohete();
		cohete c3= new cohete();
		cohete c4= new cohete();
		//use el nombre de la clase
		System.out.println("Numero de cohetes creados: " + cohete.getNumcohetes()+c1+c2+c3+c4);
	}

}
