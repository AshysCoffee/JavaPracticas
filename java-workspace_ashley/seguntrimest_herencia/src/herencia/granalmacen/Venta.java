package herencia.granalmacen;

import java.util.ArrayList;

public class Venta {
	
	    private double codigoVenta;
	    private ArrayList <Productos> productos;

	    public Venta(double codigoVenta) {
	        this.codigoVenta = codigoVenta;
	        this.productos = new ArrayList<>();
	    }

	    
	    public double getCodigoVenta() {
			return codigoVenta;
		}

		public void setCodigoVenta(double codigoVenta) {
			this.codigoVenta = codigoVenta;
		}


		public void agregarProducto(Productos p) {
	        productos.add(p);
	    }

	    public double calcularTotal() {
	        double total = 0;
	        for (Productos cobrado : productos) {
	            total += cobrado.getPrecio();
	        }
	        return total;
	    }
	
}
