package interf.inmobiliaria;

public class Construccion extends Inmueble {

	  private EstadoConstruccion estado;

	  
	public Construccion(String ubicacion, double precio, double metros_cuadrados, int id, EstadoConstruccion estado) {
		super(ubicacion, precio, metros_cuadrados, id);
		this.estado = estado;
	}


	public EstadoConstruccion getEstado() {
		return estado;
	}


	public void setEstado(EstadoConstruccion estado) {
		this.estado = estado;
	}
	
	public String toString () {
		String s="";
		s+=(super.toString());
		s+=("Esta en estado: "+getEstado());
		return s;
	}
	

}
