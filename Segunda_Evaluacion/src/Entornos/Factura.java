package Entornos;

public class Factura {

	String cod;
	String nombre;
	String direccion;
	String CIF;
	String fecha;
	float total;
	String nombre1;
	float precio1;
	String nombre2;
	float precio2;	
	String nombre3;
	float precio3;	
	String nombre4;
	float precio4;
	
	 
	public static String getDayOfWeekByNumber(int numberDayOfWeek) {
		if(numberDayOfWeek == 1) {
			return "Lunes";
		}
		else if(numberDayOfWeek == 2) {
			return "Martes";
		}		
		else if(numberDayOfWeek == 3) {
			return "Miercoles";
		}		
		else if(numberDayOfWeek == 4) {
			return "Jueves";
		}		
		else if(numberDayOfWeek == 5) {
			return "Viernes";
		}		
		else if(numberDayOfWeek == 6) {
			return "Sábado";
		}		
		else if(numberDayOfWeek == 7) {
			return "Domingo";
		}
		return "error";
	}
}
