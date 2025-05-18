package superTIA;

import java.io.Serializable;
import java.time.LocalDate;

@SuppressWarnings("serial")
public class ProductoBio extends Producto implements Bio, Serializable{

	public ProductoBio(int id, int stock, String nombre, double precio, Categoria tipo, LocalDate fecha_caducidad)
			throws DatosInvalidosException {
		super(id, stock, nombre, precio+0.54, tipo, fecha_caducidad);
	}

	@Override
	public boolean PlusBio() {
		return true;
	}

	public String toString () {
		return super.toString()+"[Precio = "+getPrecio()+"€]\n";
	}


	
}
