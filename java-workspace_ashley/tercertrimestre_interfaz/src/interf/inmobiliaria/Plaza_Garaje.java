package interf.inmobiliaria;

public class Plaza_Garaje extends Inmueble implements Inter_Superficie, Alquilable {

	private TipoGaraje tipo;
	
	public Plaza_Garaje(String ubicacion, double precio, double metros_cuadrados, int id, TipoGaraje tipo) {
		super(ubicacion, precio, metros_cuadrados, id);
		this.tipo = tipo;
	}

	public TipoGaraje getTipo() {
		return tipo;
	}

	public void setTipo(TipoGaraje tipo) {
		this.tipo = tipo;
	}

	public double getPrecioAlquiler() {
		return this.getPrecio();
	}

	public double PrecioMetroCuadrado () {
		return this.getPrecio()/this.getMetros_cuadrados();
	}
	
	public String toString () {
		String s="";
		s+=("Plaza de Garaje - ");
		s+=(super.toString());
		s+=("Es una plaza de garaje "+getTipo()+"\n");
		return s;
	}
}
