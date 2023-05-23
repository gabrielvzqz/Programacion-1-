/*1. Leer 5 números y mostrarlos en el mismo orden
introducido.*/
package BoletinArrays;

import java.util.Arrays;

import java.util.Random;

import java.util.Scanner;


public class BoletinArrays01 {
	
	public static void burbuja(int[] arr) {
		
		int aux;
		for(int i=arr.length;i>0;i--) {
			for(int j=0; j<i-1;j++) {
				if(arr[j]>arr[j+1]) {
					aux=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=aux;
				}
			}

		}
	}
	public static void main(String[] args) {
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int[] arr= new int [50];
		int pos=0;
		int neg=0;
		
		for (int i=0; i<arr.length; i++) {
			arr[i]=r.nextInt(-100,100);
		}
		
		for (int i=0; i<arr.length; i++) {
			if(arr[i]>=0) {
				pos++;
			}else	neg++;
		}	

		int[] positivos =new int [pos];
		int[] negativos =new int [neg];
		int numpos=0;
		int numneg=0;
		for (int i=0; i<arr.length; i++) {
			if(arr[i]>=0) {
				positivos[i]=arr[0+numpos];
				numpos++;
			}else	
				negativos[i]=arr[0+numneg];
				numneg++;

		}
		burbuja(positivos);
		burbuja(negativos);
		
		System.out.println(Arrays.toString(positivos));
		System.out.println(Arrays.toString(negativos));
		sc.close();

		}

}
