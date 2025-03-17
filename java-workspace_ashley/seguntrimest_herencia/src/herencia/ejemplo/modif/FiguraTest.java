package herencia.ejemplo.modif;

import java.util.ArrayList;

public class FiguraTest {

	public static void main(String[] args) {		
		
		ArrayList <Figura> listaFig = new ArrayList<Figura>();
		
		Figura t1 = new Triangulo("Amarillo", 8, 5);
		
		Figura c1 = new Circulo ("Rojo", 5.31, 8);
		 
		Figura d1 = new Cuadrado ("Azul", 18);
		
		Figura t2 = new Triangulo("Naranja", 1, 2);
		
		Figura c2 = new Circulo ("Marron", 20, 4);
		
		Figura d2 = new Cuadrado ("Cian", 6);
		
		Figura t3 = new Triangulo("Verde", 12, 7);
		
		Figura c3 = new Circulo ("Magenta", 8.53, 1);
		
		Figura d3 = new Cuadrado ("Lila", 9);
		
			
		listaFig.add(t1);
		listaFig.add(c1);
		listaFig.add(d1);
		listaFig.add(t2);
		listaFig.add(c2);
		listaFig.add(d2);
		listaFig.add(t3);
		listaFig.add(c3);
		listaFig.add(d3);
		
		double totalArea=0;
		
		for (Figura figura : listaFig) { // osea es (tipo variable(es como el i del array normal) : array)
			
			
			if (figura instanceof Triangulo) {
				System.out.println(((Triangulo)figura).toString());
				System.out.println(((Triangulo)figura).colorPrimario());
				
				totalArea+=((Triangulo)figura).Area();
			}
			
			if (figura instanceof Cuadrado) {
				System.out.println(((Cuadrado)figura).toString());
				System.out.println(((Cuadrado)figura).masAltoqueTu());
				
				totalArea+=((Cuadrado)figura).Area();
			}
			
			if (figura instanceof Circulo) {
				System.out.println(((Circulo)figura).toString());
				System.out.println(((Circulo)figura).Circular());
				
				totalArea+=((Circulo)figura).Area();
			}
		}
		
		System.out.println("Total de area: " + totalArea);
	}
}
