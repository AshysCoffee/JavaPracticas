package herencia.granalmacen;

public class Productos {

	private double cod_barras, precio;
	private String nombre;
	
	
	public Productos(double precio, double cod_barras, String nombre) {
		this.precio=precio;
		this.cod_barras = cod_barras;
		this.nombre = nombre;
	}
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getCod_barras() {
		return cod_barras;
	}
	public void setCod_barras(double cod_barras) {
		this.cod_barras = cod_barras;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

	public String toString() {
		String s="";
		s+=(nombre+"\n");
		s+=(cod_barras+"\n");
		return s;
	}

}

/*Un gran almacén se dedica a la venta de productos de alimentación, ropa y electrónica.
Cada producto se caracteriza por un precio, un nombre y un código de barras. Los
productos de alimentación tiene a su vez una fecha de caducidad (se puede crear con
enteros para el día, el mes y la hora). Los productos electrónicos tienen un plus adicional por 
ser tener todos 3 años de garantía y los productos de ropa tienen como característica el material 
en que han sido elaborados (sólo el material principal). El almacén realiza ventas, cada venta puede estar 
formada un código de venta y por varios productos. 

Se desea:

1. Realizar un diagrama donde se vean las relaciones entre clases, junto a los atributos
y métodos de cada una.
2. Se desea que la clase venta tenga un método que realice la suma de 3 productos:
una pizza de 3,5 euros, un pijama de 30 euros y un reproductor de mp3 de 80 euros
con un plus de 8,5.
3. Implementar todas las clases con sus atributos y métodos.
4. Ejecutar el ejemplo del apartado 2 para ver que precio da la suma de la compra.
5. Hacer un string tipo tickets*/