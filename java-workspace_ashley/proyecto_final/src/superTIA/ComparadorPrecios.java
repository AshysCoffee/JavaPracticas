package superTIA;

import java.util.Comparator;

public class ComparadorPrecios implements Comparator<Producto>{

	public int compare(Producto o1, Producto o2) {
		return (int) (o1.getPrecio()-o2.getPrecio());
	}

}
