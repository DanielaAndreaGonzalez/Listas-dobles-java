/**
 * 
 */
package Logica;

import Logica2.Directorio;

/**
 * @author GonzalezHDanielaA
 *
 */
public class Nodo {
	
	private Nodo siguiente;
	private Nodo anterior;
	private String dato;
	
	public Nodo(String dato, Nodo ant, Nodo sig)
	{
		this.siguiente = sig;
		this.anterior = ant;
		this.dato = dato;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}

	public Nodo getAnterior() {
		return anterior;
	}

	public void setAnterior(Nodo anterior) {
		this.anterior = anterior;
	}

	public String getDato() {
		return dato;
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	

	
	
	

}
