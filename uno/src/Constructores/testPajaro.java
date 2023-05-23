package Constructores;

public class testPajaro {

	public static void main(String[] args) {
		
			int años;
			Pajaro p;
			p=new Pajaro();
			
			p.setedad(5);
			System.out.println(p.toString());

			p.printedad();
			p.setedad(8);
			años=p.getEdad();
			
			System.out.println("El pájaro tiene "+años);
			
			p.setcolor('a');
			p.printcolor();
			
			System.out.println(p.toString());
			
			//Ejemplo de uso de constructor  con todos los atributos
			Pajaro dos=new Pajaro('t', 24);
			System.out.println(dos.toString());
		}

}
