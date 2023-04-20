/**
 * 
 */
package Logica;



/**
 * @author GonzalezHDanielaA
 *
 */
public class Main {
	
	public static void main(String args []) {
		
		ListaDobleEnteros lista = new ListaDobleEnteros();
		
		lista.insertarInicio(2);
		lista.insertarInicio(5);
		lista.insertarFinal(9);
		lista.insertarInicio(8);
		lista.insertarInicio(1);
		
		
		lista.recorrerAdelante();
		System.out.println("\nDe regreso: ");
		lista.recorrerRegreso();
		
		System.out.println("\nBuscar Dato: ");
		
		int dato =lista.buscarDato(5);
		String cadena = dato!=0?"Encontrado":"No existe";
		System.out.println(cadena);
		
		
		System.out.println("Ordenar Ascendente ");
		
		lista.burbuja(lista.getLista());
		
		System.out.println("Ordenar Descendente: ");
		lista.burbujaDescendente(lista.getLista());
		
	
		
		
	}

}
