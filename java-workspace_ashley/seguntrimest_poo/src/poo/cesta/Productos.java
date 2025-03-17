package poo.cesta;

public class Productos {

	private int precio, id;
	private String producto;
	private boolean gluten;
	Sabores sabor;
	private static int codigo=101;
	private static int contadorProductos=0;
	
	public Productos( String producto,int precio, boolean gluten, Sabores sabor) {
		super();
		this.precio = precio;
		this.producto = producto;
		this.gluten = gluten;
		this.sabor = sabor;
		this.id=codigo++;
		nuevoProducto();
		
	}

	public Sabores getSabor() {
		return sabor;
	}

	public void setSabor(Sabores sabor) {
		this.sabor = sabor;
	}

	public static int getCodigo() {
		return codigo;
	}

	public static void setCodigo(int codigo) {
		Productos.codigo = codigo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public boolean isGluten() {
		return gluten;
	}

	public void setGluten(boolean gluten) {
		this.gluten = gluten;
	}

	
	public void nuevoProducto() {
		contadorProductos++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getContadorProductos() {
		return contadorProductos;
	}
	
	

	public String toString(){
		String s="";
		s+=("Producto: "+producto+"---"+sabor+"\n");
		s+=("Precio: "+precio+"€\n");
		s+=("¿Contiene gluten?: "+gluten+"\n");
		s+=("Código de producto: "+id+"\n");
		return s;
	}	

	
}
