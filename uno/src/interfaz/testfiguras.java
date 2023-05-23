package interfaz;

public class testfiguras {

	public static void main(String[] args) {
		
		cuadrado c = new cuadrado(8);
		System.out.println("Área: "+c.area());
		
		circulo o = new circulo(3);
		System.out.println("Área: "+o.perimetro());
		
		triangulo t = new triangulo(5,10);
		System.out.println("Área: "+t.area());
		
		rectangulo r = new rectangulo(3, 4, "");
		System.out.println(r.toString());
		System.out.println("Área: "+r.area());
		System.out.println("Perímetro: "+r.perimetro());
		
	}
}
