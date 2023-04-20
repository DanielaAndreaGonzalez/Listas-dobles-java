/**
 * 
 */
package Logica;



/**
 * @author GonzalezHDanielaA
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ListaDoble lista = new ListaDoble();
		
		lista.insertarInicio("Martha");
		lista.insertarInicio("Andrea ");
		
		
		lista.insertarFinal("Daniela");
		lista.insertarFinal("Maria");
		
		
		//lista.imprimir();
		lista.mostrarAdelante();
		System.out.println("Eliminando..."+lista.extraerInicio());
		lista.mostrarAdelante();
		System.out.println("######################");
		System.out.println(lista.buscar("Daniela"));

	}

}
