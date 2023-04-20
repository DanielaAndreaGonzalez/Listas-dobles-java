package Logica;



public class ListaDoble {
	
	private Nodo inicio;
	private Nodo fin;
	
	
	public ListaDoble()
	{
		inicio = null;
		fin = null;
	}
	
	public void insertarInicio(String dato)
	{
		if(inicio == null)
		{
			inicio = new Nodo(dato, null, null);
			fin = inicio;
		}
		else
		{
			Nodo nuevo = new Nodo(dato, null, inicio);
			inicio.setAnterior(nuevo);
			inicio = nuevo;	
		}	
	}
	
	public void insertarFinal(String dato)
	{
		if(inicio == null)
		{
			fin = new Nodo(dato, null, null);
			inicio = fin;
		}
		else
		{
			Nodo nuevo = new Nodo(dato, null,inicio);
			fin.setSiguiente(nuevo);
			nuevo.setAnterior(fin);
			fin = nuevo;
		}
	}
	
	public void imprimir()
	{
		Nodo actual = inicio;
		
		do {
			System.out.print(" ->"+actual.getDato()+"<-");
			actual = actual.getSiguiente();
			
		}while(actual!=inicio);		
	}
	
	public String extraerInicio()
	{
		String dato = inicio.getDato();
		inicio = inicio.getSiguiente();
		if(inicio!=null)
		{
			inicio.setAnterior(null);
		}
		else
		{
			fin = null;
		}
		return dato;
	}
	
	public String extraerFin()
	{
		String dato = fin.getDato();
		fin = fin.getAnterior();
		if(fin!=null)
		{
			fin.setSiguiente(null);
		}
		else
		{
			inicio = null;
		}
		return dato;
	}
	
	public void mostrarAdelante()
	{
		Nodo actual = inicio;
		
		while(actual != null)
		{
			System.out.println(actual.getDato());
			actual = actual.getSiguiente();		
		}
	}
	
	public void mostrarRegreso()
	{
		Nodo actual = fin;
		
		do {
			System.out.println("->"+actual.getDato()+"->");
			actual = actual.getAnterior();
		}while(actual!= null);
	}
	
	public boolean buscar(String dato)
	{
		Nodo actual = inicio;
		boolean existe =false;
		
		while(actual!= null)
		{
			if(actual.getDato().equals(dato)) {
				existe = true;
			}
			actual = actual.getSiguiente();
		}
		return existe;
	}

}
