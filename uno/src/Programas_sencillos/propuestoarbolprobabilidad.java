package Programas_sencillos;

import java.util.Scanner;

/*** 1. Realiza un programa con tres variables de tipo entero a, b y c. El programa deberá mostrar por pantalla el valor
menor y mayor.*/

public class propuestoarbolprobabilidad {
public static void main(String[] args) {
int a,b,c;
Scanner sc = new Scanner(System.in);

System.out.println("valor de a:");
a=sc.nextInt();
System.out.println("valor de b:");
b=sc.nextInt();
System.out.println("valor de c:");
c=sc.nextInt();

if(a>b && a>c) {
System.out.println("mayor es a");
}
if(a<b && b>c) {
System.out.println("El mayor es b");
}
if(c>a && c>b) {
System.out.println("El mayor es c");
}
if (c<a && c<b) {
System.out.println("El menor es c");
}
if (b<a && b<c) {
System.out.println("El menor es b");
}
if (a<b && a<c) {
System.out.println("El menor es a");
sc.close();
}
}
}