package pruebas_list;

import java.util.ArrayList;
import java.util.List;

public class Main_Lista {

	public static void main(String[] args) {
		
		List <Integer> listaEnteros = new ArrayList<> ();
		
		listaEnteros.add(3);
		listaEnteros.add(1);
		listaEnteros.add(-2);
		listaEnteros.add(0);
		listaEnteros.add(3);
		listaEnteros.add(7);
		
		listaEnteros.get(2); //devuelve el elemento que ocupa el lugar indice en la lista

		Integer y = listaEnteros.set (3, 10);
		System.out.println("y: "+ y);
		System.out.println(listaEnteros); //guarda el elemento elem en la posición indice, 
											//machacando el valor que hubiera previamente en esa posición, que es devuelto.

		
		listaEnteros.add(3, 5);
		System.out.println(listaEnteros); /*inserta el valor elem en la posición indice. Todos
											los elementos que ocupaban una posición igual o mayor que indice, se desplazan
												una posición hacia el final de la lista, para dejar hueco al nuevo elemento. */

		
		ArrayList<Integer> otrosEnteros = new ArrayList<>();
		otrosEnteros.add (20);
		otrosEnteros.add (30);
		otrosEnteros.add (40);

		
		listaEnteros.addAll(2, otrosEnteros);
		System.out.println(listaEnteros); /*inserta todos los
											elementos de la colección c, en el mismo orden que tengan, en la lista que invoca
											al método, empezando por el lugar indice y desplazando hacia el final todos los
											elementos de la lista original a partir de indice, incluido este,*/


		listaEnteros.remove (Integer.valueOf(5));
		/*No será interpretada como que queremos eliminar un elemento Integer con valor 5 de
		la lista, sino el elemento con índice 5, es decir, el elemento de valor -2, caso de que quisiéramos 
		eliminar un elemento Integer cuyo valor es 5, escribiríamos*/
		
		
		listaEnteros.indexOf(y);//devuelve el índice de la primera ocurrencia de ob en la lista. Si no está, devuelve-1.

		listaEnteros.equals(otrosEnteros); /*compara dos listas, tanto si las dos son
ArrayList como si son LinkedList, o una de cada, y devuelve true si ambas
tienen exactamente los mismos elementos, incluidas las repeticiones, en el mismo
orden.*/
		
		
		
	}

}
