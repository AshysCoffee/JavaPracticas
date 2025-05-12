package interf.inmobiliaria;

public class Solar extends Inmueble implements Inter_Superficie, Vendible {

	private TipoSolar zona;

	public Solar(String ubicacion, double precio, double metros_cuadrados, int id, TipoSolar zona) {
		super(ubicacion, precio, metros_cuadrados, id);
		this.zona = zona;
	}

	public TipoSolar getZona() {
		return zona;
	}

	public void setZona(TipoSolar zona) {
		this.zona = zona;
	}
	
	public double PrecioMetroCuadrado () {
		return this.getPrecio()/this.getMetros_cuadrados();
	}

	public double getPrecioVenta() {
		return this.getPrecio();
	}
	
	public String toString () {
		String s="";
		s+=("Solar - ");
		s+=(super.toString());
		s+=("Precio por metro cuadrado: "+PrecioMetroCuadrado()+"\n");
		s+=("Es un solar "+getZona()+"\n");
		return s;
	}
	
}
