package ejercicioCircuito;

import java.util.ArrayList;

public class Test {
	
	private static ArrayList <Circuitos> Placa =new ArrayList <Circuitos>();
	
	public static void main(String[] args) {
		
		double Total=0; //creamos esta variable para sumar todas las intensidades y dar el total
		
		Circuitos c1= new EnSerie (34);
		Circuitos c2= new EnSerie (45);
		Circuitos c3= new EnSerie (100);
		
		Placa.add(c1);
		Placa.add(c2);
		Placa.add(c3);
		
		c1.AñadirResistencia(200);
		c1.AñadirResistencia(400);
		c1.AñadirResistencia(500);
		
		c2.AñadirResistencia(50);
		c2.AñadirResistencia(700);
		
		c3.AñadirResistencia(100);
		

		for (Circuitos c:Placa) {
			System.out.println(c.toString());
		}
		
		for (Circuitos c:Placa) {
			Total=Total+c.Intensidad_Total();
		}
		
		System.out.println("Total de intensidades: "+Total+" A");
	}

}
