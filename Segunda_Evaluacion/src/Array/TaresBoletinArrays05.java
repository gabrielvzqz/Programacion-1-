package Array;

import java.util.Arrays;

import java.util.Scanner;

public class TaresBoletinArrays05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr1 = new int[10];
		int[] arr2 = new int[6];
		int[] arr3 = new int[arr1.length+arr2.length];
		System.out.println("Tabla 1");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("Introduce un número: ");
			arr1[i]=sc.nextInt();
			arr3[i*2]=arr1[i];
		}
		for (int i = arr2.length; i < arr3.length-arr2.length; i++) {
			System.out.println("Introduce un número: ");
			arr1[i]=sc.nextInt();
			arr3[i+arr2.length]=arr1[i];
		}
		System.out.println("Tabla 2");
		for(int i = 0; i < arr2.length;i++) {
			System.out.println("Introduce un número: ");
			arr2[i]=sc.nextInt();
			arr3[i*2+1]=arr1[i];
		}
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr1));

		sc.close();

	}

}
