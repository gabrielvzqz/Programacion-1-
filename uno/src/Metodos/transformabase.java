package Metodos;

import java.util.Scanner;

public class transformabase {
	
	public static void muestracifra(int dat) {
		
		if(dat<10) {
			System.out.print(dat);
		}else {
			dat -= 10;
			char c = (char)('A'+dat);
			System.out.print(c);
		}
	}
	public static void transforma(int dato, int base) {
		if(base>dato)
			muestracifra(dato);
		else {
			transforma(dato/base,base);
			muestracifra(dato%base);
			}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Dame un dato: " );
		int dato = sc.nextInt();
		System.out.println("Dame una base: ");
		int base = sc.nextInt();
		
		System.out.println("transformando a base "+ base);
		System.out.println(" el dato " + dato);
		transforma(dato, base);
		
		sc.close();
	}

	}