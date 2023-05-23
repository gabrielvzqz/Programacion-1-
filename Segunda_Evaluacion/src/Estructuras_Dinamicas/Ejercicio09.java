package Estructuras_Dinamicas;

import java.util.Collections;

import java.util.ArrayList;

public class Ejercicio09 {

	public static void main(String[] args) {

		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(67);
		nums.add(78);
		nums.add(10);
		nums.add(4);

		System.out.println("\nNúmeros en el orden original: ");
		for (int numero : nums) {
			System.out.println(numero);
		}
		//ES NOVEDOSO
		Collections.sort(nums);
		System.out.println("\nNúmeros ordenados:");
		for (int numero : nums) {
			System.out.println(numero);
		}
	}
}
