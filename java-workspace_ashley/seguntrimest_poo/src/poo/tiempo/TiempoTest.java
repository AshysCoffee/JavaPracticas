package poo.tiempo;

public class TiempoTest {

	public static void main(String[] args) {
		Tiempo t1 = new Tiempo(11, 10, 01);
		System.out.println(t1.toStringTiempo());
		
		Tiempo t2 = new Tiempo(9, 17);
		System.out.println(t2.toStringTiempo());
		
		Tiempo t3 = new Tiempo(18);
		System.out.println(t3.toStringTiempo());
		
		Tiempo t4 = new Tiempo(12, 31, 69);
		System.out.println(t4.toStringTiempo());
		
		Tiempo t5 = new Tiempo(9, 63);
		System.out.println(t5.toStringTiempo());
		
		Tiempo t6 = new Tiempo(-5);
		System.out.println(t6.toStringTiempo());
	}

}
