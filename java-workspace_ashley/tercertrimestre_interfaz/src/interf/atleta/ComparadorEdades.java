package interf.atleta;

import java.util.Comparator;

public class ComparadorEdades implements Comparator<Atleta>{
	
		public int compare(Atleta a1, Atleta a2) {
			return a1.getEdad()-a2.getEdad();
			
	}


}
