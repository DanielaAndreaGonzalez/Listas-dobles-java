/**
 * 
 */
package Logica2;

/**
 * @author GonzalezHDanielaA
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Directorio<String> directorio1 = new Directorio<String>("Daniela", "0015", "3104159051", "Calle 12 # 8-37");
		Directorio<String> directorio2 = new Directorio<String>("Andrea", "0016", "3104159051", "Calle 12 # 8-37");
		Directorio<String> directorio3 = new Directorio<String>("Maria", "0017", "3104153807", "Calle 12 # 8-37");
		Directorio<String> directorio4 = new Directorio<String>("Miguel", "0018", "3104153807", "Carrera 23 # 5-43");
		
		ListaDobleDirectorio lista = new ListaDobleDirectorio();
		
		lista.insertarInicio(directorio1);
		lista.insertarInicio(directorio2);
		lista.insertarInicio(directorio3);
		lista.insertarFinal(directorio4);
		
		lista.imprimirAdelante();
		
		System.out.println("De Regreso: ");
		
		lista.imprimirRegreso();
		
		System.out.println();
		System.out.println("Buscar por nombre  --> Daniela");
		Directorio<String> temp = lista.buscarByNombre("Daniela");
		
		System.out.println(temp.toString());
		
		System.out.println("Buscar por código --> 0018" );
		Directorio<String> tem = lista.buscarByCodigo("0018");
		System.out.println(tem.toString());
	}

}
