package poo.atleta;

public class AtletaTest {

	public static void main(String[] args) {
		Atleta atleta1 = new Atleta ("Alejandro Perlaza", 9.55);
		Atleta atleta2 = new Atleta ("Anthony Zambrano", 9.28);
		Atleta atleta3 = new Atleta ("Diego Palomeque", 9.53);
		Atleta atleta4 = new Atleta ("Gilmar Herrera", 9.29);
		
		atleta1.Correr400Metros();
		atleta2.Correr400Metros();
		atleta3.Correr400Metros();
		atleta4.Correr400Metros();
		
		System.out.println(atleta1.toString());
		System.out.println(atleta2.toString());
		System.out.println(atleta3.toString());
		System.out.println(atleta4.toString());
	}

}
