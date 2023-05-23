package Array;

public class Ejemplo02 {
	
	
	public static void mostrarArray( byte[] arr) {
		
		for(int j=0; j<arr.length; j++) {
			System.out.println(arr[j] + " ");
		}
	}
	
	
	public static void main(String[] args) {
		
		byte [] temperaturas1= {10,11,12,11,10,9,18,19,14,13,15,15};
		System.out.println("Número de valores "+temperaturas1.length);
		byte [] temperaturas2 = temperaturas1.clone();
		byte [] temperaturas3 = temperaturas1;
		
		System.out.println("Temperaturas 1");
		mostrarArray(temperaturas1);
		System.out.println(" ");
		System.out.println("Temperaturas 2");
		mostrarArray(temperaturas2);
		System.out.println(" ");
		System.out.println("Temperaturas 3");
		mostrarArray(temperaturas3);
		System.out.println(" ");
		if(temperaturas1.equals(temperaturas2)) {
			System.out.println("1 y 2 son iguales");
		}
		else
			System.out.println("1 y 2 no son iguales");
	
	System.out.println(temperaturas1.toString());
	System.out.println(temperaturas2.toString());
	System.out.println(temperaturas3.toString());

	//Cambiar un valor del array
	temperaturas1[4]=45;
	temperaturas3[3]=-18;
	System.out.println("Temperaturas 1");
	mostrarArray(temperaturas1);
	System.out.println(" ");
	System.out.println("Temperaturas 2");
	mostrarArray(temperaturas2);
	System.out.println(" ");
	System.out.println("Temperaturas 3");
	mostrarArray(temperaturas3);
	System.out.println(" ");
	}
}
