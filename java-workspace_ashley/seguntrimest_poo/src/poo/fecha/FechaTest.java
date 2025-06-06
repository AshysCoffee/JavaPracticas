package poo.fecha;

public class FechaTest {

	public static void main(String[] args) {
		
		Fecha f1 = new Fecha(14, 2, 2025);
		System.out.println(f1.toStringFecha());
		
		f1.setDia(16);
		f1.setMes(9);
		f1.setAnno(1974);
		
		System.out.println(f1.toStringFecha());
		
		Fecha f2 = new Fecha(16, 5, 2003);
		System.out.println(f2.toStringFecha());
		
		Fecha f3 = new Fecha();
		f3.setDia(29);
		f3.setMes(7);
		f3.setAnno(2011);
		
		System.out.println(f3.toStringFecha());
		
		Fecha f4 = new Fecha();
		
		System.out.print("¿Son 14/2/2025 y 16/05/2003 fechas iguales?: ");
		System.out.println(f1.Equals(f2)+"\n");
		
		System.out.print("La fecha actual es: ");
		System.out.println(f4.toFechaSistema());
	}

}
