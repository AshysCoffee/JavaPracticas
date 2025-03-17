package ejercicioCircuito;

import java.util.ArrayList;

public class Test {
	
	private static ArrayList <Circuitos> Placa =new ArrayList <Circuitos>();
	ArrayList <Resistencias> Resistencias = new ArrayList<Resistencias>();
	
	public static void main(String[] args) {
		
		double Total=0; //creamos esta variable para sumar todas las intensidades y dar el total
		
		Circuitos c1= new EnSerie (34);
		Circuitos c2= new EnSerie (45);
		Circuitos c3= new EnSerie (100);
		
		Placa.add(c1);
		Placa.add(c2);
		Placa.add(c3);
		
		/*c1.AddResistencia(200);
		c1.AddResistencia(400);
		c1.AddResistencia(500);
		
		c2.AddResistencia(50);
		c2.AddResistencia(700);
		
		c3.AddResistencia(100);*/
		

		for (Circuitos c:Placa) {
			System.out.println(c.toString());
		}
		
		for (Circuitos c:Placa) {
			Total=Total+c.CalcularIntensidad();
		}
		
		System.out.printf("Total de intensidades: %.2f ",Total," A");
	}

}
