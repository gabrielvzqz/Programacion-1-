package Estructuras_Dinamicas;

public class Ejercicio17ListaClaseAlumno {
		String nombre;
		int edad;
		public Ejercicio17ListaClaseAlumno(String n, int e){
			this.nombre=n;
			this.edad=e;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			this.edad = edad;
		}
		@Override
		public String toString() {
			return "Alumno [nombre=" + nombre + ", edad=" + edad + "]";
		}
}
