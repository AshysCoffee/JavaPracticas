package ejercicio_PruebaFigura;

import java.util.ArrayList;

public class Test {

	static ArrayList <FiguraAbstracta> Listado = new ArrayList <FiguraAbstracta>();
	
	public static void main(String[] args) {

		FiguraAbstracta t1 = new Triangulo(2.12, 5.4, Colores.AMARILLO, 5.4,6.7, 12.0,6.0,8.0);
		
		FiguraAbstracta c1 = new Circulo (9.0,1.2,3.4,9.1, Colores.ROJO);

		FiguraAbstracta d1 = new Cuadrado (11.0 , 5.33, 7.5, Colores.NARANJA);

		
		Listado.add(t1);
		Listado.add(c1);
		Listado.add(d1);
		
		for (FiguraAbstracta f : Listado ) {
			System.out.println(f.toString());
		}
		

	}

}
