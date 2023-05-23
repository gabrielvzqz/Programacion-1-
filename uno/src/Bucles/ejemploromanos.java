package Bucles;

import java.util.Scanner;

public class ejemploromanos {
	public static String decimalaromano(int n){ 
		
	

		String rom="";
		
		do{
			if(n>=1000) {
				rom +="M";
				n-=1000;
			}
			if(n>=900) {
				rom +="CM";
				n-=900;
			}
			if(n>=500) {
				rom +="D";
				n-=500;
			}
			if(n>=400) {
				rom +="CD";
				n-=400;
			}
			if(n>=100) {
				rom +="C";
				n-=100;
			}
			if (n>=90) {
				rom +="XC";
				n-=90;
			}
			if(n>=50) {
				rom +="L";
				n-=50;
			}
			if(n>=40) {
				rom +="XL";
				n-=40;
			}
			while(n>=10) {
				rom +="X";
				n-=10;
			}
			if(n>=9) {
				rom +="IX";
				n-=9;
			}
			if(n>=5) {
				rom += "V";
				n-=5;
			}
			if(n>=5) {
				rom += "IV";
				n-=4;
			}			
			
			while(n>=1) {
				rom += "I";
				n-=1;
			} 
		}while(n!=0);
		return rom;
	}
		public static void main(String[] args) {
			
			Scanner sc = new Scanner (System.in);
			int n=0;
			System.out.println("Dame un número entero: ");
			n=sc.nextInt();	
		System.out.println("En romanos: "+decimalaromano(n));
		
		
		
		
		sc.close();

	}

}

