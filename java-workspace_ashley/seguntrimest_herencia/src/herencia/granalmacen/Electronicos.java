package herencia.granalmacen;

public class Electronicos extends Productos{

	private int garantia=3;
	private double plus;

	public Electronicos(double precio, double cod_barras, String nombre, double plus) {
		super(precio, cod_barras, nombre);
		this.plus=plus;
		this.garantia=3;
	}
	
	public double getPrecioElectronica() {
		return super.getPrecio()+this.plus;
	}

	public int getGarantia() {
		return garantia;
	}
	
	public String toString () {
		String s="";
		s+=("Electrónica:\n");
		s+=(super.toString()+"\n");
		s+=(getPrecio()+"\n");
		return s;
	}
	
}
