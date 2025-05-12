package interf.criterios;

import java.time.LocalTime;
import java.util.Collections;
import java.util.LinkedList;

public class VueloTest {
	
	public static void main(String[] args) {
	
	LinkedList <Vuelo> Vuelos= new LinkedList <Vuelo> ();
		
	LocalTime Salida1 = LocalTime.of(14, 30);
	Vuelo v1 = new Vuelo ("FOEWIJRO324", "Espania","Quito", Salida1 , 651);
	
	 LocalTime salida2 = LocalTime.of(9, 45);
     Vuelo v2 = new Vuelo("JASDKL3843", "Francia", "Mexico", salida2, 720);

     LocalTime salida3 = LocalTime.of(22,10); // usando parse
     Vuelo v3 = new Vuelo("ZXCVB987", "Colombia", "Argentina", salida3, 320);

     LocalTime salida4 = LocalTime.of(6, 15);
     Vuelo v4 = new Vuelo("XY1234", "Lima", "Bogota", salida4, 180);
  
     LocalTime salida5 = LocalTime.of(11, 50);
     Vuelo v5 = new Vuelo("ABC567", "Nueva York", "Toronto", salida5, 95);
     
     LocalTime salida6 = LocalTime.of(17, 25);
     Vuelo v6 = new Vuelo("MNO890", "Madrid", "Roma", salida6, 135);
     
     LocalTime salida7 = LocalTime.of(23,00);
     Vuelo v7 = new Vuelo("UVW999", "Santiago", "Montevideo", salida7, 210);
     
     
     Vuelos.add(v1);
     Vuelos.add(v2);
     Vuelos.add(v3);
     Vuelos.add(v4);
     Vuelos.add(v5);
     Vuelos.add(v6);
     Vuelos.add(v7);
     
     /*for (Vuelo v:Vuelos){
    	 System.out.println(v.toString());
    	 System.out.println("**************");
     }*/
     
     Collections.sort(Vuelos, new ComparadorDestino());
     
     System.out.println("Ordenados por destino:\n-----------");
     for (Vuelo v:Vuelos){
    	 System.out.println(v.toString());
    	 System.out.println("**************");
     }
     
     System.out.println("\n\n\n");
     
     Collections.sort(Vuelos, new ComparadorDuracion());
     
     System.out.println("Ordenados por duracion:\n----------");
     for (Vuelo v:Vuelos){
    	 System.out.println(v.toString());
    	 System.out.println("**************");
     }

     System.out.println("\n\n\n");
     
     Collections.sort(Vuelos, new ComparadorHoraSalida());

     System.out.println("Ordenados por hora de salida:\n---------");
     for (Vuelo v:Vuelos){
    	 System.out.println(v.toString());
    	 System.out.println("**************");
     }

     System.out.println("\n\n\n");
     
     Collections.sort(Vuelos, new ComparadorNumeroVuelo());

     System.out.println("Ordenados por número de vuelo:\n----------");
     for (Vuelo v:Vuelos){
    	 System.out.println(v.toString());
    	 System.out.println("**************");
     }

     System.out.println("\n\n\n");
     
     Collections.sort(Vuelos, new ComparadorOrigen());

     System.out.println("Ordenados por origen:\n---------");
     for (Vuelo v:Vuelos){
    	 System.out.println(v.toString());
    	 System.out.println("**************");
     }
     
	}
}
