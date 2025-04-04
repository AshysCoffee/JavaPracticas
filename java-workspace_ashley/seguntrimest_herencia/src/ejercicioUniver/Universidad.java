package ejercicioUniver;

import java.util.ArrayList;

public class Universidad {

	public static void main(String[] args) {
		
		ArrayList <Persona> Alumnado = new ArrayList <Persona> ();
		
		Persona e1 = new Estudiante ("Juan Mariano", "Brooklyn 101", "Inge. Electrica", 2);
		Persona e2 = new Estudiante ("Valentina Fernandez", "Chicago 12", "Inge. Electrica", 1);

		Persona p1 = new Profesor ("Daniel Miguel", "San Francisco", "Arquitectura", "Letras");
		Persona p2= new Profesor ("Sofia Palacio", "Luisiana", "Agraria", "Ciencias");
		
		
		Alumnado.add(e1);
		Alumnado.add(e2);
		Alumnado.add(p1);
		Alumnado.add(p2);
		
		for(Persona p: Alumnado) {
			
			System.out.println(p.toString()+"\n");
		}
		
	}

}
