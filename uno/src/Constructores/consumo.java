package Constructores;

import java.util.Scanner;

public class consumo {
	double kilometros;
	double litros;
	double velocidad;
	double preciogsln;
	
	public consumo (double kilometros, double litros, double velocidad, double preciogsln) {
		this.kilometros=kilometros;
		this.litros=litros;
		this.velocidad=velocidad;
		this.preciogsln=preciogsln;
	}

	@Override
	public String toString() {
		return "consumo [kilometros=" + kilometros + ", litros=" + litros + ", velocidadmedia=" + velocidad
				+ ", preciogsln=" + preciogsln + "]";
	}
	
	public String tiempo() {
		return (kilometros/velocidad) + "horas";
	}
	public String consumoMedio() {
		return "Has consumido " + (litros/kilometros)*100 + "l/100km.";
	}
	public String consumogasolina() {
		return "Has consumido " + (preciogsln/kilometros) + "euros en gasolina.";
	}
	public static void main(String[]args) {
		
		double kilometros, litros, velocidad, preciogsln;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime kms: ");
		kilometros=sc.nextDouble();
		System.out.println("Dime litros: ");
		litros=sc.nextDouble();		
		System.out.println("Dime velocidad media: ");
		velocidad=sc.nextDouble();
		System.out.println("Dime precio de la gasolina: ");
		preciogsln=sc.nextDouble();
		consumo nashe = new consumo(kilometros, litros, velocidad, preciogsln);
		System.out.println(nashe.toString());
		System.out.println("Has tardado: "+ nashe.tiempo());
		System.out.println("Consumo medio: " + nashe.consumoMedio());
		System.out.println("Consumista: " + nashe.consumogasolina());
		
		sc.close();
	}
}