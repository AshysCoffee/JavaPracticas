package poo.cesta;

public class CestaNavidad {

	private Cliente cliente;
	private Productos producto;
	private String nombre_cesta;
	private int TotalCompra;
	private static int idCesta=10001;
	private Productos array [] = new Productos [20];



	public CestaNavidad(String nombre_cesta, Cliente cliente) {
		this.nombre_cesta = nombre_cesta;
		this.cliente = cliente;
	}


	public static int getIdCesta() {
		return idCesta;
	}


	public String getNombre_cesta() {
		return nombre_cesta;
	}


	public void setNombre_cesta(String nombre_cesta) {
		this.nombre_cesta = nombre_cesta;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Productos getProducto() {
		return producto;
	}


	public void setProducto(Productos producto) {
		this.producto = producto;
		
	}

	public void addProducto(Productos producto) {
		for (int i=0; i<array.length; i++)	{
			if (array[i]==null && (TotalCompra+producto.getPrecio()<100)) {
				array[i]=producto;
				break;
			}else{
				if (TotalCompra+producto.getPrecio()>100) {
					array[i]=null;
					System.out.println("No puede añadir más producto, ya que el precio total superan los 100€\n\n");
					break;
				}
			}
		}
		
		TotalCompra=0;
	    for (int i = 0; i < array.length; i++) {
	        if (array[i] != null) { // Evitar error por valores nulos
	            TotalCompra += array[i].getPrecio();
	        }
	    }
	}
	
	

	public void deleteLProducto(Productos producto) {
		for (int i=0; i<array.length; i++) {
			if (array[i]==producto) {
				array[i]=null;
				TotalCompra=TotalCompra-producto.getPrecio();
				break;
			}		
		}
	}



	public String listProductos() {
		String s="";
		for (int i=0; i<array.length; i++) {
			if (array[i]!=null) {
				s+=((array[i].toString()));
				s+=("\n\n");
			}
		}
		return s;
	}

	public boolean AptoCeliaco() {
		for (int i=0; i<array.length; i++) {
			if (array[i]!=null && array[i].isGluten()) {
				return false; // Si encontramos un producto con gluten, la cesta no es apta
			}
		}
		return true; // Si ningún producto tiene gluten, la cesta es apta
	}


	public String toStringParticular () {
		String s="";
		s+=(nombre_cesta+"\n");
		s+=(cliente.toStringParticular()+"\n");
		s+=(listProductos()+"\n");
		s+=("¿Es apto para celíacos? "+AptoCeliaco()+"\n");
		s+=("El total de la compra es: "+TotalCompra+"\n");
		return s;
	}

	public String toStringEmpresa () {
		String s="";
		s+=(nombre_cesta+"\n");
		s+=(cliente.toStringEmpresa()+"\n");
		s+=(listProductos()+"\n");
		s+=("¿Es apto para celíacos? "+AptoCeliaco()+"\n");
		s+=("El total de la compra es: "+TotalCompra+"euros.\n");
		return s;
	}

}	

