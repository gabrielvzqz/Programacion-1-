package Constructores;

import java.util.Scanner;

public class maintapas3 {
public static void main(String[] args) {


//TODO Auto-generated constructor stub
Scanner sc=new Scanner(System.in);
double p;//en kilos
double c;//en kilos
System.out.println("cuantos kilos de patatas hay?");
p=sc.nextDouble();
System.out.println("cuantos kilos de chocos hay?");
c=sc.nextDouble();

tapas3 almacen=new tapas3(p,c);
System.out.println(almacen.toString());
System.out.println("el numero de comensales es: "+ almacen.numeroClientes(p, c));
System.out.println(almacen.toString());
sc.close();

}
}