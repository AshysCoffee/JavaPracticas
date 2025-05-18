package superTIA;

public class Reponedor extends Empleado {

	private Rol estatus;
	
	public Reponedor(int id, String dni, String nombre) throws DatosInvalidosException {
		super(id, dni, nombre);
		this.estatus = Rol.REPONEDOR;

	}

	
	public Rol getEstatus() {
		return estatus;
	}

	public void setEstatus(Rol estatus) {
		this.estatus = estatus;
	}
	
	public String Descripcion() {
		return "Repone y contena el almacén, recibe los cargamentos y comprueba fechas de caducidad";
	}
	
	public String toString() {
		return super.toString() + "[ROL = "+this.estatus+"]";
	}

}
