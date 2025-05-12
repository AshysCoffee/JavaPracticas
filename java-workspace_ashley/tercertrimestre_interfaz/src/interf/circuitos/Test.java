package interf.circuitos;

public class Test {
	
	public static void main(String[] args) {
		
		double Total=0; //creamos esta variable para sumar todas las intensidades y dar el total
		
		Placa p1 = new Placa ("Placa nº1");
		
		Circuitos c1= new EnSerie (34);
		Circuitos c2= new EnSerie (45);
		Circuitos c3= new EnSerie (100);
		
		Resistencias r1 = new Resistencias (200.0);
		Resistencias r2 = new Resistencias (400.0);
		Resistencias r3 = new Resistencias (500.0);
		Resistencias r4 = new Resistencias (50.0);
		Resistencias r5 = new Resistencias (700.0);
		Resistencias r6 = new Resistencias (100.0);

		
		p1.addCircuito(c1);
		p1.addCircuito(c2);
		p1.addCircuito(c3);
		
		c1.AddResistencia(r1);
		c1.AddResistencia(r2);
		c1.AddResistencia(r3);
		
		c2.AddResistencia(r4);
		c2.AddResistencia(r5);
		
		c3.AddResistencia(r6);
		

		for (Circuitos c: p1.Circuitos) {
			System.out.println(c.toString());
		}
		
		for (Circuitos c: p1.Circuitos) {
			Total=Total+c.CalcularIntensidad();
		}
		
		System.out.printf("Total de intensidades: %.2f ",Total," A");
	}

}
