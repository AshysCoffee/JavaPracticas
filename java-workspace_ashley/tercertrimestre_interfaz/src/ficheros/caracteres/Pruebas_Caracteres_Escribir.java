package ficheros.caracteres;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Pruebas_Caracteres_Escribir {

	public static void main(String[] args) {

		BufferedWriter fichero = null;
		try {
			fichero = new BufferedWriter(new FileWriter("Fichero_Ejercicio2.txt"));
			String cad = "Escribe un fichero de caracteres desde tu programa java"; //primera línea
			
			fichero.write(cad);
			
			cad= ", linea a linea."; //segunda linea
			fichero.newLine();
			fichero.write(cad); 
			
			cad= "Ejercicio 2"; //tercera linea
			fichero.newLine();
			fichero.write(cad);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
