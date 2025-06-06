package superTIA;

public class Encargado extends Empleado{

	private Rol estatus;
	
	public Encargado(int id, String dni, String nombre) throws DatosInvalidosException {
		super(id, dni, nombre);
		this.estatus = Rol.ENCARGADO;
	}

	public Rol getEstatus() {
		return estatus;
	}

	public void setEstatus(Rol estatus) {
		this.estatus = estatus;
	}
	
		public String Descripcion() {
		return "Revisa y gestiona almacen, realizar reclamaciones y entrega las nóminas.";
	}

	public String toString() {
		return super.toString() + "[ROL = "+this.estatus+"]";
	}



}
