package Array;

public class Ejemplo03 {

		
		private static int[] temperaturas;
		final static int POSICIONES=10;
		
		public static void main(String[] args) {
			int dato=0;
			int media=0;
			temperaturas =new int[POSICIONES];
			for(int i=0; i <POSICIONES;i++) {
				try {
				System.out.println("Introduzca temperatura: ");
				String sdato=System.console().readLine();
				dato=Integer.parseInt(sdato);
				}catch(Exception e) {
					e.printStackTrace();
					System.out.println("Error en la introducción de los datos.");
				}
				temperaturas[i]=dato;
			}
			for(int i=0; i <POSICIONES;i++) {
				
				media+=temperaturas[i];
			}
			media =media/POSICIONES;
			System.out.println("La media es " + media);
		}

		
	
}
