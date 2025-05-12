package excepciones;

public class Test {

	public static void main(String[] args) {

		Pruebas p1 = new Pruebas ();
		Pruebas p2 = new Pruebas ("Salchichas");
		
		try {
			System.out.println(p1.ComprobarEdad(-1));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(p1.ComprobarEdad(22));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(p2.ComprarProducto("Patatas"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(p2.ComprarProducto("Salchichas"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

} 
