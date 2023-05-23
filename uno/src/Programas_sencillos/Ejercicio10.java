package Programas_sencillos;

public class Ejercicio10 {
	public static void main(String[] args) {
	
	int m=2, n=5;
	boolean res;
	res =m > n && m >= n;//res=false
	System.out.println("res es:"+ res);
	res =!(m < n || m != n);//res=false
	System.out.println("res es:"+ res);
	}
}
