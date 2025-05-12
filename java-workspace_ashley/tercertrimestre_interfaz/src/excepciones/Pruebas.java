package excepciones;

public class Pruebas {
	
	private String producto_listado;
	
	
	public Pruebas() {
	}

	

	public Pruebas(String producto_listado) {
		this.producto_listado = producto_listado;
	}



	public boolean ComprobarEdad (int edad) throws Exception{
		
		boolean mayorde18=true;
		
		if (edad < 0 || edad > 99) {
	        throw new ExcepcionEdad("Edad no válida.");
	    }

	    if (edad < 18) {
	        throw new ExcepcionEdad("No es mayor de edad para trabajar.");
	    }
		
		return mayorde18;
	}
	
	public String ComprarProducto(String producto) throws Exception {
       
		if (producto.equals(producto_listado)) {
			return "Producto comprado con éxito.";
		}else{	
			throw new ExcepcionProducto("El producto " + producto + " no está disponible.");
        }
        
    }
	

}
