package poo.contador;

public class ContadorTest {

	public static void main(String[] args) {
		Contador c1 = new Contador (5);
		c1.SumaUnitaria();
		System.out.println(c1.toString());
		
		Contador c2 = new Contador (8);
		c2.RestaUnitaria();
		System.out.println(c2.toString());
		
		Contador c3 = new Contador (5);
		c3.SumaModif(3);
		System.out.println(c3.toString());
		
		Contador c4 = new Contador (11);
		c4.RestaModif(4);
		System.out.println(c4.toString());
		
		c1.Reiniciar();
		System.out.println(c1.toString());

	}

}
