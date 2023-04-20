/**
 * 
 */
package Logica2;



/**
 * @author GonzalezHDanielaA
 *
 */
public class Nodo2 {
	private Nodo2 siguiente;
	private Nodo2 anterior;
	private Directorio<String> dato;
	
	public Nodo2(Directorio<String> dato, Nodo2 ant, Nodo2 sig)
	{
		this.siguiente = sig;
		this.anterior = ant;
		this.dato = dato;
	}

	public Nodo2 getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo2 siguiente) {
		this.siguiente = siguiente;
	}

	public Nodo2 getAnterior() {
		return anterior;
	}

	public void setAnterior(Nodo2 anterior) {
		this.anterior = anterior;
	}

	public Directorio<String> getDato() {
		return dato;
	}

	public void setDato(Directorio<String> dato) {
		this.dato = dato;
	}



}
