//Autor: Ashley Leon Espinoza
//Fecha: 25/02/2025


package prueba_arraylist;

import java.util.ArrayList;

public class GranjaTest{
	
	private static ArrayList <Animal> Granja = new ArrayList<Animal>();
	
public static void main(String[] args) {
	
	
	Animal a1 = new Perro ("Cody", 4, "07/10/2024" ,2020, "Nacho Iglesias", "Pomerania", "Mixto");
			
	Animal a2 = new Perro ("Zac", 1,"24/12/2024" , 2023, "Nacho Iglesias", "Pomerania", "Mixto");
	
	Animal a3 = new Perro ("Claudia",2 ,"22/04/2024" , 2022, "Nacho Iglesias" , "Pitbull", "Raza Pura");
	Animal a4 = new Gato ("Whiskers", 8, "30/06/2024" , 2016, 0, 0 , "Clauida Neruda" , "Marron", "America");
	
	Animal a5 = new Gato ("Isabel", 5,"01/09/2024" , 2019, 0, 0 , "Clauida Neruda" , "Blanco", "Islandia");
	
	Granja.add(a1);
	Granja.add(a2);
	Granja.add(a3);
	Granja.add(a4);
	Granja.add(a5);
	
	System.out.println(Granja.contains(a2));
	
	System.out.println(Granja.isEmpty());
	
	System.out.println(Granja.size());
	
	System.out.println(Granja.toString()+"\n\n\n");
	
	System.out.println(Granja.removeFirst());
	
	
	}
}

