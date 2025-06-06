package poo.biblioteca;

import poo.libro.Libro;
import poo.persona.Persona;

public class BibliotecaTest {

	public static void main(String[] args) {
		Biblioteca b1 = new Biblioteca ("IES Barrio Simancas", "Tecnológico");
		Persona p1 = new Persona ("Rebecca","Yarros");
		Libro l1 = new Libro("Cien años de soledad", p1, "Planeta", "9788408297079");
		Libro l2 = new Libro("Rayuela", p1 ,"Hidra" ,"9788410163676");
		Libro l3 = new Libro("La Tia Julia y el escribidor", p1 ,"EL Mundo" ,"9788410163676");
		
		b1.setLibro(l1);
		b1.addLibro(l1);
		
		b1.setLibro(l2);
		b1.addLibro(l2);
		
		b1.setLibro(l3);
		b1.addLibro(l3);
		
		System.out.println(b1.toStringBiblioteca());
		System.out.println(b1.listLibro());
		
		
	}

}
