package interf.inmobiliaria;

public class Vivienda extends Inmueble implements Alquilable,Vendible {

	private double precioAlquiler;
	private int numHabitaciones;
	private int piso;
	private EstadoConstruccion estado;
	
	
	public Vivienda(String ubicacion, double precio, double metros_cuadrados, int id, 
			int numHabitaciones, int piso, EstadoConstruccion estado) {
		super(ubicacion, precio, metros_cuadrados, id);
		this.numHabitaciones = numHabitaciones;
		this.piso = piso;
		this.estado = estado;
	}
	
	public Vivienda(String ubicacion, double precio, double metros_cuadrados, int id, double precioAlquiler,
			 int numHabitaciones, int piso, EstadoConstruccion estado) {
		super(ubicacion, precio, metros_cuadrados, id);
		this.precioAlquiler = precioAlquiler;
		this.numHabitaciones = numHabitaciones;
		this.piso = piso;
		this.estado = estado;
	}

	public double getPrecioAlquiler() {
		return precioAlquiler;
	}

	public void setPrecioAlquiler(double precioAlquiler) {
		this.precioAlquiler = precioAlquiler;
	}



	public double getPrecioVenta() {
		return super.getPrecio();
	}

	public void setPrecioVenta(double precio) {
		super.setPrecio(precio);
	}



	public int getNumHabitaciones() {
		return numHabitaciones;
	}

	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}



	public int getPiso() {
		return piso;
	}
	
	public void setPiso(int piso) {
		this.piso = piso;
	}



	public EstadoConstruccion getEstado() {
		return estado;
	}
	
	public void setEstado(EstadoConstruccion estado) {
		this.estado = estado;
	}


	public String toString () {
		String s="";
		s+=("Vivienda - ");
		s+=(super.toString());
		s+=("Es una vivienda "+getEstado()+"\n");
		return s;
	}
	
}
