package interf.inmobiliaria;

public class Superficie extends Inmueble implements Inter_Superficie {

	public Superficie(String ubicacion, double precio, double metros_cuadrados, int id) {
		super(ubicacion, precio, metros_cuadrados, id);
		
	}


	public double PrecioMetroCuadrado () {
		return this.getPrecio()/this.getMetros_cuadrados();
	}
	
	public String toString () {
		String s="";
		s+=(super.toString());
		s+=(PrecioMetroCuadrado());
		return s;
	}
	

}
