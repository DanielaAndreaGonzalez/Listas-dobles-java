/**
 * 
 */
package Logica2;

import java.util.ArrayList;

import Logica.Nodo;

/**
 * @author GonzalezHDanielaA
 *
 */
public class ListaDobleDirectorio {
	
	private Nodo2 inicio;
	private Nodo2 fin;
	private ArrayList<Directorio> directorio;
	
	public ListaDobleDirectorio()
	{
		inicio = null;
		fin = null;
		this.directorio = new ArrayList<Directorio>();
	}
	
	public void insertarInicio(Directorio<String> dato)
	{
		
		if(inicio == null)
		{
			inicio = new Nodo2(dato, null, null);
			fin = inicio;
			directorio.add(dato);
		}
		else
		{
			Nodo2 nuevo = new Nodo2(dato, null, inicio);
			inicio.setAnterior(nuevo);
			inicio = nuevo;	
			directorio.add(dato);
		}	
	}
	
	public void insertarFinal(Directorio<String> dato)
	{
		if(inicio == null)
		{
			fin = new Nodo2(dato, null, null);
			inicio = fin;
		}
		else
		{
			Nodo2 nuevo = new Nodo2(dato, null,inicio);
			fin.setSiguiente(nuevo);
			nuevo.setAnterior(fin);
			fin = nuevo;
		}
	}
	
	public void imprimirAdelante()
	{
		Nodo2 actual = inicio;
		String cadena = "";
		do {
			
				cadena = "\n" +"->"+ " Codigo: "+actual.getDato().getCodigo()+
						   		 " Nombre: "+ actual.getDato().getNombre()+
						   		 " Teléfono: "+actual.getDato().getTelefono()+
						   		 " Direccion: "+actual.getDato().getDireccion()+ "->";
			System.out.print(cadena);
			actual = actual.getSiguiente();
		}	while(actual!=inicio);
	}
	
	public void imprimirRegreso()
	{
		Nodo2 actual = fin;
		String cadena = "";
		do {
				cadena = "\n" +"->"+ " Codigo: "+actual.getDato().getCodigo()+
						   		 " Nombre: "+ actual.getDato().getNombre()+
						   		 " Teléfono: "+actual.getDato().getTelefono()+
						   		 " Direccion: "+actual.getDato().getDireccion()+ "->";
			System.out.print(cadena);
			actual = actual.getAnterior();
		}	while(actual!=null);
		
	}
	
	public Directorio<String> buscarByNombre(String nombre)
	{
		Nodo2 actual = inicio;
		Directorio<String> temp = new Directorio<String>();
		while(actual!=null)
		{
				if(actual.getDato().getNombre().equals(nombre))
				{
					temp = actual.getDato();
					break;
				}
				actual = actual.getSiguiente();
		}
		return temp;
	}
	
	public Directorio<String> buscarByCodigo(String codigo)
	{
		Nodo2 actual = inicio;
		Directorio<String> temp = new Directorio<String>();
		while(actual!=null)
		{
				if(actual.getDato().getCodigo().equals(codigo))
				{
					temp = actual.getDato();
					break;
				}
				actual = actual.getSiguiente();
		}
		return temp;
	}
	
	
	
	

}
