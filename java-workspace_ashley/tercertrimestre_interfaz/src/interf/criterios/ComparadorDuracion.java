package interf.criterios;

import java.util.Comparator;

public class ComparadorDuracion implements Comparator<Vuelo> {

	public int compare(Vuelo o1, Vuelo o2) {
		return o1.getDuracion()-o2.getDuracion();
	}

}
