package Constructores;

/*(Ejercicio de dificultad alta) Crea la clase peso, la cual tendrá las siguientes características:
Deberá tener un atributo donde se almacene el peso de un objeto en kilogramos.
En el constructor se le pasará el peso y la medida en la que se ha tomado (
‘Lb’ para libras, 
‘Li’ para lingotes, 
‘Oz' para onzas, 
‘P’ para peniques,
‘K’ para kilos, 
‘G’ para gramos 
‘Q’ para quintales)
Deberá de tener los siguientes métodos:
getLibras. Devuelve el peso en libras.
getLingotes. Devuelve el peso en lingotes.
getPeso. Devuelve el peso en la medida que se pase como parámetro (‘Lb’ para libras, ‘Li’ para lingotes, ‘Oz
para onzas, ‘P’ para peniques, ‘K’ para kilos, ‘G’ para gramos y ‘Q’ para quintales).
Para la realización del ejercicio toma como referencia los siguientes datos:
1 Libra = 16 onzas = 453 gramos.
1 Lingote = 32,17 libras = 14,59 kg.
1 Onza = 0,0625 libras = 28,35 gramos.
1 Penique = 0,05 onzas = 1,55 gramos.
1 Quintal =100 libras = 43,3 kg.
Crea además un método main para testear y verificar los métodos de esta clase.*/
public class peso {

	double valor; //valor del peso en kg
	
	peso(double v, String medida){
	
		this.valor= (v / getValor(v,medida));
		
	}
	
	//SOLUCION SENCILLA convertimos el metodo getValor en static
	//y ademas le podemos pasar un numero para las conversion
	public static double getValor(double numero,String medida) {
		
		double aux=0d;
		switch(medida) {
			case "Libra":
				//convertir valor a libras y guardarlo en aux
				aux= numero/0.453;
				break;
			case "Lingote":
				//convertir valor a lingotes y guardarlo en aux
				aux= numero/14.59;
				break;
			case "Onza":
				//convertir valor a onzas y guardarlo en aux
				aux= numero/0.02835;
				break;
			case "Penique":
				//convertir valor a peniques y guardarlo en aux
				aux=numero/0.00155;
				break;
			case "Kilo" :
				//SOLO DEVOLVEMOS EL VALOR PUES YA ESTA EN KILOS
				 aux=numero;
				break;
			case "Gramo":
				//MULTIPLICO POR MIL PARA CONVERTIR A GRAMOS y lo GUAROD en aux
				 aux=numero/0.001;
				break;
			case "Quintal":
				//convertir valor a quintales y guardarlo en aux
				aux=numero/43.3;
				break;
			default:
				System.out.println("NO EXISTE ESA UNIDAD DE MEDIDA");
				}
			return aux;
			}

	@Override
	public String toString() {
		return "peso [valor=" + valor + "]";
	}

	

	
	
}
