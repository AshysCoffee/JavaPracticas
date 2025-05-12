package interf.criterios;

import java.util.Comparator;

public class ComparadorDestino implements Comparator<Vuelo> {

	public int compare(Vuelo o1, Vuelo o2) {
		return o1.getDestino().compareTo(o2.getDestino());
	}

}
