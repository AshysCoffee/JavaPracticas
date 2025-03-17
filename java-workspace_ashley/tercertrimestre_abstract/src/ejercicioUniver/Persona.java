package ejercicioUniver;

public class Persona {

	private String nombre, direccion;

	public Persona(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDirrecion() {
		return direccion;
	}

	public void setDirrecion(String direccion) {
		this.direccion = direccion;
	}
	
	public String toString() {
		String s="";
		s="Nombre: "+nombre+"\n";
		s="Dirección: "+direccion+"\n";
		return s;
	}
}
