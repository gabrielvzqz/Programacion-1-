package Array;

public class Ejercicio613 {
	
	public int[] obtenerLongCadenas(String[] arr) {
		int[] largos = new int[arr.length];
		
		for(int i = 0; i<arr.length;i++) {
			largos[i]=arr[i].length();
			}
		return largos;
	}
}