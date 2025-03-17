package herencia.ejemplo;

public class FiguraTest {

	public static void main(String[] args) {		
		
		Triangulo t1 = new Triangulo("Azul", 8, 5);
		System.out.println(t1.toString());
		
		Circulo c1 = new Circulo ("Rojo", 5.31, 8);
		System.out.println(c1.toString());
		
		Cuadrado d1 = new Cuadrado ("Amarillo", 5);
		System.out.println(d1.toString());
		
			
		
	}

}
