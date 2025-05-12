package interf.inmobiliaria;

public class Local_Comercial extends Inmueble implements Inter_Construccion, Alquilable{

	private EstadoConstruccion estado;
	
	
	public Local_Comercial(String ubicacion, double precio, double metros_cuadrados, int id,
			EstadoConstruccion estado) {
		super(ubicacion, precio, metros_cuadrados, id);
		this.estado = estado;
	}

	public EstadoConstruccion getEstado() {
		return estado;
	}

	public void setEstado(EstadoConstruccion estado) {
		this.estado = estado;
	}


	public double precioPorMetroCuadrado() {
		return this.getPrecio()/this.getMetros_cuadrados();
	}

	public double getPrecioAlquiler() {
		return this.getPrecio();
	}
	
	public String toString () {
		String s="";
		s+=("Local Comercial - ");
		s+=(super.toString());
		s+=("Precio por metro cuadrado: "+precioPorMetroCuadrado()+"\n");
		s+=("Es un local de "+getEstado()+"\n");
		return s;
	}

}
