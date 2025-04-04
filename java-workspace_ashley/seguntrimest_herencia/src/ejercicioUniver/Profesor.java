package ejercicioUniver;

public class Profesor extends Persona{

	private String departamento, categoria;

	public Profesor(String nombre, String direccion, String departamento, String categoria) {
		super(nombre, direccion);
		this.departamento = departamento;
		this.categoria = categoria;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public String toString() {
		String  s="";
		s+=super.toString();
		s+="Departamento: "+departamento+"\n";
		s+="Categoria: "+categoria+"\n";
		return s;
	}
	
}
