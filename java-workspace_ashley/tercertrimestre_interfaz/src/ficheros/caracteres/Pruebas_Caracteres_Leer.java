package ficheros.caracteres;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Pruebas_Caracteres_Leer {

	public static void main(String[] args) {

		String texto = "";
		BufferedReader lectura = null;
		
		try {
			lectura = new BufferedReader(new FileReader("C:\\Users\\ashle\\java-workspace_ashley\\tercertrimestre_interfaz\\src\\interf\\figura\\Test.java"));
			String linea = lectura.readLine();
			while (linea != null) { //mientras no llegue al final del archivo
				texto = texto + linea+'\n'; //el cambio de línea hay que insertarlo manualmente
				linea=lectura.readLine();
			}
		}catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		
		System.out.println(texto);


	}

}
