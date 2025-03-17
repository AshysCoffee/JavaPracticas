package correcion_examen_escrito;

public class Test {

	public static void main(String[] args) {
		
		Equipo e = new Equipo ("Sky", "Estados Unidos");
		Ciclista c1 = new Velocista( "Geraint Thomas");
		Ciclista c2 = new Escalador( "Egan Bernal");
		Ciclista c3 = new Contrarrelojista( "Jonathan Castroviejo");
		
		e.AddCiclista(c1);
		e.AddCiclista(c2);
		e.AddCiclista(c3);

		
		c1.setTiempoCarrera(365);
		c2.setTiempoCarrera(385);
		c3.setTiempoCarrera(370);
		
		System.out.println(e);
		
		System.out.println("El tiempo total del equipo es: "+e.SumaTotal()+"\n");
		
		System.out.println(e.ListarCiclistas());
		
		System.out.println(c1.visualizaCiclista());
		System.out.println(c2.visualizaCiclista());
		System.out.println(c3.visualizaCiclista());
	}

}
