package interf.figura;

import java.util.ArrayList;

public class Test {

	static ArrayList <FiguraAbstracta> Listado = new ArrayList <FiguraAbstracta>();
	
	public static void main(String[] args) {
		
		FiguraAbstracta c1 = new Circulo (5.0, Colores.ROJO);

		FiguraAbstracta d1 = new Rectangulo (4.0,6.0, Colores.AZUL);
		
		FiguraAbstracta t1 = new Triangulo(Colores.VERDE, 3.0,3.0,3.0);
		
		Listado.add(c1);
		Listado.add(d1);
		Listado.add(t1);
				
		for (FiguraAbstracta f : Listado ) {
			System.out.println(f.toString());
		}
		
		c1.Escalar(2);

		System.out.println("*************");
		
		for (FiguraAbstracta f : Listado ) {
			System.out.println(f.toString());
		}
	}

}
