package clase_file;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pruebas_ficheros {

	public static void main(String[] args) {
		
		String cadena=" ";
		
		InputStreamReader isr = new InputStreamReader (System.in);
		BufferedReader Teclado = new BufferedReader (isr);
		try {
			cadena = Teclado.readLine();
		} catch (IOException e) {
			e.getMessage();
		}
		
		System.out.println(cadena);
		
		/**hacer actividad 10.3 y 10.7 del libro como prueba 314 (327) y 319 (
		
		//FIleReader fr = new FileReader ("Ruta de archvio)";
		//BufferReader br = new BufferReader (fr); @author ashley **/
		
		System.out.println("\n");
		
		File f = new File ("C:\\Users\\ashle\\Documents\\prueba_fichero_java.txt");
		
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		
		try {
			System.out.println(f.createNewFile());// quiere decir que el archivo con esa ruta ya existe
		} catch (IOException e) {
			e.getMessage();
		}
		
		System.out.println(f.getAbsolutePath());
		
		System.out.println(f.mkdir());
		
		if (f.exists()) {
			System.out.println("El fichero existe!");
		}else{
			System.err.println("El fichero NO existe!");
		}
		
		System.out.println("getName(): " + f.getName());
		System.out.println("getParent(): " + f.getParent());
		System.out.println("length(): " + f.length());
		
		System.out.println("\n");
		
		File f2 = new File ("C:\\Users\\ashle\\Documents\\pikachu.txt");
		
		System.out.println(f2.canRead());
		System.out.println(f2.canWrite());
		
		try {
			System.out.println(f2.createNewFile());// quiere decir que el archivo con esa ruta ya existe
		} catch (IOException e) {
			e.getMessage();
		}
		
		System.out.println(f2.getAbsolutePath());
		
		System.out.println(f2.mkdir());
		
		if (f2.exists()) {
			System.out.println("El fichero existe!");
		}else{
			System.err.println("El fichero NO existe!");
		}
		
		System.out.println("getName(): " + f2.getName());
		System.out.println("getParent(): " + f2.getParent());
		System.out.println("length(): " + f2.length());
	}

}
