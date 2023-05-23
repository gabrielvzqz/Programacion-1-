package Array;

import java.util.Arrays;

public class Resuelto06 {
	
	public static void main(String[] args) {
		
		int[] arr = generarArray();
		
		System.out.println(Arrays.toString(arr));
		
		try {
			Thread.sleep(10000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		qSort(arr);
		System.out.println(Arrays.toString(arr));

	}


	private static void qSort(int[] arr) {
		// TODO Auto-generated method stub
		
	}

	final static int LIMITE =100;
	final static int POS = 3000;
	public static int getAleatorio() {
		return (int) (Math.random()*LIMITE + 1);
	}
	public static int[] generarArray() {
		int[] fuera =new int[POS];
		for (int i = 0; i <fuera.length; i++) {
			fuera[i] = getAleatorio();
		}
		return fuera;
	}
}
