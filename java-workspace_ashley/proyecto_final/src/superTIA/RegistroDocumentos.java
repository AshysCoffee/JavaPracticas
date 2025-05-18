package superTIA;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class RegistroDocumentos {
	

	public RegistroDocumentos() {}

	public void guardarClientes(List<Cliente> clientes, String nombreArchivo) {
		  
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
	            for (Cliente c : clientes) {
	                writer.write(c.toString());
	                writer.newLine();
	            }
	        } catch (IOException e) {
	            System.err.println("Error al guardar clientes: " + e.getMessage());
	        }
	    }

	 
}
