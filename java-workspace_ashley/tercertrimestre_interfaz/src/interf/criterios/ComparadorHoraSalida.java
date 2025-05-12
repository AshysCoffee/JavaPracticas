package interf.criterios;

import java.util.Comparator;

public class ComparadorHoraSalida implements Comparator<Vuelo> {

	public int compare(Vuelo o1, Vuelo o2) {
		return o1.getSalida().compareTo(o2.getSalida());
	}

}
