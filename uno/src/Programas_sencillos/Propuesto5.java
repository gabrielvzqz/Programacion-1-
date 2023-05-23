package Programas_sencillos;

import java.util.Scanner;

/*cOdigo para calcular el perimetro
 * y el área de un cuadrado
 * pidiendo primero su lado (entero)
 */
public class Propuesto5 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int lado=0;
	int area=0;
	int perimetro=0;
    System.out.println("Porfavor introduzca el Lado ");
    lado=sc.nextInt();
    area=lado*lado;
    perimetro=lado*4;
    System.out.println("El perimetro vale "+perimetro+"m y el area "+area+"m^2.");
    sc.close();
	}

}
