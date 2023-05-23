package ExamenEntornosGabrielVazquez;


import java.util.ArrayList;

class Ingrediente {
	private String nombre;
	private float precio;

	public Ingrediente(String nombre, float precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
}

/**
 * Copyright (c) 2023, Gabriel Vázquez, All rights reserved.
 * 
 * Clase para el manejo de una pizza.
 * 
 * @author Gabriell Vázquez
 * @version 1.0
 *
 */
public class PizzaDocumentacion {
	final static float PRECIO_BASE = 5;
	/**
	 * Se declara el precio de la base
	 * 
	 * @param precio en euros
	 */
	private ArrayList<Ingrediente> listaIngredientes = new ArrayList<Ingrediente>();

	/**
	 * Este método calcula la cantidad de ingredientes
	 * 
	 * @return Cantidad de ingredientes
	 */

	public int getCantidadIngredientes() {
		return listaIngredientes.size();
	}

	/**
	 * Calcula el coste de la pizza
	 * 
	 * @return Coste de la pizza
	 * @param Coste en euros
	 */

	public float getCostePizza() {
		float coste = PRECIO_BASE;
		for (Ingrediente i : listaIngredientes) {
			coste += i.getPrecio();
		}
		return coste;
	}

	/**
	 * Este método añade ingredientes a la pizza
	 */

	public void addIngrediente(Ingrediente bola) {
		listaIngredientes.add(bola);
	}

	/**
	 * Este método quita ingredientes a la pizza
	 */

	public void quitarIngrediente(Ingrediente bola) {
		listaIngredientes.remove(bola);
	}

	/**
	 * Este método quita todos los ingredientes a la pizza
	 */
	public void quitarTodosLosIngredientes() {
		listaIngredientes.clear();
	}

	/**
	 * Este método lista los ingredientes de la pizza
	 * @return Ingredientes de la pizza listados
	 * @deprecated
	 */
	public String obtenerIngredientesFormatoTexto() {
		String resultado = "";
		for (Ingrediente i : listaIngredientes) {
			resultado += i.getNombre();
			resultado += "\n";
		}
		return resultado;
	}

	/**
	 * toString para obtener la lista de ingrdientes que tiene una pizza
	 * @return Lista ingredientes
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Ingrediente i : listaIngredientes) {
			sb.append(i.getNombre());
			sb.append("\n");
		}
		return sb.toString();
	}
}
