package herencia.granalmacen;

public class Ropa extends Productos {
	
	private String material;

	public Ropa(double precio, double cod_barras, String nombre, String material) {
		super(precio, cod_barras, nombre);
		this.material=material;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	

	public String toString () {
		String s="";
		s+=("Ropa:\n");
		s+=(super.toString()+"\n");
		s+=(getPrecio()+"\n");
		s+=(material+"\n");
		return s;
	}

}
