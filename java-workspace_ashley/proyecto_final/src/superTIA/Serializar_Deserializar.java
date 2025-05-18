package superTIA;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializar_Deserializar {

	  public void guardarObjeto(Object obj, String nombreArchivo) {
	        ObjectOutputStream oos = null;

	        try {
	            oos = new ObjectOutputStream(new FileOutputStream(nombreArchivo));
	            oos.writeObject(obj);
	        } catch (IOException e) {
	            System.err.println("Error al guardar el objeto: " + e.getMessage());
	        } finally {
	            if (oos != null) {
	                try {
	                    oos.close();
	                } catch (IOException ex) {
	                    System.err.println("Error cerrando el stream: " + ex.getMessage());
	                }
	            }
	        }
	    }
	  
	  public Object cargarObjeto(String nombreArchivo) {
	        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
	            return ois.readObject();
	        } catch (IOException | ClassNotFoundException e) {
	            System.err.println("Error al cargar el objeto: " + e.getMessage());
	            return null;
	        }
	    }
	
}
