/**
 * 
 */
package Logica;

import java.util.ArrayList;

/**
 * @author GonzalezHDanielaA
 *
 */
public class ListaDobleEnteros {
	
	private Nodo inicio;
	private Nodo fin;
	private int tamanio;
	private ArrayList<Integer> lista = new ArrayList<Integer>();
	
	public ListaDobleEnteros()
	{
		inicio = null;
		fin = null;
		
	}
	
	public ArrayList<Integer> getLista() {
		return lista;
	}



	public void setLista(ArrayList<Integer> lista) {
		this.lista = lista;
	}



	public int getTamanio() {
		return tamanio;
	}



	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}



	public void insertarInicio(int dato)
	{
		Nodo nuevo = new Nodo(dato);
		if(inicio==null)
		{
			inicio = nuevo;
			fin = nuevo;	
		}
		else
		{
			inicio.setAnterior(nuevo);
			nuevo.setSiguiente(inicio);
			inicio=nuevo;
		}
		tamanio++;
		lista.add(nuevo.getDato());
	}
	
	public void insertarFinal(int dato)
	{
		Nodo nuevo = new Nodo(dato);
		if(inicio==null)
		{
			inicio = nuevo;
			fin = nuevo;	
		}
		else
		{
			fin.setSiguiente(nuevo);
			nuevo.setAnterior(fin);
			fin=nuevo;
		}
		lista.add(nuevo.getDato());
	}
	
	
	public void recorrerAdelante()
	{
		Nodo actual = inicio;
		while(actual != null)
		{
			System.out.print(""+ "->"+actual.getDato() + "<-");
			actual = actual.getSiguiente();		
		}
	}
	
	public void recorrerRegreso() {
		Nodo actual = fin;

		do {
			System.out.print("->" + actual.getDato() + "<-");
			actual = actual.getAnterior();
		} while (actual != null);

	}
	
	public int buscarDato(int dato)
	{
		Nodo actual = inicio;
		int encontrado = 0;
		while(actual!=null)
		{
			if(actual.getDato() == dato)
			{
				encontrado = dato;
			}
			actual = actual.getSiguiente();
		}
		return encontrado;
	}
	
	
	public void ordenarBurbuja()
	{
		Nodo actual = inicio;
	
		Nodo aux;
		while(actual!=null && fin !=null)
		{
			aux = actual.getSiguiente();
			if(aux!=null)
			{
				 if(actual.getDato()> aux.getDato() )
				{
					int aux2 = actual.getDato();
					actual.setDato(aux.getDato());
					aux.setDato(aux2);	
				}	
			}
			actual = actual.getSiguiente();
		}
		recorrerAdelante();
	}
	
	 
	
	public  void burbuja(ArrayList<Integer> lista) {
		
		for (int i = 0; i < lista.size(); i++) {
			// Aquí "y" se detiene antes de llegar
			// a length - 1 porque dentro del for, accedemos
			// al siguiente elemento con el índice actual + 1
			for (int y = 0; y < lista.size() - 1; y++) {

				int actual = lista.get(y);
				int siguiente = lista.get(y + 1);
				if (actual > siguiente) {
					lista.set(y, siguiente);
					lista.set(y + 1, actual);
				}
			}
		}
	    
	    for(int s: lista)
	    {
	    	System.out.println(s);
	    }  
	}
	
public  void burbujaDescendente(ArrayList<Integer> lista) {
		
		for (int i = 0; i < lista.size(); i++) {
			// Aquí "y" se detiene antes de llegar
			// a length - 1 porque dentro del for, accedemos
			// al siguiente elemento con el índice actual + 1
			for (int y = 0; y < lista.size() - 1; y++) {

				int actual = lista.get(y);
				int siguiente = lista.get(y + 1);
				if (actual < siguiente) {
					lista.set(y, siguiente);
					lista.set(y + 1, actual);
				}
			}
		}
	    
	    for(int s: lista)
	    {
	    	System.out.println(s);
	    }  
	}
	
	
	

}

