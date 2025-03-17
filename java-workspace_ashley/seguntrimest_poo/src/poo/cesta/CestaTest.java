package poo.cesta;

public class CestaTest {

	public static void main(String[] args) {
		
		Productos Jamon_Serrano= new Productos("Jamón Serrano",8,false, Sabores.SALADO);
		Productos Lata_Foie= new Productos("Lata de foie gras",10,true, Sabores.SALADO);
		Productos Turron= new Productos("Turrón de almendras",5,true, Sabores.DULCE);
		Productos Mazapan= new Productos("Caja de mazapán",8,true, Sabores.DULCE);
		Productos Sidra= new Productos("Botella de sidra",8,false, Sabores.BEBIDA);
		Productos Cava= new Productos("Botella de cava", 15, false, Sabores.BEBIDA);
		
		Cliente cl1 = new Cliente ("Ashley", "León Espinoza", "0123456789P", TipoCesta.PARTICULAR);
		Cliente cl2 = new Cliente ("Ashley", "León Espinoza","Amazon", "0123456789P", TipoCesta.PARTICULAR);
		
		CestaNavidad c1 = new CestaNavidad("Regalo de Oficina", cl1);
		
		
		c1.addProducto(Jamon_Serrano);
		c1.addProducto(Lata_Foie);
		c1.addProducto(Lata_Foie);
		c1.addProducto(Mazapan);
		c1.addProducto(Mazapan);
		c1.addProducto(Mazapan);
		c1.addProducto(Sidra);
		
		
		System.out.println(c1.toStringParticular());
		
		System.out.println("\n------------------------\n");
		
		CestaNavidad c2 = new CestaNavidad("Regalo de Oficina", cl2);
		
		
		c2.addProducto(Jamon_Serrano);
		c2.addProducto(Turron);
		c2.addProducto(Turron);
		c2.addProducto(Turron);
		c2.addProducto(Turron);
		c2.addProducto(Turron);
		c2.addProducto(Cava);
		c2.addProducto(Cava);
		c2.addProducto(Cava);
		
		
		System.out.println(c2.toStringParticular());
		
	}	

}
