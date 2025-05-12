package pruebas_colecciones;

import java.time.LocalDate;
import java.util.*;

public class TestCliente {

	public static void main(String[] args) {
		
		Collection <Cliente> coleccionCliente = new ArrayList<>();
		
		Cliente cliente1 = new Cliente ("111","Marta","12/02/2000");

		coleccionCliente.add(cliente1); //añadimos el elemento
		coleccionCliente.remove(cliente1);// lo eliminamos
		
		coleccionCliente.add(new Cliente ("111", "Marta", "12/02/2000"));
		coleccionCliente.add(new Cliente ("115", "Jorge", "16/03/1999"));
		coleccionCliente.add(new Cliente("112", "Carlos", "01/10/2002"));
		
		System.out.println("Tamanio de la coleccion: "+coleccionCliente.size()+"\n"); //da el tamanio del tamanio
		System.out.println("¿Esta vacio? = "+coleccionCliente.isEmpty()+"\n");//da verdadero o falso si esta vacio
		
		System.out.println("¿Contiene a Jorge? "+coleccionCliente.contains (new Cliente ("115", "Jorge", "16/03/1999"))+"\n"); //pregunta si contiene
		
		System.out.println("¿Contiene el 115? "+coleccionCliente.contains(new Cliente ("115"))+"\n");//pregunta si contiene
		
		System.out.println(coleccionCliente+"\n");
		
		
		Collection<Cliente> otrosClientes = new ArrayList<>(); 
		
		otrosClientes.add(new Cliente ("111", "Marta", "12/02/2000"));//los que ya estaban
		otrosClientes.add(new Cliente ("112", "Carlos", "01/10/2002"));
		
		System.out.println("¿Cuantos elementos hay?"+otrosClientes.size()); //el número de elementos insertados en una colección.
		
		System.out.println("¿Esta vacio?"+otrosClientes.isEmpty());// permite saber si una colección está vacía.
		
		System.out.println(otrosClientes+"\n");
		
		System.out.println("¿Coindicide en elementos? "+coleccionCliente.containsAll(otrosClientes)+"\n"); //al tener los dos elementos en común, dara true
		
		otrosClientes.add(new Cliente ("211", "Ana", "07/12/2001"));//uno diferente

		System.out.println("¿Coindicide en elementos? "+coleccionCliente.containsAll(otrosClientes)+"\n"); // al tener uno diferente saldra false
		
		System.out.println(coleccionCliente.addAll(otrosClientes)+"\n"); //añade todos incluso los que se repiten
		
		System.out.println(coleccionCliente+"\n");
		
		System.out.println(coleccionCliente.remove(new Cliente ("111"))); //eliminamos el cliente con el id "111"
		
		System.out.println(coleccionCliente.removeAll(otrosClientes)+"\n"); //eliminamos todo en la coleccion
		
		
		Iterator<Cliente> it = coleccionCliente.iterator();
		
		System.out.println(it.hasNext()+"\n");// comprueba si hay un elemento siguiente, false si no hay nada, true si hay algo
		
		System.out.println(it.next()+"\n");// si existe un siguiente elemento, nos lo devuelve
		
		while (it.hasNext()) {
			Cliente p = it.next();
			if (p.getFechaNacimiento().compareTo (LocalDate.of (2000, 1, 1)) < 0) {
				it.remove(); /*elimina p, ultimo cliente devuelto por next ()
		¡No usar coleccionClie.remove(p)!*/
			}
		}
		
		for (Cliente c : coleccionCliente) {
			System.out.println(c+"\n");
		}
		
		Object[] t1 = otrosClientes.toArray();
		((Cliente)t1[0]).getNombre(); // devolverá "Ana"
		
		Cliente[] t2 = otrosClientes.toArray(new Cliente [0]);
		System.out.println(t2 [0].getNombre());
		
	}

}
