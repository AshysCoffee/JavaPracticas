package herencia.granalmacen;

public class CompraTest{

	public static void main(String[] args) {
		
		Venta venta1 = new Venta(12205547);
		
		Productos Pizza = new Alimentacion (3.50, 365847594, "Pizza Bouitoni", 15, 5, 14);
		Productos Pijama = new Ropa (30, 284689456, "Pijama Dior", "100% algodón");
		Productos ReproductorMP3 = new Electronicos (80, 1973554865, "MP3 Nokia", 8.5);
		
		venta1.agregarProducto(Pizza);
		venta1.agregarProducto(Pijama);
		venta1.agregarProducto(ReproductorMP3);
		
		
	}

}

/* Se desea que la clase venta tenga un método que realice la suma de 3 productos:
una pizza de 3,5 euros, un pijama de 30 euros y un reproductor de mp3 de 80 euros
con un plus de 8,5.*/