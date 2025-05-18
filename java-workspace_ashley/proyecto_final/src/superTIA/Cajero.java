package superTIA;

public class Cajero extends Empleado{

	private Rol estatus;
	
	public Cajero(int id, String dni, String nombre) throws DatosInvalidosException {
		super(id, dni, nombre);
		this.estatus = Rol.CAJERO;
	}
	
	
	public Rol getEstatus() {
		return estatus;
	}

	public void setEstatus(Rol estatus) {
		this.estatus = estatus;
	}
	

	public String Descripcion() {
		return "Se encargara de la caja, el mantenimiento del mismo y la gestión de pedidos y ventas";
	}
	
	public String toString() {
		return super.toString() + "[ROL = "+this.estatus+"]";
	}


	
	
}
