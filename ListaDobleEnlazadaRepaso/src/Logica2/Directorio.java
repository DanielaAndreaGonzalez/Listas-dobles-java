/**
 * 
 */
package Logica2;

/**
 * @author GonzalezHDanielaA
 *
 */
public class Directorio<T> {
	
	
	private T nombre;
	private T codigo;
	private T telefono;
	private T direccion;
	
	public Directorio(){}
	
	public Directorio(T nombre, T codigo, T telefono, T direccion)
	{
		this.nombre = nombre;
		this.codigo = codigo;
		this.telefono = telefono;
		this.direccion = direccion;			
	}

	public T getNombre() {
		return nombre;
	}
	public void setNombre(T nombre) {
		this.nombre = nombre;
	}
	public T getCodigo() {
		return codigo;
	}
	public void setCodigo(T codigo) {
		this.codigo = codigo;
	}
	public T getTelefono() {
		return telefono;
	}
	public void setTelefono(T telefono) {
		this.telefono = telefono;
	}
	public T getDireccion() {
		return direccion;
	}
	public void setDireccion(T direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Directorio [nombre=" + nombre + ", codigo=" + codigo + ", telefono=" + telefono + ", direccion="
				+ direccion + "]";
	}
	
	
	

}
