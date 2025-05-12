package interf.criterios;

import java.util.Comparator;

public class ComparadorNumeroVuelo implements Comparator<Vuelo> {

	public int compare(Vuelo o1, Vuelo o2) {
		return o1.getNumero_vuelo().compareTo(o2.getNumero_vuelo());
	}

}
